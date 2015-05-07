package kr.ch.oe.model;

import java.util.Date;
/**
 * 공지사항
 * @author gusfot
 *
 */
public class Notice {
    
    private Long noticeSeq;

    private String title;

    private String openYn;

    private String regId;

    private Date regTime;

    private String content;

    public Long getNoticeSeq() {
        return noticeSeq;
    }

    public void setNoticeSeq(Long noticeSeq) {
        this.noticeSeq = noticeSeq;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOpenYn() {
        return openYn;
    }

    public void setOpenYn(String openYn) {
        this.openYn = openYn;
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}