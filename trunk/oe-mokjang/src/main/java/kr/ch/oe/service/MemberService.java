package kr.ch.oe.service;

import java.util.List;

import kr.ch.oe.model.Person;

public interface MemberService {

	void regist(Person person);

	List<Person> list();

}
