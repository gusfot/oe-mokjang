package kr.ch.oe.service;

import java.util.List;

import kr.ch.oe.model.Member;

public interface MemberService {

	void regist(Member member);

	List<Member> list();

}
