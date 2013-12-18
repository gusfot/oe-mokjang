package kr.ch.oe.dao;

import java.util.List;
import java.util.Map;

import kr.ch.oe.model.Member;

public interface MemberMapper {

	void insert(Member member);

	void update(Member member);

	void delete(int id);

	Member selectMemberById(int i);

	List<Member> selectMembersByCriteria(Map criteria);

}
