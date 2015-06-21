package kr.ch.oe.service;

import java.util.List;

import kr.ch.oe.model.Attend;

public interface AttendService {

	boolean registAttends(List<Attend> attends);

	boolean regist(Attend attend);

	List<Attend> getAttends(long deptSeq, int weeks);

}
