/**
 * 
 */
package kr.ch.oe.service.impl;

import java.util.List;
import java.util.Map;

import kr.ch.oe.dao.ReportMapper;
import kr.ch.oe.model.PersonalReport;
import kr.ch.oe.model.Report;
import kr.ch.oe.service.ReportService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author gusfot
 *
 */
@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	ReportMapper reportMapper;
	
	@Transactional
	@Override
	public void registMokjangReport(Report report) {
		
		reportMapper.insertMokjangReport(report);

		for(PersonalReport personalReport : report.getPersonalReports()){
			personalReport.setMokjangReport(report);
			reportMapper.insertPersonalReport(personalReport);
		}

	}

	@Transactional
	@Override
	public void modifyMokjangReport(Report report) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeMokjangReport(long reportId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Report getMokjangReport(long reportId) {
		return reportMapper.selectMokjangReport(reportId);
		
	}

	@Override
	public List<Report> getMokjangReportsByCriteria(Map criteria) {
		return reportMapper.selectMokjangReports(criteria);
		
	}

	@Transactional
	@Override
	public void registPersonalReport(PersonalReport personalReport) {
		
		reportMapper.insertPersonalReport(personalReport);
		
	}

	@Transactional
	@Override
	public void modifyPersonalReport(PersonalReport report) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePersonalReport(long reportId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPersonalReport(long reportId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPersonalReportsByCriteria(Map criteria) {
		// TODO Auto-generated method stub
		
	}


}
