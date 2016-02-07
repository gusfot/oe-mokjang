package kr.ch.oe.service;

import java.util.List;

import kr.ch.oe.common.Paging;
import kr.ch.oe.model.Notice;

/**
 * 공지사항 관련 Service
 * @author gusfot
 *
 */
public interface NoticeService {

	/**
	 * 공지사항 단건 조회
	 * @param noticeSeq
	 * @return
	 */
	Notice getNotice(long noticeSeq);
	
	/**
	 * 공지사항 목록조회
	 * @return
	 */
	List<Notice> getNoticeList();
	
	/**
	 * 공지사항 등록
	 * @param notice
	 * @return
	 */
	boolean regist(Notice notice);
	
	/**
	 * 공지사항 수정
	 * @param notice
	 * @return
	 */
	boolean modify(Notice notice);
	
	/**
	 * 공지사항 삭제
	 * @param noticeSeq
	 * @return
	 */
	boolean remove(long noticeSeq);
	
	/**
	 * 페이징된 공지사항 목록 조회
	 * @return
	 */
	Paging<Notice> getPagedNoticeList();
	
}
