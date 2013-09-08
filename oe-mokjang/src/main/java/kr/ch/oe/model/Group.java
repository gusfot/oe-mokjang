/**
 * 
 */
package kr.ch.oe.model;

import java.util.List;

/**
 * @author gusfot
 *
 */
public class Group {

	private int id;
	private String name;
	private List<Group> childGroups;
	private Person leader;
	private List<Person> members;
	private int type;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Group> getChildGroups() {
		return childGroups;
	}
	public void setChildGroups(List<Group> childGroups) {
		this.childGroups = childGroups;
	}
	public Person getLeader() {
		return leader;
	}
	public void setLeader(Person leader) {
		this.leader = leader;
	}
	public List<Person> getMembers() {
		return members;
	}
	public void setMembers(List<Person> members) {
		this.members = members;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	
	
}
