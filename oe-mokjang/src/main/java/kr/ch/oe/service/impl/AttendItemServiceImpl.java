package kr.ch.oe.service.impl;

import java.util.List;
import java.util.Map;

import kr.ch.oe.dao.AttendItemMapper;
import kr.ch.oe.model.AttendItem;
import kr.ch.oe.model.AttendItemExample;
import kr.ch.oe.service.AttendItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttendItemServiceImpl implements AttendItemService {
	
	@Autowired
	private AttendItemMapper attendItemMapper;
	
	@Override
	public List<AttendItem> getList(Map<String, Object> params) {
		AttendItemExample example = new AttendItemExample();
		return attendItemMapper.selectByExampleWithBLOBs(example);
	}

}
