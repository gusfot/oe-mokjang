package kr.ch.oe.service;

import java.util.List;
import java.util.Map;

import kr.ch.oe.model.Edu;
import kr.ch.oe.model.EduStatus;

/**
 * 양육관련 Service
 * @author gusfot
 *
 */
public interface EduService {

	/**
	 * 양육상태 등록
	 * @param eduStatus
	 * @return
	 */
	public boolean regist(EduStatus eduStatus);

	/**
	 * 양육상태 목록조회
	 * @param params
	 * @return
	 */
	public List<EduStatus> getEduStatusList(Map<String, Object> params);
	
	/**
	 * 양육상태 단건조회
	 * @param eduStatusSeq
	 * @return
	 */
	public EduStatus getEduStatus(Long eduStatusSeq); 
	
	/**
	 * 양육시리즈 목록조회
	 * @param params
	 * @return
	 */
	public List<Edu> getEduList(Map<String, Object> params);

	/**
	 * 양육시리즈 단건 조회
	 * @param EduSeq
	 * @return
	 */
	public Edu getEdu(Long EduSeq);

	/**
	 * 양육시리즈 등록
	 * @param edu
	 * @return
	 */
	boolean registEdu(Edu edu);
	
	/**
	 * 양육시리즈 수정
	 * @param edu
	 * @return
	 */
	boolean modifyEdu(Edu edu);

	/**
	 * 사용자의 양육시리즈 현황 조회 
	 * @param userId
	 * @return
	 */
	public List<EduStatus> getEduStatusByUserId(String userId);
	
}
