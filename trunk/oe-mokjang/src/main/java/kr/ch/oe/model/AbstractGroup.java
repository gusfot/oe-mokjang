/**
 * 
 */
package kr.ch.oe.model;

import java.util.List;

/**
 * @author gusfot
 *
 */
public abstract class AbstractGroup implements Group{

	private String id;
	private String name;
	private List<Group> childGroups;
	private Person leader;
	private List<Person> members;
	private int type;
	
	public String getId() {
		return id;
	}
	@Override
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public List<Group> getChildGroups() {
		return childGroups;
	}
	@Override
	public void setChildGroups(List<Group> childGroups) {
		this.childGroups = childGroups;
	}
	@Override
	public Person getLeader() {
		return leader;
	}
	@Override
	public void setLeader(Person leader) {
		this.leader = leader;
	}
	@Override
	public void setType(int type) {
		this.type = type;
		
	}
	@Override
	public int getType() {
		return type;
	}
	
	
}
