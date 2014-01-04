/**
 * 
 */
package kr.ch.oe.dao;

import java.util.List;
import java.util.Map;

import kr.ch.oe.model.PersonalReport;
import kr.ch.oe.model.Report;

/**
 * @author gusfot
 *
 */
public interface ReportMapper {

	void insertPersonalReport(PersonalReport report);
	
	Report selectPersonalReport(PersonalReport report);
	
	List<Report> selectPersonalReports();

	void deletePersonalReport(Report report);
	
	void insertMokjangReport(Report report);
	
	Report selectMokjangReport(long reportId);
	
	List<Report> selectMokjangReports(Map criteria);

	void deleteMokjangReport(Report report);

	PersonalReport selectPersonalReportById(long id);
}
