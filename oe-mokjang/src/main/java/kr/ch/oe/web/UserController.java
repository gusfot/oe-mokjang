package kr.ch.oe.web;	

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import kr.ch.oe.common.Paging;
import kr.ch.oe.model.Department;
import kr.ch.oe.model.SessionUserVO;
import kr.ch.oe.model.User;
import kr.ch.oe.service.DepartmentService;
import kr.ch.oe.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/user")
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private DepartmentService deptService;
	
	/**
	 * 사용자 목록조회
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = { "/list.oe" }, method = RequestMethod.GET)
	public ModelAndView getUserList(
					HttpSession session)throws Exception {
		
		ModelAndView mav = new ModelAndView();

		SessionUserVO sessionUserVO =(SessionUserVO)session.getAttribute("sessionUserVO");
		String farmmerId = sessionUserVO.getUserId();
		System.out.println(farmmerId);
		Paging<User>pagingList =  userService.getFarmUserList(farmmerId);
		
		mav.addObject("pageList", pagingList);
		mav.setViewName("user/list");
		return mav;
		
	}
	/**
	 * 사용자 한명의 정보조회
	 * @param userId
	 * @return
	 */
	@RequestMapping(value={"/detail.oe"},method=RequestMethod.GET)
	public ModelAndView detailUserInfo(
				@RequestParam(value="userId")String userId
			) {
		ModelAndView mav = new ModelAndView();
		User user = userService.getUser(userId);
		String birth = user.getBirth();
		StringBuffer sb = new StringBuffer();
		sb.append(birth);
		sb.insert(4, "-");
		sb.insert(7, "-");
		mav.addObject("birth", sb);
		mav.addObject("user", user);
		mav.setViewName("user/detail");
		return mav;
	}
	
	/**
	 * 사용자등록 폼 화면 반환
	 * @return
	 */
	@RequestMapping(value = { "/registForm.oe"}, method = RequestMethod.GET)
	public ModelAndView registerUserForm() {
		
		ModelAndView mav = new ModelAndView();
		Date date = new java.util.Date();
		
		// FIXME : 교회 등록 날짜는 화면에서 입력 받아 처리해야 할 듯..
		//RE: 일단 직접입력할수있습니다 편의상 입력받는 날로 셋팅만해봤슴돠~!
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd"); 
		String regdate = sd.format(date);
		List<Department>deptList= deptService.getDeptList(1,1,"").getItems();
		mav.addObject("deptList", deptList);
		mav.addObject("regdate", regdate);
		mav.setViewName("user/regist");
		
		return mav;
	}
	
	// FIXME : 시간이 좀 있으면 ajax 처리하자
	/**
	 * 사용자 등록
	 * @param gyogu
	 * @param user
	 * @return
	 */
	@RequestMapping(value = { "/regist.oe" }, method = RequestMethod.POST)	
		public @ResponseBody boolean registerUser(
				@RequestParam(value="gyogu", required=true)long gyogu,
				@ModelAttribute User user
				) {
			// FIXME : 2015-01-01
			//RE: 넵알겠슴돠!
			String rebirth = user.getBirth().replace("-","");
			String reRegDate= user.getRegDt().replace("-","");
			String reRegds=user.getAddr().concat("");
			Department dept = deptService.getDepatment(gyogu);
			user.setBirth(rebirth );
			user.setRegDt(reRegDate);
			user.setDeptSeq(dept.getDeptSeq());
			user.setDepartment(dept);
			
			return userService.regist(user);
		}
	
	// FIXME : Sheep이란 단어보다는 공통적인 User를 사용하는게 어때?
	/**
	 *  목장원 관리에서 목장원을 선택 등록
	 * @return
	 */
	@RequestMapping(value = { "/registSheepForm.oe" }, method = RequestMethod.GET)
	public String registerSheepForm(
			) {
		return "user/registSheep";
	}
	/**
	 * 아이디 중복확인
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = { "/overlapUserId.oe" }, method = RequestMethod.GET)
	public @ResponseBody boolean overlaUserId(
			@RequestParam(value="userId") String userId
			) {
		// FIXME checkId라는 변수가 다시 사용하지 않으면 변수에 담지 않고 바로 return 하는게 좋을거 같아
		// FIXME return userService.overlapUserId(userId);
		//RE:넵 알겠슴돠!
		System.out.println("ovelrapUaserId"+userId);
		return userService.overlapUserId(userId);
	}
	
	// FIXME : 시간이 좀 있으면 ajax 처리하자
	/**
	 * 사용자 정보수정
	 * @param user
	 * @return
	 */
	@RequestMapping(value = { "/modify.oe" }, method = RequestMethod.POST)
	public @ResponseBody boolean modifyUser(
			@ModelAttribute User user
			)  {
		String rebirth = user.getBirth().replace("-","");
		user.setBirth(rebirth);
		return userService.modifyUser(user) ;
	}
	
	@RequestMapping(value = { "/registSheep.oe"}, method = RequestMethod.GET)
	public String registerSheep(
			@RequestParam(value="userId")String userId,
			@RequestParam(value="farmmerId")String farmmerId
			) {
		String[] result = userId.split(",");
			userService.registUserFarm(result, farmmerId);
			return "redirect:../user/list.oe";
	}
	/**
	 * 목장원 삭제 (정보는 성도관리로 넘어간다)
	 * @param userId
	 * @param flag
	 * @return
	 */
	@RequestMapping(value = { "/removeSheep.oe"}, method = RequestMethod.GET)
	public@ResponseBody boolean removeSheep(
			@RequestParam(value="userId")String userId,
			@RequestParam(value="flag", required=true, defaultValue="0")String flag
			) {
		return userService.removeSheep(userId, flag);
	}
	/**
	 * 모든 성도(목회자 관리자 제외) 조회
	 * @param keyword	
	 * @param page
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = { "/saintList.oe" }, method = RequestMethod.GET)
	public ModelAndView getSaintList(
			@RequestParam(value="keyword" ,required=false, defaultValue="")String keyword,
			@RequestParam(value="page" ,required=false, defaultValue= "1" )int page,
				HttpSession session) throws Exception{
		System.out.println(keyword);
		ModelAndView mav = new ModelAndView();
		Paging<User>pagingList =  userService.getPagingUserList(page, 10, keyword);
		mav.addObject("pageList", pagingList);
		mav.setViewName("user/saint/saint_list");
		return mav;
	}
	
	@RequestMapping(value = { "/removeUser.oe"}, method = RequestMethod.GET)
	public@ResponseBody boolean removeUser(
			@RequestParam(value="userId")String userId
			) {
		return userService.removeUser(userId);
	}
	
}
