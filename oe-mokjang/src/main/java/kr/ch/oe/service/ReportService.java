package kr.ch.oe.service;

import java.util.List;

import kr.ch.oe.model.MokjangReport;
import kr.ch.oe.model.Report;

/**
 * 개인 보고서 Service
 * @author gusfot
 *
 */
public interface ReportService {

	/**
	 * 개인 보고서 목록 등록
	 * @param reports
	 * @return
	 */
	boolean registReports(List<Report> reports);
	
	/**
	 * 단건 개인 보고서 등록
	 * @param report
	 * @return
	 */
	boolean regist(Report report);

	/**
	 * 해당주와 목장의 목장원들 개인보고서 조회
	 * @param deptSeq
	 * @param weeks
	 * @return
	 */
	List<Report> getReports(long deptSeq, int weeks);

}
