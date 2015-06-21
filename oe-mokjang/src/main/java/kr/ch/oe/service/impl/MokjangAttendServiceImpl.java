package kr.ch.oe.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.ch.oe.dao.AttendItemHistMapper;
import kr.ch.oe.dao.AttendMapper;
import kr.ch.oe.dao.MokjangAttendMapper;
import kr.ch.oe.model.Attend;
import kr.ch.oe.model.AttendItemHist;
import kr.ch.oe.model.MokjangAttend;
import kr.ch.oe.model.MokjangAttendExample;
import kr.ch.oe.model.MokjangAttendExample.Criteria;
import kr.ch.oe.service.MokjangAttendService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MokjangAttendServiceImpl implements MokjangAttendService {

	@Autowired
	private MokjangAttendMapper mokjangAttendMapper;
	
	@Autowired
	private AttendMapper attendMapper;
	
	@Autowired
	private AttendItemHistMapper attendItemHistMapper; 
	
	@Transactional
	@Override
	public boolean regist(MokjangAttend mokjangAttend) {
		
		boolean result = false;
		
		try{
			
			mokjangAttendMapper.insertSelective(mokjangAttend);
			
			for( Attend attend : mokjangAttend.getAttends()) {
				
				attend.setMokjangAttendSeq(mokjangAttend.getMokjangAttendSeq());
				attendMapper.insertSelective(attend);
				
				for (AttendItemHist hist : attend.getAttendItemHistList()) {
					
					hist.setAttendSeq(attend.getAttendSeq());
					attendItemHistMapper.insertSelective(hist);
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
	public MokjangAttend getMokjangAttend(long mokjangAttendSeq) {
		
		Map<String, Object> params = new HashMap<>();
		params.put("mokjangAttendSeq", mokjangAttendSeq);
		return mokjangAttendMapper.selectMokjangAttend(params );
		//return mokjangReportMapper.selectByPrimaryKey(mokjangReportSeq);
	}

	@Override
	public List<MokjangAttend> getMokjangAttends(long deptSeq) {
		
		MokjangAttendExample example = new MokjangAttendExample();
		Criteria criteria = example.createCriteria();
		criteria.andDeptSeqEqualTo(deptSeq);
		
		return mokjangAttendMapper.selectByExample(example );
	}

	
	@Override
	public MokjangAttend getMokjangAttend(long deptSeq, int weeks) {
		Map<String, Object> params = new HashMap<>();
		params.put("deptSeq", deptSeq);
		params.put("weeks", weeks);

		return mokjangAttendMapper.selectMokjangAttend(params );
	}

	@Override
	public boolean modify(MokjangAttend mokjangAttend) {
		boolean result = false;
		
		try{
			
			mokjangAttendMapper.updateByPrimaryKeySelective(mokjangAttend);
			
			for( Attend attend : mokjangAttend.getAttends()) {
				
				attendMapper.updateByPrimaryKeySelective(attend);
				
				for (AttendItemHist hist : attend.getAttendItemHistList()) {
					
					attendItemHistMapper.updateByPrimaryKeySelective(hist);
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
		
		MokjangAttendExample example = new MokjangAttendExample();
		Criteria criteria = example.createCriteria();
		criteria.andDeptSeqEqualTo(deptSeq);
		criteria.andWeeksEqualTo(weeks);
		
		return mokjangAttendMapper.selectByExample(example).size() > 0 ? true : false;
	}


}
