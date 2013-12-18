/**
 * 
 */
package kr.ch.oe.service.impl;

import java.util.List;

import kr.ch.oe.dao.GroupMapper;
import kr.ch.oe.model.Group;
import kr.ch.oe.service.GroupService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author gusfot
 *
 */

@Service
public class GroupServiceImpl implements GroupService{

	@Autowired
	GroupMapper groupMapper;

	@Override
	public void insert(Group church) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Group findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Group> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
