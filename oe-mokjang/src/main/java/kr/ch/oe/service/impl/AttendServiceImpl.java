package kr.ch.oe.service.impl;

import java.util.List;

import kr.ch.oe.dao.AttendMapper;
import kr.ch.oe.model.Attend;
import kr.ch.oe.model.AttendExample;
import kr.ch.oe.model.AttendExample.Criteria;
import kr.ch.oe.service.AttendService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AttendServiceImpl implements AttendService {

	@Autowired
	private AttendMapper attendMapper;
	
	@Transactional
	@Override
	public boolean registAttends(List<Attend> attends) {
		boolean result = false;
		
		// TODO Controller 단에서 보고서 작성자의 deptSeq, userId 세팅
		try {
			for (Attend attend : attends) {
				attendMapper.insert(attend);
			}
			result = true;
		}catch(Exception e){
			e.printStackTrace();
			result = false;
		}
		
		return result;
	}
	
	@Override
	public boolean regist(Attend attend) {
		return attendMapper.insert(attend) > 0 ? true : false;
	}

	@Override
	public List<Attend> getAttends(long deptSeq, int weeks) {
		AttendExample example = new AttendExample();
		Criteria criteria = example.createCriteria();
		criteria.andDeptSeqEqualTo(deptSeq);	// 부서정보seq								
		criteria.andWeeksEqualTo(weeks);		// 몇번째주
		

		return attendMapper.selectByExample(example);
	}

}
