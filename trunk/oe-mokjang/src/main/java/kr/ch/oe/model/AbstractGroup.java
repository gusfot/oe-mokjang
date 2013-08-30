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
	private List<Group> childGroups;
	private Person leader;
	private List<Person> members;
	
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
	public List<Person> getMembers(){
		return members;
	}
	public void setMembers(List<Person> members){
		this.members = members;
	}
	
	
}
