/**
 * 
 */
package kr.ch.oe.web;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gusfot
 *
 */
public interface CrudController {
	@RequestMapping("/regist.oe")
	public String regist();
	@RequestMapping("/list.oe")
	public String list();
	@RequestMapping("/delete.oe")
	public String delete();
	@RequestMapping("/modify.oe")
	public String modify();
	
}
