package kr.ch.oe.service;

import kr.ch.oe.common.Paging;
import kr.ch.oe.model.SessionUserVO;
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
	 * user 한명 기본정보를 가지고온다 
	 * @param userId
	 * @return
	 */
	User getUser(String userId);
	
	/**
	 * user 연관된 정보를 가지고 온다.
	 * @param userId
	 * @return
	 */
	User getUserByUserId(String userId);
	
	/**
	 * user 를 등록한다
	 * @param user
	 * @return
	 */
	boolean regist(User user);
	
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
	
	boolean removeSheep(String sheepId, String flag);
	
	/**
	 * 사용자 정보 세션
	 * @param userId
	 * @param userPw
	 * @return
	 */
	SessionUserVO getSessionUserVO(String userId, String userPw);

	/**
	 * 목자파송
	 * 1.기존 목장에서 하위목장생성
	 * 2.기존 목장원 -> 하위목자
	 * @param userId : 이동할 목장원
	 */
	boolean dispatch(String userId);
	
	/**
	 * 목장변경
	 * 구성원의 목장을 변경한다.
	 * @param userId
	 * @param deptSeq
	 * @return
	 */
	boolean moveDept(String userId,long deptSeq);
	
}









