package kr.ch.oe.dao;

import java.util.List;
import java.util.Map;

import kr.ch.oe.model.Group;

public interface GroupMapper {

	int insert(Group group);
	void update(Group group);
	void delete(long id);
	Group selectGroupById(long id);
	List<Group> selectGroupsByCriteria(Map criteria);
}
