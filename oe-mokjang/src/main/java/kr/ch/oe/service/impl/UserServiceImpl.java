package kr.ch.oe.service.impl;


import java.util.List;

import kr.ch.oe.common.Paging;
import kr.ch.oe.dao.DepartmentMapper;
import kr.ch.oe.dao.UserMapper;
import kr.ch.oe.model.Department;
import kr.ch.oe.model.User;
import kr.ch.oe.model.UserExample;
import kr.ch.oe.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	@Autowired
	DepartmentMapper deptMapper;
	/**
	 * 모든 사용자 목록을 가지고 온다.
	 */
	@Override
	public Paging<User> getPagingUserList(int page,int pageSize) {
		UserExample example = new UserExample();
		int startIndex = pageSize*page-pageSize;
		String lmit = Integer.toString(startIndex)+","+Integer.toString(pageSize);
		example.setOrderByClause("user_seq");
		example.setLimitByClause(lmit);
		int totalNumberOfItem = userMapper.countByExample(example);
		List<User> userList = userMapper.selectByExample(example);
		return new Paging<>(page, pageSize, totalNumberOfItem, userList);
	}
	
	/**
	 * 사용자 한명의 정보를 가지고 온다.
	 */
	@Override
	public User getUser(String userId) {
		User user =userMapper.selectByPrimaryKey(userId);
		Department dept = deptMapper.selectByPrimaryKey(user.getDeptSeq());
		user.setDepartment(dept);
		return user;
	}
	
	/**
	 * 사용자를 등록한다.
	 */
	@Override
	public boolean registerUser(User user) {
		String roleName = userMapper.selectRoleName(user.getRoleSeq());
		user.setRoleName(roleName);
		return userMapper.insertSelective(user) > 0 ? true : false;
	}
	//user 정보를 수정한다
	
	/**
	 */
	@Override
	public boolean modifyUser(User user) {
		return userMapper.updateByPrimaryKeySelective(user) > 0 ? true : false;
		
	}
	//user 정보를 삭제한다
	@Override
	public boolean removeUser(String userId) {
		return userMapper.deleteByPrimaryKey(userId) > 0 ? true : false;
	}
	/**
	 *  목장목록을 가지고온다
	 */
	
	
	// TODO : 목장목록? 목장원목록?
	/**
	 * Re :  목장원 목록임돠 충상형님께서 보내주신 페이지보면 목장원관리 페이지에 사용되는거입니다
	 * 목자 아이디로 목장원 명단만 가지고옵니다!
	 */
	
	/**
	 * 목장목록을 가지고 온다.
	 */
	@Override
	public Paging<User> getFarmUserList(String FarmmerId) {

		User user = userMapper.selectByPrimaryKey(FarmmerId);
		long deptSeq = user.getDeptSeq();
		
		
		UserExample example = new UserExample();
		example.createCriteria().andDeptSeqEqualTo(deptSeq);
		example.setOrderByClause("user_seq");
		
		int totalNumofItems = userMapper.countByExample(example);

		return new Paging<>(1, 10, totalNumofItems, userMapper.selectByExample(example));
	}
/**
 * 아이디 중복 체크
 */
	@Override
	public boolean overlapUserId(String userId) {
		String checkId = userMapper.selectOverlapUserId(userId);
		if(checkId!=null){
		return false;
		}
		else
			return true;
	}

@Override
public boolean registUserFarm(String farmmerId, String UserId) {
	User user = userMapper.selectByPrimaryKey(UserId);
	System.out.println("1");
	User farmmer = userMapper.selectByPrimaryKey(farmmerId);
	System.out.println("2");
	user.setRoleSeq(7l);
	String roleName=userMapper.selectRoleName(user.getRoleSeq());
	System.out.println("3");
	System.out.println(user.getAddr());
	System.out.println(user.getBirth());
	System.out.println(user.getCellPhone());
	System.out.println(user.getEmail());
	System.out.println(user.getGender());
	System.out.println(user.getHomePhone());
	System.out.println(user.getJob());
	System.out.println(user.getPassword());
	System.out.println(user.getRegDt());
	System.out.println(user.getRoleName());
	System.out.println(user.getUserId());
	System.out.println(user.getUserName());
	System.out.println(user.getUserSeq());
	
	
	
	
	
	user.setRoleName(roleName);
	user.setDeptSeq(farmmer.getDeptSeq());
	return userMapper.updateByPrimaryKeySelective(user) > 0 ? true : false;
	/*boolean test = userMapper.updateByPrimaryKeySelective(user) > 0 ? true : false;
	 System.out.println("4");
	 return test;*/
}
}
