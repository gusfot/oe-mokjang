/**
 * 
 */
package kr.ch.oe.dao;

import java.util.List;
import java.util.Map;

import kr.ch.oe.model.Role;

import org.springframework.stereotype.Repository;

/**
 * @author donghyeok
 *
 */
@Repository
public interface RoleMapper {

	void insert(Role role);

	void update(Role role);

	void delete(long id);

	Role selectRoleById(int id);

	List<Role> selectRolesByCriteria(Map criteria);


}
