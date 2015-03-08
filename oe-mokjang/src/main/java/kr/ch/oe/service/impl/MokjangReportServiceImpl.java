package kr.ch.oe.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		
		Map<String, Object> params = new HashMap<>();
		params.put("mokjangReportSeq", mokjangReportSeq);
		return mokjangReportMapper.selectMokjangReport(params );
		//return mokjangReportMapper.selectByPrimaryKey(mokjangReportSeq);
	}

	@Override
	public List<MokjangReport> getMokjangReports(long deptSeq) {
		
		MokjangReportExample example = new MokjangReportExample();
		Criteria criteria = example.createCriteria();
		criteria.andDeptSeqEqualTo(deptSeq);
//		criteria.andWeeksEqualTo(weeks);
		
		return mokjangReportMapper.selectByExample(example );
	}

	
	@Override
	public MokjangReport getMokjangReport(long deptSeq, int weeks) {
		
		MokjangReportExample example = new MokjangReportExample();
		Criteria criteria = example.createCriteria();
		criteria.andDeptSeqEqualTo(deptSeq);
		criteria.andWeeksEqualTo(weeks);

		List<MokjangReport> mokjangReports =mokjangReportMapper.selectByExample(example );
		
		return mokjangReports.size() > 0 ? mokjangReports.get(0) : null;
	}

	@Override
	public boolean modify(MokjangReport mokjangReport) {
		// TODO 목장보고서 수정 구현
		return false;
	}


}
