package kr.ch.oe.service.impl;

import java.util.List;

import kr.ch.oe.common.Paging;
import kr.ch.oe.dao.DepartmentMapper;
import kr.ch.oe.dao.UserMapper;
import kr.ch.oe.model.Department;
import kr.ch.oe.model.DepartmentExample;
import kr.ch.oe.model.User;
import kr.ch.oe.model.UserExample;
import kr.ch.oe.model.UserExample.Criteria;
import kr.ch.oe.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentMapper deptMapper;

	@Autowired
	private UserMapper userMapper;
	
	private enum Group{
		 GYOGU, EDU,DEPART;
		/*GYOGU("44L"), EDU("13L"),DEPART("43L");*/
			
		private Long seq;
		
		public Long getSeq() {
			return seq;
		}
		
	}
	
	/**
	 * 조직리스트를 가지고온다
	 * 
	 *: 음일단 하드코딩을 했습니다 리팩토링시 
	 * 조금더 다듬도도록하겠습니다 확장성을생각해서!
	 */
	@Override
	public Paging<Department> getDeptList(int page, int pageSize, String group) {
		DepartmentExample deptExam = new DepartmentExample();
		
		int startIndex = pageSize*page-pageSize;
		String lmit = Integer.toString(startIndex)+","+Integer.toString(pageSize);
		deptExam.setLimitByClause(lmit);
		
		if (group.equals("gyogu")) {
			deptExam.createCriteria().andParentSeqBetween(1L, 3L);
		}else if(group.equals("목장")){
			deptExam.createCriteria().andParentSeqBetween(5L, 12L);
		}else if(group.equals("edu")){
			deptExam.createCriteria().andParentSeqEqualTo(13L);
		}else if(group.equals("depart")){
			deptExam.createCriteria().andParentSeqEqualTo(43L);
		}
		deptExam.setOrderByClause("dept_name");
		int count = deptMapper.countByExample(deptExam);
		return new Paging<>(page, pageSize, count, deptMapper.selectByExample(deptExam));
	}

	/**
	 * 조직한개의 정보를 가지고온다
	 */
	@Override
	public Department getDepatment(Long deptseq) {
		DepartmentExample deptExam = new DepartmentExample();
		deptExam.createCriteria().andDeptSeqEqualTo(1L);
		int count = deptMapper.countByExample(deptExam);

		return deptMapper.selectByPrimaryKey(deptseq);
	}
	
	/**
	 * 조직을 등록한다
	 */
	@Override
	public int registerDepartment(Department dept) {
		return deptMapper.insertSelective(dept);
	}

	/**
	 * 조직정보를 수정한다
	 * updateDept->업데이트할정보를담고있다
	 *   dept->기존의  dept	
	 */
	@Override
	public int modifyDepartMent(Department updateDept,long deptSeq) {
		Department dept = deptMapper.selectByPrimaryKey(deptSeq);
		dept.setDeptName(updateDept.getDeptName());
		dept.setParentSeq(updateDept.getParentSeq());
		return deptMapper.updateByPrimaryKeySelective(dept);
	}

	/**
	 * 조직을 삭제한다
	 */
	@Override
	public int removeDeparment(Long deptseq) {
		return deptMapper.deleteByPrimaryKey(deptseq);
	}

	@Override
	public List<User> getMokjangUsers(long deptSeq) {

//		UserExample example = new UserExample();
//		Criteria criteria = example.createCriteria();
//		criteria.andDeptSeqEqualTo(deptSeq);
//		criteria.andFlagEqualTo("0");     
//		example.setOrderByClause("user_seq");
//		return userMapper.selectByExample(example);
		
		return userMapper.selectByDeptSeq(deptSeq);
	}
	/**
	 * 소속 조직의 하위조직 갯수 가져오기
	 */
	@Override
	public int getRowGroupTotalNumber(Long  deptSeq) {
		DepartmentExample deptExam = new DepartmentExample();
		deptExam.createCriteria().andParentSeqEqualTo(deptSeq);
		return deptMapper.countByExample(deptExam);
	}

}
