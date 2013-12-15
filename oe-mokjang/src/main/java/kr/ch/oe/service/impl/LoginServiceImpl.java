/**
 * 
 */
package kr.ch.oe.service.impl;

import java.util.HashMap;
import java.util.Map;

import kr.ch.oe.dao.LoginMapper;
import kr.ch.oe.model.Person;
import kr.ch.oe.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author gusfot
 *
 */
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginMapper loginMapper;

	@Override
	public void regist(Person person) {
		loginMapper.regist(person);
	}

	@Override
	public void login(Person person) {
		loginMapper.login(person);
		
	}

	@Override
	public void edit(Person person) {
		loginMapper.edit(person);
		
	}

	@Override
	public void delete(Person person) {
		loginMapper.delete(person);
		
	}
	
}
