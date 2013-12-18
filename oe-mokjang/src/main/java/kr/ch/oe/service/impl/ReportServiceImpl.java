/**
 * 
 */
package kr.ch.oe.service.impl;

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
	
	@Override
	public void insertPersonalReport(PersonalReport personalReport) {
		reportMapper.insertPersonalReport(personalReport);
		
	}

	/* (non-Javadoc)
	 * @see kr.ch.oe.service.ReportService#report(kr.ch.oe.model.Report)
	 */
	@Transactional
	@Override
	public void report(Report report) {
		
		for(PersonalReport personalReport : report.getPersonalReports()){
			personalReport.setMokjangReport(report);
			reportMapper.insertPersonalReport(personalReport);
		}
		
		reportMapper.insertMokjangReport(report);

	}


}
