package kr.ch.oe.service.impl;

import kr.ch.oe.model.User;
import kr.ch.oe.service.LoginService;
import kr.ch.oe.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

	
	@Autowired
	UserService userService;
	
	@Override
	public User loginUser(String userId, String pw) {
		
		User user = userService.getUser(userId);
		if (!user.getPassword().equals(pw)){
			return user;
		}
		return null ;
	}

}
