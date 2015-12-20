package kr.ch.oe.service;

import java.util.List;

import kr.ch.oe.model.MokjangReport;

public interface MokjangReportService {

	/**
	 * 목장보고서를 등록한다.
	 * @param mokjangReport
	 * @return
	 */
	boolean regist(MokjangReport mokjangReport);

	/**
	 * 목장보고서를 조회한다.
	 * @param mokjangReportSeq
	 * @return
	 */
	MokjangReport getMokjangReport(long mokjangReportSeq);

	/**
	 * 해당목장의 주차의 목장보고서를 조회한다.
	 * @param deptSeq
	 * @param weeks
	 * @return
	 */
	MokjangReport getMokjangReport(long deptSeq, int weeks);

	/**
	 * 목장의 목장보고서목록을 조회한다.
	 * @param deptSeq
	 * @return
	 */
	List<MokjangReport> getMokjangReports(long deptSeq);

	/**
	 * 목장보고서 수정한다.
	 * @param mokjangReport
	 * @return
	 */
	boolean modify(MokjangReport mokjangReport);
	
	/**
	 * 해당주의 목장보고서 제출여부
	 * @param deptSeq
	 * @param weeks
	 * @return
	 */
	boolean isSubmited(long deptSeq, int weeks);

	/**
	 * 부서코드로 전체누적 점수 조회
	 * @param deptSeq
	 * @return
	 */
	int getTotalPointByDeptSeq(long deptSeq);

}
