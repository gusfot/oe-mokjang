/**
 * 
 */
package kr.ch.oe.model;

import kr.ch.oe.common.Constants;

/**
 * @author gusfot
 *
 */
public class MokjangLeader extends AbstractRole implements Reportable{

	public MokjangLeader() {
		super();
		setType(Constants.ROLE_MOKJANG_LEADER);
	}

	@Override
	public void submitReport(Report report) {
		// TODO Auto-generated method stub
		
	}
}
