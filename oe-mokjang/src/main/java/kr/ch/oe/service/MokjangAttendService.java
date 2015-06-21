package kr.ch.oe.service;

import java.util.List;

import kr.ch.oe.model.MokjangAttend;

public interface MokjangAttendService {

	boolean regist(MokjangAttend mokjangAttend);

	MokjangAttend getMokjangAttend(long mokjangReportSeq);

	List<MokjangAttend> getMokjangAttends(int deptSeq);

	boolean isSubmited(int deptSeq, int weeks);

}
