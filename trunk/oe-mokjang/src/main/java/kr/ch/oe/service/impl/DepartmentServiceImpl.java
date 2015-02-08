package kr.ch.oe.service.impl;

import java.util.List;

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
	
	/**
	 * 조직리스트를 가지고온다
	 */
	@Override
	public List<Department> getDeptList(DepartmentExample deptExam) {
		return deptMapper.selectByExample(deptExam); 
	}
	/**
	 * 조직한개의 정보를 가지고온다
	 */
	@Override
	public Department getDepatment(Long deptseq) {
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
	 */
	@Override
	public int modifyDepartMent(Department dept) {
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
		
		UserExample example = new UserExample();
		Criteria  criteria = example.createCriteria();
		criteria.andDeptSeqEqualTo(deptSeq);
		criteria.andFlagEqualTo("0");
		example.setOrderByClause("user_seq");
		
		return userMapper.selectByExample(example);
	}

}
