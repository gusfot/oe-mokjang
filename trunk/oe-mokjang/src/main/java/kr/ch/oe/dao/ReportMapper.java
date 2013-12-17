/**
 * 
 */
package kr.ch.oe.dao;

import java.util.List;

import kr.ch.oe.model.PersonalReport;
import kr.ch.oe.model.Report;

import org.springframework.stereotype.Repository;

/**
 * @author gusfot
 *
 */
@Repository
public interface ReportMapper {

	void insertPersonalReport(PersonalReport report);
	
	Report selectPersonalReport(PersonalReport report);
	
	List<Report> selectPersonalReports();

	void deletePersonalReport(Report report);
	
	void insertMokjangReport(Report report);
	
	Report selectMokjangReport(Report report);
	
	List<Report> selectMokjangReports();

	void deleteMokjangReport(Report report);
}
