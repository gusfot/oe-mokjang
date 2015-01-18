package kr.ch.oe.service;

import java.util.List;

import kr.ch.oe.model.Report;

public interface ReportService {

	boolean regist(List<Report> reports);

	List<Report> getReports(long deptSeq, int weeks);

}
