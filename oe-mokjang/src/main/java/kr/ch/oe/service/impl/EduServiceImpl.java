package kr.ch.oe.service.impl;

import java.util.List;
import java.util.Map;

import kr.ch.oe.dao.EduMapper;
import kr.ch.oe.dao.EduStatusMapper;
import kr.ch.oe.model.Edu;
import kr.ch.oe.model.EduExample;
import kr.ch.oe.model.EduStatus;
import kr.ch.oe.model.EduStatusExample;
import kr.ch.oe.service.EduService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EduServiceImpl implements EduService {

	@Autowired
	EduStatusMapper eduStatusMapper;
	
	@Autowired
	EduMapper eduMapper;
	
	@Override
	public boolean regist(EduStatus eduStatus) {
		return eduStatusMapper.insertSelective(eduStatus) > 0 ? true : false;
	}

	@Override
	public List<EduStatus> getEduStatusList(Map<String, Object> params) {
		EduStatusExample example = new EduStatusExample();
		// TODO : emample 재작성
		return eduStatusMapper.selectByExample(example );
	}

	@Override
	public EduStatus getEduStatus(Long eduStatusSeq) {
		return eduStatusMapper.selectByPrimaryKey(eduStatusSeq);
	}

	@Override
	public boolean registEdu(Edu edu) {
		return eduMapper.insertSelective(edu) > 0 ? true : false;
	}
	
	@Override
	public List<Edu> getEduList(Map<String, Object> params) {
		EduExample example = new EduExample();
		// TODO : example 재작성
		return eduMapper.selectByExample(example );
	}

	@Override
	public Edu getEdu(Long eduSeq) {
		return eduMapper.selectByPrimaryKey(eduSeq);
	}

	@Override
	public boolean modifyEdu(Edu edu) {
		return eduMapper.updateByPrimaryKeySelective(edu) > 0 ? true : false;
	}

	@Override
	public List<EduStatus> getEduStatusByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}
}
