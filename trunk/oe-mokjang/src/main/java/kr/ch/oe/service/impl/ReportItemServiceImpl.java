package kr.ch.oe.service.impl;

import java.util.List;
import java.util.Map;

import kr.ch.oe.dao.ReportItemMapper;
import kr.ch.oe.model.ReportItem;
import kr.ch.oe.model.ReportItemExample;
import kr.ch.oe.service.ReportItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportItemServiceImpl implements ReportItemService {
	
	@Autowired
	private ReportItemMapper reportItemMapper;
	
	@Override
	public List<ReportItem> getList(Map<String, Object> params) {
		ReportItemExample example = new ReportItemExample();
		return reportItemMapper.selectByExampleWithBLOBs(example);
	}

}
