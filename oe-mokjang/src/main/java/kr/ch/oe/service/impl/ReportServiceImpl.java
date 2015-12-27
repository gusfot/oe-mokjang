package kr.ch.oe.service.impl;

import java.util.List;

import kr.ch.oe.dao.MokjangReportMapper;
import kr.ch.oe.dao.ReportMapper;
import kr.ch.oe.model.Report;
import kr.ch.oe.model.ReportExample;
import kr.ch.oe.model.ReportExample.Criteria;
import kr.ch.oe.service.ReportService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	private ReportMapper reportMapper;
	
	@Autowired
	private MokjangReportMapper mokjangReportMapper; 
	
	@Transactional
	@Override
	public boolean registReports(List<Report> reports) {
		boolean result = false;
		
		// TODO Controller 단에서 보고서 작성자의 deptSeq, userId 세팅
		try {
			for (Report report : reports) {
				reportMapper.insert(report);
			}
			result = true;
		}catch(Exception e){
			e.printStackTrace();
			result = false;
		}
		
		return result;
	}
	
	@Override
	public boolean regist(Report report) {
		return reportMapper.insert(report) > 0 ? true : false;
	}

	@Override
	public List<Report> getReports(long deptSeq, int weeks) {
		ReportExample example = new ReportExample();
		Criteria criteria = new ReportExample().createCriteria();
		criteria.andDeptSeqEqualTo(deptSeq);	// 부서정보seq								
		criteria.andWeeksEqualTo(weeks);		// 몇번째주
		

		return reportMapper.selectByExample(example);
	}

}
