package kr.ch.oe.service.impl;


import java.util.List;

import kr.ch.oe.common.DateUtil;
import kr.ch.oe.common.Paging;
import kr.ch.oe.dao.DepartmentChangeHistMapper;
import kr.ch.oe.dao.DepartmentMapper;
import kr.ch.oe.dao.RoleChangeHistMapper;
import kr.ch.oe.dao.UserMapper;
import kr.ch.oe.model.Department;
import kr.ch.oe.model.DepartmentChangeHist;
import kr.ch.oe.model.RoleChangeHist;
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
	private UserMapper userMapper;
	
	@Autowired
	private DepartmentMapper departmentMapper;
	
	@Autowired
	private DepartmentChangeHistMapper departmentChangeHistMapper;

	@Autowired
	private RoleChangeHistMapper roleChangeHistMapper;
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

	@Transactional
	@Override
	public boolean dispatch(String userId) {
		boolean result = false;
		
		try {
			// 파송될 멤버 정보 조회
			User user = userMapper.selectByUserId(userId);
	
			// 목장생성 : 파송될 목장 정보 입력
			Department department = new Department();
			department.setDeptType("M");
			department.setDeptName(user.getUserName()+"목장");
			department.setDescription(department.getDeptName());
			department.setLeaderId(user.getUserId());
			department.setParentSeq(user.getDeptSeq());
			departmentMapper.insertSelective(department );
			
			// 목장변경이력 입력
			DepartmentChangeHist deptHist = new DepartmentChangeHist();
			deptHist.setBeforeDepartmentSeq(user.getDeptSeq());
			deptHist.setAfterDepartmentSeq(department.getDeptSeq());
			deptHist.setChangeResn("목장파송");
			deptHist.setUserId(userId);
			deptHist.setChangeDate(DateUtil.getDateFormatString("YYYYMMDD"));
			deptHist.setRegId("admin");
			departmentChangeHistMapper.insertSelective(deptHist);
			
			// 역할변경이력 입력
			RoleChangeHist roleHist = new RoleChangeHist();
			roleHist.setBeforeRoleSeq(user.getRoleSeq());
			roleHist.setAfterRoleSeq(5l);
			roleHist.setChangeResn("목장파송");
			roleHist.setUserId(userId);
			roleHist.setChangeDate(DateUtil.getDateFormatString("YYYYMMDD"));
			roleHist.setRegId("admin");
			roleChangeHistMapper.insertSelective(roleHist);
			
			// 생성된 목장정보로 목자 정보 수정
			user.setRoleSeq(5l);	// 목자roleSeq : 5
			user.setDeptSeq(department.getDeptSeq());
			userMapper.updateByPrimaryKeySelective(user);
			
			result = true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public boolean moveDept(String userId, long deptSeq) {
		boolean result = false;
		try {
			// 구성원 정보 조회
			User user = userMapper.selectByUserId(userId);
			user.setDeptSeq(deptSeq);
			
			// 목장변경
			userMapper.updateByPrimaryKeySelective(user);
			
			result = true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
