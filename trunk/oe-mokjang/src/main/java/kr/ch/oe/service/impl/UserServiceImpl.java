package kr.ch.oe.service.impl;


import java.util.List;

import kr.ch.oe.common.Paging;
import kr.ch.oe.dao.DepartmentMapper;
import kr.ch.oe.dao.UserMapper;
import kr.ch.oe.model.SessionUserVO;
import kr.ch.oe.model.User;
import kr.ch.oe.model.UserExample;
import kr.ch.oe.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	@Autowired
	DepartmentMapper deptMapper;
	
	/**
	 *페이징된 모든 사용자 목록을 가지고온다  
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
		example.setOrderByClause("reg_time DESC");
		int totalNumberOfItem = userMapper.countByExample(example);
		List<User> userList = userMapper.selectByExample(example);
		return new Paging<>(page, pageSize, totalNumberOfItem, userList);
	}
		
	/**
	 * 사용자 한명의 정보를 가지고 온다.
	 */
	@Override
	public User getUser(String userId) {
		return userMapper.selectByUserId(userId);
	}
	
	/**
	 * 사용자를 등록한다.
	 */
	@Transactional
	@Override
	public boolean regist(User user) {
		// TODO 사용자를 등록할 때는 user 정보와 소속 부서(목장) 정보가 같이 들어가야 함.
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
		// TODO 사용자를 등록할 때는 user 정보와 소속 부서(목장) 정보가 같이 수정되어야 함.
		return userMapper.updateByPrimaryKeySelective(user) > 0 ? true : false;
		
	}
	//user 정보를 삭제한다
	@Override
	public boolean removeUser(String userId) {
		// TODO 사용자를 등록할 때는 user 정보와 소속 부서(목장) 정보가 같이 삭제되어야 함.
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
		List<User> items = userMapper.selectByExample(example);
		
		return new Paging<>(1, 10, totalNumofItems, items);
	}
	/**
	 * 아이디 중복 체크
	 */
		@Override
		public boolean overlapUserId(String userId) {
			/*return userMapper.selectOverlapUserId(userId) != null ? true: false;*/
			System.out.println("userId = = = = ="+userId);
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
	
	@Override
	public User getUserByUserId(String userId) {
		return userMapper.selectByUserId(userId);
	}

	@Override
	public SessionUserVO getSessionUserVO(String userId, String userPw) {
		return userMapper.selectSessionUserVO(userId,userPw);
		
	}

}
