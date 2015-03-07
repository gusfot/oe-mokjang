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
}
