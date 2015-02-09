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
		System.out.println("1");
		User user = userService.getUser(userId);
		System.out.println("2");
		if (user != null) {
			if (user.getPassword().equals(pw)) {
				System.out.println("3");
				return user;
			}
		}
		System.out.println("4");
		return null;

	}

}
	