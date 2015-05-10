package kr.ch.oe.service;

import java.util.List;

import kr.ch.oe.common.Paging;
import kr.ch.oe.model.Department;
import kr.ch.oe.model.User;


public interface DepartmentService {
	
	/**
	 * 조직리스트를 가져옵니다
	 * @param deptExam
	 * @return
	 */
	Paging<Department> getDeptList(int page, int pageSize,String group);
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
	int modifyDepartMent(Department updateDept ,long deptSeq);
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
	
	/**
	 * 소속 조직의 하위조직 갯수 가져오기
	 */
	
	int getRowGroupTotalNumber(Long deptSeq);
	
	/**
	 * 하위부서목록을 가진 부서 조회
	 * @param deptSeq
	 * @return
	 */
	Department getDepatmentWithChildren(Long deptSeq);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
