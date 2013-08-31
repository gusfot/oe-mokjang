/**
 * 
 */
package kr.ch.oe.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gusfot
 *
 */

@RequestMapping("/church")
@Controller
public class ChurchController implements CrudController{

	@Override
	public String regist(){
		return "group/church/church_regist";
	}
	
	@Override
	public String list(){
		return "group/church/church_list";
	}

	@Override
	public String delete() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String modify() {
		// TODO Auto-generated method stub
		return null;
	}
}
