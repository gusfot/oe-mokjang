package kr.ch.oe.service;

import java.util.List;

import kr.ch.oe.model.User;
import kr.ch.oe.model.UserExample;

public interface UserService {

	//User 목록을 가지고온다
	List<User> getUserList(UserExample example);
	//user 한명 정보를 가지고온다
	User getUser(String userId);
	//user 를 등록한다
	int registerUser(User user);
	//user 정보를 수정한다
	int modifyUser(User user);
	//user 정보를 삭제한다
	int removeUser(String userId);
}
