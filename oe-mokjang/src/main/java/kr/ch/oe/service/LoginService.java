package kr.ch.oe.service;

import kr.ch.oe.model.SessionUserVO;

/**
 * 로그인 관련 Service
 * @author gusfot
 *
 */
public interface LoginService {

	public SessionUserVO loginUser(String userId ,String pw);
	
}
	