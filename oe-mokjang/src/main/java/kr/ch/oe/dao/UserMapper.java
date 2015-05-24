package kr.ch.oe.dao;

import java.util.List;

import kr.ch.oe.model.SessionUserVO;
import kr.ch.oe.model.User;
import kr.ch.oe.model.UserExample;

import org.apache.ibatis.annotations.Param;


public interface UserMapper {

	int countByExample(UserExample example);

	int deleteByExample(UserExample example);

	int deleteByPrimaryKey(String userId);

	int insert(User record);

	int insertSelective(User record);

	List<User> selectByExample(UserExample example);

	User selectByPrimaryKey(String userId);

	int updateByExampleSelective(@Param("record") User record,	@Param("example") UserExample example);

	int updateByExample(@Param("record") User record,	@Param("example") UserExample example);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
	
	User selectByUserId(String userId);
	/**
	 * 아이디 중복확인
	 * @param userId
	 * @return
	 */
	String selectOverlapUserId(String userId);
	/**
	 * 직분이름가져오기
	 * @param roleSeq
	 * @return
	 */
	String selectRoleName(long roleSeq);

	SessionUserVO selectSessionUserVO(@Param("userId") String userId ,@Param("userPw")String userPw);
	
	/**
	 * deptSeq로 사용자 조회
	 * @param deptSeq
	 * @return
	 */
	List<User> selectByDeptSeq(Long deptSeq);
	
}