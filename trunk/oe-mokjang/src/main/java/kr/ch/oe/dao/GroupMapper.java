package kr.ch.oe.dao;

import java.util.List;

import kr.ch.oe.model.Group;

public interface GroupMapper {

	Group findById(long id);
	List<Group> findAll();
	int deleteById(long id);
	int insert(long id);
	int modify(Group group);
}