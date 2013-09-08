/**
 * 
 */
package kr.ch.oe.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ch.oe.model.Church;
import kr.ch.oe.model.Group;
import kr.ch.oe.service.GroupService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author gusfot
 *
 */

@RequestMapping("/church")
@Controller
public class ChurchController implements CrudController{

	@Autowired
	GroupService groupService;
	
	@RequestMapping(value="/regist.oe", method=RequestMethod.GET)
	public String registPage(){
		return "group/church/church_regist";
	}
	
	@Override
	@RequestMapping(value="/regist.oe", method=RequestMethod.POST)
	public String regist(HttpServletRequest request, HttpServletResponse response){
		String churchNm = request.getParameter("churchNm");
		System.out.println(churchNm);
		Group church = new Church();
		church.setId(2);
		church.setName(churchNm);
		
		groupService.insert(church);
		return "redirect:list.oe";
	}
	
	
	@Override
	@RequestMapping("list.oe")
	public String list(HttpServletRequest request, HttpServletResponse response, Model model){
		List<Group> groups = groupService.findAll();
		for (Group group : groups) {
			System.out.println(group.getName());
		}
		model.addAttribute("groups", groups);
		return "group/church/church_list";
	}

	@Override
	public String delete(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		return null;
	}

	@Override
	public String modify(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return null;
	}
}
