package kr.ch.oe.service;

import java.util.List;
import java.util.Map;

import kr.ch.oe.model.AttendItem;

public interface AttendItemService {

	List<AttendItem> getList(Map<String, Object> params);

}
