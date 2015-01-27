package kr.ch.oe.service;

import kr.ch.oe.common.Paging;
import kr.ch.oe.model.User;

public interface UserService {

	/**
	 *  user List 를 가지고온다
	 * @param example
	 * @param page
	 * @return
	 */
	Paging<User> getPagingUserList ( int page, int pageSize);
	
	/**
	 * user 한명 정보를 가지고온다 
	 * @param userId
	 * @return
	 */
	User getUser(String userId);
	
	/**
	 * user 를 등록한다
	 * @param user
	 * @return
	 */
	boolean registerUser(User user);
	
	/**
	 * user 정보를 수정한다
	 * @param user
	 * @return
	 */
	boolean modifyUser(User user);
	
	/**
	 * user 정보를 삭제한다 
	 * @param userId
	 * @return
	 */
	boolean removeUser(String userId);

	/**
	 * 한목장의 list 를 가지고온다
	 */
	
	Paging<User> getFarmUserList(String FarmmerId);
	
}









