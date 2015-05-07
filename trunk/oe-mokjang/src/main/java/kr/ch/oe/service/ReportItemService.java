package kr.ch.oe.service;

import java.util.List;
import java.util.Map;

import kr.ch.oe.model.ReportItem;

public interface ReportItemService {

	List<ReportItem> getList(Map<String, Object> params);

}
