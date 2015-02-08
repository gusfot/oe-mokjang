package kr.ch.oe.service;

import java.util.List;

import kr.ch.oe.model.Department;
import kr.ch.oe.model.DepartmentExample;
import kr.ch.oe.model.User;


public interface DepartmentService {
	
	/**
	 * 조직리스트를 가져옵니다
	 * @param deptExam
	 * @return
	 */
	List<Department> getDeptList(DepartmentExample deptExam);
	/**
	 * 조직 한개의 정보를 가지고 옵니다
	 * @param deptseq
	 * @return
	 */
	Department getDepatment(Long deptseq);
	/**
	 *  조직을 등록합니다
	 * @param dept
	 * @return
	 */
	int registerDepartment(Department dept);
	/**
	 * 조직정보를 수정합니다
	 * @param dept
	 * @return
	 */
	int modifyDepartMent(Department dept);
	/**
	 * 조직을 삭제합니다
	 * @param deptseq
	 * @return
	 */
	int removeDeparment(Long deptseq);
	
	/**
	 * 목장seq로 목장원 조회
	 * @param deptSeq
	 * @return
	 */
	List<User> getMokjangUsers(long deptSeq);
	
}
