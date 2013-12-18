package kr.ch.oe.service;

import java.util.List;
import java.util.Map;

import kr.ch.oe.model.Member;

public interface MemberService {

	void regist(Member member);

	List<Member> list(Map criteria);

}
