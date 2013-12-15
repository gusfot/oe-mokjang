/**
 * 
 */
package kr.ch.oe.service;

import kr.ch.oe.model.Person;


/**
 * @author gusfot
 *
 */

public interface LoginService {

	public void login(Person person);
	
	public void regist(Person person);
	
	public void edit(Person person);
	
	public void delete(Person person); 
}
