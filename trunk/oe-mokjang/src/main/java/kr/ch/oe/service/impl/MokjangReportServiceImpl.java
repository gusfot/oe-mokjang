package kr.ch.oe.service.impl;

import java.util.List;

import kr.ch.oe.dao.MokjangReportMapper;
import kr.ch.oe.dao.ReportMapper;
import kr.ch.oe.model.MokjangReport;
import kr.ch.oe.model.MokjangReportExample;
import kr.ch.oe.model.MokjangReportExample.Criteria;
import kr.ch.oe.model.Report;
import kr.ch.oe.service.MokjangReportService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MokjangReportServiceImpl implements MokjangReportService {

	@Autowired
	private MokjangReportMapper mokjangReportMapper;
	
	@Autowired
	private ReportMapper reportMapper;
	
	@Transactional
	@Override
	public boolean regist(MokjangReport mokjangReport) {
		boolean result = false;
		
		try{
			
			mokjangReportMapper.insertSelective(mokjangReport);
			
			for( Report report : mokjangReport.getReports()) {
				reportMapper.insertSelective(report);
			}
		
			result = true;
			
		}catch(Exception e) {
			
			e.printStackTrace();
			result = false;
			
		}
		
		return result;
	}

	@Override
	public MokjangReport getMokjangReport(long mokjangReportSeq) {
		return mokjangReportMapper.selectByPrimaryKey(mokjangReportSeq);
	}

	@Override
	public List<MokjangReport> getMokjangReports(long deptSeq) {
		MokjangReportExample example = new MokjangReportExample();
		Criteria criteria = example.createCriteria();
		criteria.andDeptSeqEqualTo(deptSeq);
//		criteria.andWeeksEqualTo(weeks);
		
		return mokjangReportMapper.selectByExample(example );
	}


}
