package kr.ch.oe.dao;

import java.util.List;
import java.util.Map;

import kr.ch.oe.model.Member;

public interface MemberMapper {

	void insert(Member member);

	void update(Member member);

	void delete(long id);

	Member selectMemberById(long id);

	List<Member> selectMembersByCriteria(Map criteria);

}
