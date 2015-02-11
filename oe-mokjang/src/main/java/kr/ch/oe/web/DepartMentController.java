package kr.ch.oe.web;

import kr.ch.oe.common.Paging;
import kr.ch.oe.model.Department;
import kr.ch.oe.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

	
	@RequestMapping(value={"/list.oe"}, method=RequestMethod.GET)
	public ModelAndView getDeptList(
			@RequestParam(value="group",required=true)String group){
		ModelAndView mav = new ModelAndView();
		Paging<Department>pagingList = deptService.getDeptList(1,10,group);
		
		mav.addObject("pageList", pagingList);
		mav.addObject("groupName", group);
		mav.setViewName("group/gyogu/gyogu_list");
		return mav;
		
		
	}
	
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
	
	@RequestMapping(value={"/registForm.oe"}, method=RequestMethod.GET)
	public ModelAndView registDeptForm(
			@RequestParam(value="group",required=true)String group){
		ModelAndView mav = new ModelAndView();
		Paging<Department>pagingList = deptService.getDeptList(1,10,group);
		mav.addObject("pageList", pagingList);
		mav.addObject("group", group);
		mav.setViewName("group/gyogu/gyogu_regist");
		return mav;
		
	}
		@RequestMapping(value={"/regist.oe"}, method=RequestMethod.POST)
		public @ResponseBody String registDept(@ModelAttribute Department dept){
			deptService.registerDepartment(dept);
			return "";
		}
		
		@RequestMapping(value = { "/modify.oe" }, method = RequestMethod.POST)
		public@ResponseBody boolean modifydept(
				@RequestParam(value="deptSeq")Long deptSeq,
				@ModelAttribute Department dept
				) {
			System.out.println(dept.getDeptName());
			System.out.println(dept.getParentSeq());
			return deptService.modifyDepartMent(dept,deptSeq) >0 ? true : false;
		}
		
		@RequestMapping(value = { "/remove.oe" }, method = RequestMethod.GET)
		public@ResponseBody boolean removeDept(
				@RequestParam(value="deptSeq")Long deptSeq
				) {

			return deptService.removeDeparment(deptSeq) > 0 ? true: false;
		}
		
		
		
		
		
		
		
	
}
