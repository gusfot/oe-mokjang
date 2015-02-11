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
	 *모든 사용자 목록을 가지고온다  
	 */
	@Override
	public Paging<User> getPagingUserList(int page,int pageSize, String keyword) {
		
		UserExample example = new UserExample();
		
		int startIndex = pageSize*page-pageSize;
		String lmit = Integer.toString(startIndex)+","+Integer.toString(pageSize);
		
		example.setOrderByClause("user_seq");
		example.setLimitByClause(lmit);
		
		if(!keyword .equals("")){
			String likekeyword ="%"+keyword+"%";
		example.createCriteria().andUserNameLike(likekeyword);
		}
		example.createCriteria().andRoleSeqBetween("3","9");
		int totalNumberOfItem = userMapper.countByExample(example);
		List<User> userList = userMapper.selectByExample(example);
		return new Paging<>(page, pageSize, totalNumberOfItem, userList);
	}
		
	/**
	 * 사용자 한명의 정보를 가지고 온다.
	 */
	@Override
	public User getUser(String userId) {
		
		// FIXME : 사용자 정보 가지고 올 때 부서정보 join 해서 가져오도록 하자.
		
		User user =userMapper.selectByPrimaryKey(userId);
		if(user==null){
			return null;
		}
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
		
		System.out.println(user.getRoleName());
		
		
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
		example.setOrderByClause("role_seq");
		
		int totalNumofItems = userMapper.countByExample(example);

		return new Paging<>(1, 10, totalNumofItems, userMapper.selectByExample(example));
	}
/**
 * 아이디 중복 체크
 */
	@Override
	public boolean overlapUserId(String userId) {
		return userMapper.selectOverlapUserId(userId) != null ? false : true;
	}
	/**
	 * 목장원추가 버튼으로 목장원을 추가한다
	 */
@Override	
public boolean registUserFarm(String[] userId, String farmmerId) {
	boolean result=true;
	
	for (int i = 0; i < userId.length; i++) {
		User user = userMapper.selectByPrimaryKey(userId[i]);
		User farmmer = userMapper.selectByPrimaryKey(farmmerId);
		user.setRoleSeq(7l);
		String roleName=userMapper.selectRoleName(user.getRoleSeq());
		user.setRoleName(roleName);
		user.setDeptSeq(farmmer.getDeptSeq());
	 result= userMapper.updateByPrimaryKeySelective(user) > 0 ? true : false;
	}
	return result;
}

/**
 * 목장원을 목장목록에서 제외한다
 */
@Override
public boolean removeSheep( String sheeprId , String flag) {
	User sheep = userMapper.selectByPrimaryKey(sheeprId);
	sheep.setDeptSeq(1l);
	sheep.setRoleSeq(9L);
	sheep.setFlag("1");
	String roleName = userMapper.selectRoleName(sheep.getRoleSeq());
	sheep.setRoleName(roleName);
	return userMapper.updateByPrimaryKeySelective(sheep) > 0 ? true : false;
	
}

}
