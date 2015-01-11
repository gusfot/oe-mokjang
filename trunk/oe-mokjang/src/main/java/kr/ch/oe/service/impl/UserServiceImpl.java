package kr.ch.oe.service.impl;

import java.util.List;

import kr.ch.oe.dao.UserMapper;
import kr.ch.oe.model.User;
import kr.ch.oe.model.UserExample;
import kr.ch.oe.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	
	
	@Override
	public List<User> getUserList(UserExample example) {
			return userMapper.selectByExample(example);
	}

	@Override
	public User getUser(String userId) {
		return userMapper.selectByPrimaryKey(userId);
	}
	@Override
	public boolean registerUser(User user) {
		return userMapper.insert(user)>0?true:false;
	}

	@Override
	public int modifyUser(User user) {
		return userMapper.updateByPrimaryKey(user);
		
	}

	@Override
	public int deleteUser(String userId) {
		return userMapper.deleteByPrimaryKey(userId);
	}


}
