package kr.ch.oe.dao;

import java.util.List;

import kr.ch.oe.model.Person;

public interface MemberMapper {

	void regist(Person person);

	List<Person> list();

}
