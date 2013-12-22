package kr.ch.oe.dao;

import java.util.List;
import java.util.Map;

import kr.ch.oe.model.Group;
import kr.ch.oe.model.Member;
import kr.ch.oe.model.Mokjang;

public interface GroupMapper {

	int insert(Group group);
	void update(Group group);
	void delete(int id);
	Group selectGroupById(int id);
	List<Group> selectGroupsByCriteria(Map criteria);
}
