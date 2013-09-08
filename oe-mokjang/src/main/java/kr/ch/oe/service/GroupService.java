/**
 * 
 */
package kr.ch.oe.service;

import java.util.List;

import kr.ch.oe.model.Group;

/**
 * @author gusfot
 *
 */
public interface GroupService {

	void insert(Group church);

	Group findById(int id);
	
	List<Group> findAll();
	

}
