package kr.ch.oe.dao;

import kr.ch.oe.model.Person;

import org.springframework.stereotype.Repository;

@Repository
public interface LoginMapper {

	String login(Person person);

	void edit(Person person);

	void delete(Person person);

	void regist(Person person);

}
