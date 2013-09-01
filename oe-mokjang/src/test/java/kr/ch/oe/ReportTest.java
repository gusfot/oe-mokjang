/**
 * 
 */
package kr.ch.oe;

import java.util.ArrayList;
import java.util.List;

import kr.ch.oe.model.Church;
import kr.ch.oe.model.ChurchLeader;
import kr.ch.oe.model.Group;
import kr.ch.oe.model.Gyogu;
import kr.ch.oe.model.Person;
import kr.ch.oe.model.Role;
import kr.ch.oe.model.Zo;

import org.junit.Test;

/**
 * @author gusfot
 *
 */
public class ReportTest {

	@Test
	public void GroupTest(){
		
		Group oech = new Church();
		oech.setId("1");
		Person leader1 = new Person();
		leader1.setName("권영구");
		Role role = new ChurchLeader();
		role.setName("담임목사");
		leader1.setRole(role);
		oech.setLeader(leader1);
		oech.setName("오병이어교회");
		
		List<Group> gyoguList = new ArrayList<Group>();
		Group gyogu1 = new Gyogu();
		gyogu1.setName("1교구");
		Person leader2 = new Person();
		leader2.setName("유명란");
		gyogu1.setLeader(leader2);
		gyoguList.add(gyogu1);
		
		List<Group> zoList1 = new ArrayList<Group>();
		Group zo1 = new Zo();
		zo1.setName("1교구 1조");
		Person leader3 = new Person();
		leader3.setName("1조");
		zo1.setLeader(leader3);
		zoList1.add(zo1);
		gyogu1.setChildGroups(zoList1);
		
		
		Group gyogu2 = new Gyogu();
		gyogu2.setName("2교구");
		Person leader4 = new Person();
		leader4.setName("1조");
		gyogu2.setLeader(leader4);
		gyoguList.add(gyogu2);
		
		List<Group> zoList2 = new ArrayList<Group>();
		Group zo2 = new Zo();
		zo2.setName("2교구 1조");
		Person leader5 = new Person();
		leader5.setName("1조");
		zo2.setLeader(leader5);
		zoList2.add(zo1);
		gyogu2.setChildGroups(zoList2);
		
		oech.setChildGroups(gyoguList);
		
		List<Group> chList = new ArrayList<Group>();
		chList.add(oech);
		
		
		for(Group ch : chList){
			System.out.println("교회 이름 : " + ch.getName());
			System.out.println("교회 리더 : " + ch.getLeader().getName());
		
			for (Group gyogu : ch.getChildGroups()) {
				System.out.println("교구 이름  : " + gyogu.getName());
				System.out.println("교구 리더 : " + gyogu.getLeader().getName());
				for (Group zo : gyogu.getChildGroups()) {
					
					System.out.println("조 이름 : " + zo.getName());
					System.out.println("조 리더 : " + zo.getLeader().getName());
				}
			}
		
		}

		
	}
}
