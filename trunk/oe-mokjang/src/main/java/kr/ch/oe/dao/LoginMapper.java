package kr.ch.oe.dao;

import kr.ch.oe.model.Member;

import org.springframework.stereotype.Repository;

@Repository
public interface LoginMapper {

	String login(Member member);

	void edit(Member member);

	void delete(Member member);

	void regist(Member member);

}
