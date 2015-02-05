package kr.ch.oe.service;

import kr.ch.oe.model.User;

/**
 * 로그인 관련 Service
 * @author gusfot
 *
 */
public interface LoginService {

	public User loginUser(String userId ,String pw);
	
}
	