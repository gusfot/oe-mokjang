package kr.ch.oe.service;

import java.util.List;

import kr.ch.oe.common.Paging;
import kr.ch.oe.model.User;

public interface UserService {

	/**
	 *  user List 를 가지고온다
	 * @param example
	 * @param page
	 * @return
	 */
	Paging<User> getPagingUserList ( int page, int pageSize, String keyword);
	
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
	/**
	 *  아이디 중복확인
	 * @param userId
	 * @return
	 */
	boolean overlapUserId(String userId);

	/**
	 * 목장원추가 선택으로 목장원을 추가할떄
	 * @param farmmerId
	 * @param UserId
	 * @return
	 */
	boolean registUserFarm(String[] farmmerId,String UserId);
	/**
	 * 목장목록에서 목장원을 삭제할때
	 * @param sheepId
	 * @return
	 */
	
	boolean removeSheep(String sheepId, long flag);
	
}









