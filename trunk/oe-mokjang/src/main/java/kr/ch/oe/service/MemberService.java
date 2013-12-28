package kr.ch.oe.service;

import java.util.List;
import java.util.Map;

import kr.ch.oe.model.Member;

public interface MemberService {

	void regist(Member member);

	void remove(long id);

	void modify(Member member);

	Member getMember(long id);

	List<Member> getMembers(Map criteria);

}
