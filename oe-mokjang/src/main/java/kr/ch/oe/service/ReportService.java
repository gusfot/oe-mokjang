package kr.ch.oe.service;

import java.util.List;
import java.util.Map;

import kr.ch.oe.model.PersonalReport;
import kr.ch.oe.model.Report;

import org.springframework.stereotype.Service;

@Service
public interface ReportService {
	void registMokjangReport(Report report);
	void modifyMokjangReport(Report report);
	void removeMokjangReport(long reportId);
	Report getMokjangReport(long reportId);
	List<Report> getMokjangReportsByCriteria(Map criteria);
	
	void registPersonalReport(PersonalReport report);
	void modifyPersonalReport(PersonalReport report);
	void removePersonalReport(long reportId);
	void getPersonalReport(long reportId);
	void getPersonalReportsByCriteria(Map criteria);
	
}
