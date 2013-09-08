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
public class Church extends Group {

	
	
	public Church() {
		super();
		setType(Constants.GROUP_CHURCH);
	}

	@Override
	public List<Person> getMembers() {
		return null;
	}

	@Override
	public void setMembers(List<Person> members) {
		// TODO Auto-generated method stub
		
	}


}
