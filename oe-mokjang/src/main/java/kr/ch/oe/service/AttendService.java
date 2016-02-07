package kr.ch.oe.service;

import java.util.List;

import kr.ch.oe.model.Attend;
/**
 * 예배, 모임참석 관리 서비스 
 * @author sunwoo-je
 *
 */
public interface AttendService {

	boolean registAttends(List<Attend> attends);

	boolean regist(Attend attend);

	List<Attend> getAttends(long deptSeq, int weeks);

}
