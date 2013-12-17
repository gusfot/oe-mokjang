package kr.ch.oe.dao;

import java.util.List;

import kr.ch.oe.model.Member;

public interface MemberMapper {

	void regist(Member member);

	List<Member> list();

	void insert(Member member);

}
