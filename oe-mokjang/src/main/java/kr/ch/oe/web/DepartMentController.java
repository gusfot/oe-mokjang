package kr.ch.oe.web;

import java.util.List;

import kr.ch.oe.common.Paging;
import kr.ch.oe.model.Department;
import kr.ch.oe.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/dept")
@Controller
public class DepartMentController {
	
	
	@Autowired
	private DepartmentService deptService;

	
	@RequestMapping(value={"/main.oe"}, method=RequestMethod.GET)
	public ModelAndView getMainView(	
			@RequestParam(value="gyogu")String gyogu,
			@RequestParam(value="edu")String edu,
			@RequestParam(value="depart")String depart
			){
		ModelAndView mav = new ModelAndView();
		
		Paging<Department>gyoguList = deptService.getDeptList(1,4,gyogu);
		Paging<Department>eduList = deptService.getDeptList(1,4,edu);
		Paging<Department>departList = deptService.getDeptList(1,4,depart);
		
		mav.addObject("gyoguList", gyoguList);
		mav.addObject("eduList", eduList);
		mav.addObject("departList", departList);
		mav.setViewName("group/groupMain");
		return mav;
		
	}
	
	@RequestMapping(value = { "mainList.oe" }, method = RequestMethod.GET)
	public @ResponseBody List<Department> registerSheep(
			@RequestParam(value="group",required=true)String group,
			Model model){
		System.out.println("mainList dEpt In?");
		String[] result = group.split(",");
		System.out.println(result+"**********************");
		Paging<Department>pagingList = deptService.getDeptList(1,4,group);
		
		
		model.addAttribute("list", pagingList);
		
		
		
		
		return pagingList.getItems();
	}
	
	/**
	 * 조직정보를 가져옵니다
	 * @param group
	 * @return
	 */
	@RequestMapping(value={"/list.oe"}, method=RequestMethod.GET)
	public ModelAndView getDeptList(
			@RequestParam(value="group",required=true)String group){
		ModelAndView mav = new ModelAndView();
		Paging<Department>pagingList = deptService.getDeptList(1,10,group);
		String groupName="";		
		if(group.equals("gyogu")){
			groupName = "교구";
		}else if(group.equals("edu")){
			groupName = "교육부";
		}else if(group.equals("depart")){
			groupName = "부서";
		}
		
		mav.addObject("pageList", pagingList);
		mav.addObject("groupName", groupName);
		mav.setViewName("group/gyogu/gyogu_list");
		return mav;
		
		
	}
	/**
	 * 조직한개의 정보를 조회합니다
	 * @param deptSeq
	 * @param group
	 * @return
	 */
	@RequestMapping(value={"/detail.oe"}, method=RequestMethod.GET)
	public ModelAndView getDept(
			@RequestParam(value="deptSeq",required=true)long deptSeq,
			@RequestParam(value="group",required=true)String group
			){
		ModelAndView mav = new ModelAndView();
		Paging<Department>parentList = deptService.getDeptList(1,10,group);
		Department dept = deptService.getDepatment(deptSeq);
		Department parentDept = deptService.getDepatment(dept.getParentSeq());
		
		mav.addObject("pageList", parentList);
		mav.addObject("group", group);
		mav.addObject("dept",dept);
		mav.addObject("deptTotalNum", deptService.getRowGroupTotalNumber(deptSeq));
		mav.addObject("parentDept", parentDept);
		mav.setViewName("group/gyogu/gyogu_detail");
		
		return mav;
		
	}
	/**
	 * 조직등록 폼 화면제공
	 * @param group
	 * @return
	 */
	@RequestMapping(value={"/registForm.oe"}, method=RequestMethod.GET)
	public ModelAndView registDeptForm(
			@RequestParam(value="group",required=true)String group){
		ModelAndView mav = new ModelAndView();
		Paging<Department>pagingList = deptService.getDeptList(1,10,"");
		mav.addObject("pageList", pagingList);
		mav.addObject("group", group);
		mav.setViewName("group/gyogu/gyogu_regist");
		return mav;
		
	}
	/**
	 * 조직을등록합니다
	 * @param dept
	 * @return
	 */
		@RequestMapping(value={"/regist.oe"}, method=RequestMethod.POST)
		public @ResponseBody String registDept(@ModelAttribute Department dept){
			deptService.registerDepartment(dept);
			return "";
		}
		/**
		 * 조직정보 수정
		 * @param deptSeq
		 * @param dept
		 * @return
		 */
		@RequestMapping(value = { "/modify.oe" }, method = RequestMethod.POST)
		public@ResponseBody boolean modifydept(
				@RequestParam(value="deptSeq")Long deptSeq,
				@ModelAttribute Department dept
				) {
			return deptService.modifyDepartMent(dept,deptSeq) >0 ? true : false;
		}
		
		/**
		 * 조직을 삭제합니다
		 * 
		 * @param deptSeq
		 * @return
		 */
		@RequestMapping(value = { "/remove.oe" }, method = RequestMethod.GET)
		public@ResponseBody boolean removeDept(
				@RequestParam(value="deptSeq")Long deptSeq
				) {
			return deptService.removeDeparment(deptSeq) > 0 ? true: false;
		}
		
		
		
		
		
		
		
	
}
