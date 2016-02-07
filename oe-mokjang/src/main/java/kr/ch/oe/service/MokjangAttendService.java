package kr.ch.oe.service;

import java.util.List;

import kr.ch.oe.model.MokjangAttend;

public interface MokjangAttendService {

	/**
	 *
	 * @param mokjangAttend
	 * @return
	 */
	boolean regist(MokjangAttend mokjangAttend);

	MokjangAttend getMokjangAttend(long mokjangReportSeq);

	List<MokjangAttend> getMokjangAttends(long deptSeq);

	MokjangAttend getMokjangAttend(long deptSeq, int weeks);

	boolean modify(MokjangAttend mokjangAttend);

	boolean isSubmited(long deptSeq, int weeks);
	
}
