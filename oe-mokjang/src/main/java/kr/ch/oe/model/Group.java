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
	public List<Group> getMembers();
	public void setMembers(List<Group> members);
	public Person getLeader();
	public void setLeader(Person leader);
	
}
