package kr.ch.oe.service.impl;

import java.util.List;
import java.util.Map;

import kr.ch.oe.dao.GroupMapper;
import kr.ch.oe.dao.MemberMapper;
import kr.ch.oe.dao.MokjangMapper;
import kr.ch.oe.dao.RoleMapper;
import kr.ch.oe.model.Member;
import kr.ch.oe.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberMapper memberMapper;
	
	@Autowired
	RoleMapper roleMapper;
	
	@Autowired
	GroupMapper groupMapper;
	
	@Autowired
	MokjangMapper mokjangMapper;

	@Transactional
	@Override
	public void regist(Member member) {
		
		/**
		memberMapper.insert(member);
		System.out.println("member.getId() : " + member.getId());
		mokjangMapper.insert(member.getGroup());
		roleMapper.insert(member.getRole());
		*/
	}

	@Override
	public void remove(long id) {
		memberMapper.delete(id);
	}

	@Transactional
	@Override
	public void modify(Member member) {
		/*
		memberMapper.update(member);
		groupMapper.update(member.getMokjang().getGroup());
		mokjangMapper.update(member.getMokjang());
		roleMapper.update(member.getRole());
		*/
	}

	@Override
	public Member getMember(long id) {
		return memberMapper.selectMemberById(id);
	}

	@Override
	public List<Member> getMembers(Map criteria) {
		return memberMapper.selectMembersByCriteria(criteria);
	}
	

}
