package kr.ch.oe.service.impl;

import java.util.List;

import kr.ch.oe.dao.MemberMapper;
import kr.ch.oe.model.Person;
import kr.ch.oe.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberMapper memberMapper;
	
	@Override
	public void regist(Person person) {
		// TODO Auto-generated method stub
		memberMapper.regist(person);
	}

	@Override
	public List<Person> list() {
		return memberMapper.list();
	}

}
