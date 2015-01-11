package kr.ch.oe.service;

import java.util.List;

import kr.ch.oe.model.User;
import kr.ch.oe.model.UserExample;

public interface UserService {

	List<User> getUserList(UserExample example);
	
	User getUser(String userId);
	
	boolean registerUser(User user);
	
	int modifyUser(User user);
	
	int deleteUser(String userId);
}
