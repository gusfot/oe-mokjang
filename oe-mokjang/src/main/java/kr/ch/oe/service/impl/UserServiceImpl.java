package kr.ch.oe.service.impl;

import java.util.List;

import kr.ch.oe.common.Paging;
import kr.ch.oe.dao.UserMapper;
import kr.ch.oe.model.User;
import kr.ch.oe.model.UserExample;
import kr.ch.oe.model.UserExample.Criteria;
import kr.ch.oe.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	
// 모든 userList  를가지고온다
	@Override
	public Paging<User> getPagingUserList(int page,int pageSize) {
		UserExample example = new UserExample();
		int totalNumberOfItem = userMapper.countByExample(example);
		List<User> userList = userMapper.selectByExample(example);
		Paging<User> result = new Paging<>(page, pageSize, totalNumberOfItem, userList); 
		return result;
	}
	//user 한명 정보를 가지고온다
	@Override
	public User getUser(String userId) {
		return userMapper.selectByPrimaryKey(userId);
	}
	//user 를 등록한다
	@Override
	public boolean registerUser(User user) {
		return userMapper.insertSelective(user) > 0 ? true : false;
	}
	//user 정보를 수정한다
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
	@Override
	public Paging<User> getFarmUserList(String FarmmerId) {
	UserExample example = new UserExample();
	User user = userMapper.selectByPrimaryKey(FarmmerId);
	
	int totalNumofItems = userMapper.countByExample(example);
	long deptSeq = user.getDeptSeq();
	example.createCriteria().andDeptSeqEqualTo(deptSeq);
	example.setOrderByClause("user_seq");
	List<User>items= userMapper.selectByExample(example);
	Paging<User> result = new Paging<>(1, 10, totalNumofItems, items);
	return result;
	}
	
	
}
