/**
 * 
 */
package kr.ch.oe.model;

import java.util.List;

import kr.ch.oe.common.Constants;

/**
 * @author gusfot
 *
 */
public class Gyogu extends Group {

	
	
	public Gyogu() {
		super();
		setType(Constants.GROUP_GYOGU);
	}

	@Override
	public List<Person> getMembers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMembers(List<Person> members) {
		// TODO Auto-generated method stub
		
	}

	
}
