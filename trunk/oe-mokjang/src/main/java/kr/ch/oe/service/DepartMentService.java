package kr.ch.oe.service;

import java.util.List;

import kr.ch.oe.model.Department;
import kr.ch.oe.model.DepartmentExample;


public interface DepartMentService {
	
	List<Department> getDeptList(DepartmentExample deptExam);
	
	Department getDepatment(Long deptseq);
	
	int registerDepartment(Department dept);
	
	int modifyDepartMent(Department dept);
	
	int removeDeparment(Long deptseq);
	
}
