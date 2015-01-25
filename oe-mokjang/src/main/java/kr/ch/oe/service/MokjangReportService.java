package kr.ch.oe.service;

import java.util.List;

import kr.ch.oe.model.MokjangReport;

public interface MokjangReportService {

	boolean regist(MokjangReport mokjangReport);

	MokjangReport getMokjangReport(long mokjangReportSeq);

	List<MokjangReport> getMokjangReports(long deptSeq);
}
