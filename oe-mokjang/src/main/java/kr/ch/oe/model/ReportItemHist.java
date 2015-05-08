package kr.ch.oe.model;

import java.util.Date;

public class ReportItemHist {

    private Long reportItemHistSeq;

    private String itemCode;

    private Long itemValue;

    private Long reportSeq;

    private Date regTime;

    public Long getReportItemHistSeq() {
        return reportItemHistSeq;
    }

    public void setReportItemHistSeq(Long reportItemHistSeq) {
        this.reportItemHistSeq = reportItemHistSeq;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public Long getItemValue() {
        return itemValue;
    }

    public void setItemValue(Long itemValue) {
        this.itemValue = itemValue;
    }

    public Long getReportSeq() {
        return reportSeq;
    }

    public void setReportSeq(Long reportSeq) {
        this.reportSeq = reportSeq;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }
}