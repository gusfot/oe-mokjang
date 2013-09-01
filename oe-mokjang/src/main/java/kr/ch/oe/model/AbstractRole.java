/**
 * 
 */
package kr.ch.oe.model;

/**
 * @author gusfot
 *
 */
public class AbstractRole implements Role{
	private String name;
	private int authority;
	private String type;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAuthority() {
		return authority;
	}
	public void setAuthority(int authority) {
		this.authority = authority;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
