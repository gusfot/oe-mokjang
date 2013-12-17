package kr.ch.oe.service.impl;

import java.util.List;

import kr.ch.oe.dao.MemberMapper;
import kr.ch.oe.model.Member;
import kr.ch.oe.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberMapper memberMapper;
	
	@Override
	public void regist(Member member) {
		// TODO Auto-generated method stub
		memberMapper.regist(member);
	}

	@Override
	public List<Member> list() {
		return memberMapper.list();
	}

}
