package kr.ch.oe.service.impl;

import kr.ch.oe.dao.MokjangMapper;
import kr.ch.oe.model.Member;
import kr.ch.oe.model.Mokjang;
import kr.ch.oe.service.MokjangService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MokjangServiceImpl implements MokjangService {

	@Autowired
	private MokjangMapper mokjangMapper;
	
	@Override
	public Mokjang getMokjangByLeader(Member member) {
		return mokjangMapper.selectMokjangById(member.getGroup().getMokjangId());
	}

}
