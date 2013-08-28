/**
 * 
 */
package kr.ch.oe.model;

import java.util.List;

/**
 * @author gusfot
 *
 */
public class AbstractGroup implements Group{

	private String id;
	private String name;
	private List<Group> members;
	private Person leader;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Group> getMembers() {
		return members;
	}
	public void setMembers(List<Group> members) {
		this.members = members;
	}
	public Person getLeader() {
		return leader;
	}
	public void setLeader(Person leader) {
		this.leader = leader;
	}
	
}
