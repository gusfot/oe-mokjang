/**
 * 
 */
package kr.ch.oe.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gusfot
 *
 */
public interface CrudController {
	@RequestMapping("/regist.oe")
	public String regist(HttpServletRequest request, HttpServletResponse response);
	@RequestMapping("/list.oe")
	public String list(HttpServletRequest request, HttpServletResponse response, Model model);
	@RequestMapping("/delete.oe")
	public String delete(HttpServletRequest request, HttpServletResponse response);
	@RequestMapping("/modify.oe")
	public String modify(HttpServletRequest request, HttpServletResponse response);
	
}
