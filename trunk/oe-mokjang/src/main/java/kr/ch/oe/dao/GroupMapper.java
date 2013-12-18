package kr.ch.oe.dao;

import java.util.List;
import java.util.Map;

import kr.ch.oe.model.Group;
import kr.ch.oe.model.Member;
import kr.ch.oe.model.Mokjang;

public interface GroupMapper {

	int insert(Mokjang mokjang);
	void update(Mokjang mokjang);
	void delete(int id);
	Group selectMokjangById(int id);
	List<Group> selectMokjangsByCriteria(Map criteria);
}
