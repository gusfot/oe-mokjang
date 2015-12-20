package kr.ch.oe.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.ch.oe.dao.MokjangReportMapper;
import kr.ch.oe.dao.ReportItemHistMapper;
import kr.ch.oe.dao.ReportMapper;
import kr.ch.oe.model.MokjangReport;
import kr.ch.oe.model.MokjangReportExample;
import kr.ch.oe.model.MokjangReportExample.Criteria;
import kr.ch.oe.model.Report;
import kr.ch.oe.model.ReportItemHist;
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
	
	@Autowired
	private ReportItemHistMapper reportItemHistMapper; 
	
	@Transactional
	@Override
	public boolean regist(MokjangReport mokjangReport) {
		
		boolean result = false;
		
		try{
			
			mokjangReportMapper.insertSelective(mokjangReport);
			
			for( Report report : mokjangReport.getReports()) {
				
				report.setMokjangReportSeq(mokjangReport.getMokjangReportSeq());
				reportMapper.insertSelective(report);
				
				for (ReportItemHist hist : report.getReportItemHistList()) {
					
					hist.setReportSeq(report.getReportSeq());
					reportItemHistMapper.insertSelective(hist);
				}
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
		
		return mokjangReportMapper.selectByExample(example );
	}

	
	@Override
	public MokjangReport getMokjangReport(long deptSeq, int weeks) {
		Map<String, Object> params = new HashMap<>();
		params.put("deptSeq", deptSeq);
		params.put("weeks", weeks);

		return mokjangReportMapper.selectMokjangReport(params );
	}

	@Override
	public boolean modify(MokjangReport mokjangReport) {
		boolean result = false;
		
		try{
			
			mokjangReportMapper.updateByPrimaryKeySelective(mokjangReport);
			
			for( Report report : mokjangReport.getReports()) {
				
				reportMapper.updateByPrimaryKeySelective(report);
				
				for (ReportItemHist hist : report.getReportItemHistList()) {
					
					reportItemHistMapper.updateByPrimaryKeySelective(hist);
				}
			}
		
			result = true;
			
		}catch(Exception e) {
			
			e.printStackTrace();
			result = false;
			
		}
		
		return result;
	}

	@Override
	public boolean isSubmited(long deptSeq, int weeks) {
		
		MokjangReportExample example = new MokjangReportExample();
		Criteria criteria = example.createCriteria();
		criteria.andDeptSeqEqualTo(deptSeq);
		criteria.andWeeksEqualTo(weeks);
		
		return mokjangReportMapper.selectByExample(example).size() > 0 ? true : false;
	}

	@Override
	public int getTotalPointByDeptSeq(long deptSeq) {
		return mokjangReportMapper.selectTotalPointByDeptSeq(deptSeq);
	}


}
