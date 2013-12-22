package kr.ch.oe.dao;

import java.util.List;
import java.util.Map;

import kr.ch.oe.model.Group;
import kr.ch.oe.model.Gyogu;

public interface GyoguMapper {

	int insert(Gyogu gyogu);
	void update(Gyogu gyogu);
	void delete(int id);
	Group selectGyoguById(int id);
	List<Group> selectGyoguByCriteria(Map criteria);
}
