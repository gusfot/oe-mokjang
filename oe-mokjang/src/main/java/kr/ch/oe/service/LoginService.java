/**
 * 
 */
package kr.ch.oe.service;

import kr.ch.oe.model.Member;


/**
 * @author gusfot
 *
 */

public interface LoginService {

	public Member login(Member member);
	
	public void regist(Member member);
	
	public void edit(Member member);
	
	public void delete(Member member); 
}
