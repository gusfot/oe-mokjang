/**
 * 
 */
package kr.ch.oe.model;

import java.util.List;

/**
 * @author gusfot
 *
 */
public interface Group {

	public String getId();
	public void setId(String id);
	public String getName();
	public void setName(String name);
	public List<Group> getChildGroups();
	public void setChildGroups(List<Group> groups);
	public Person getLeader();
	public void setLeader(Person leader);
	public List<Person> getMembers();
	public void setMembers(List<Person> members);
	
	
}
