package com.ts.library.entity;

import java.util.Date;

/**
 * Created by ASpiralMoon on 2017/1/6.
 * 租借信息实体类
 */
public class BorrowInfo {

    private Short infoId;
    private String name;
    private String title;
    private String administrator;
    private Date applyBorrowingTime;
    private Date approvalBorrowingTime;
    private Date returnTime;
    private String borrowingStatus;

    public Short getInfoId() {
        return infoId;
    }

    public void setInfoId(Short infoId) {
        this.infoId = infoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdministrator() {
        return administrator;
    }

    public void setAdministrator(String administrator) {
        this.administrator = administrator;
    }

    public Date getApplyBorrowingTime() {
        return applyBorrowingTime;
    }

    public void setApplyBorrowingTime(Date applyBorrowingTime) {
        this.applyBorrowingTime = applyBorrowingTime;
    }

    public Date getApprovalBorrowingTime() {
        return approvalBorrowingTime;
    }

    public void setApprovalBorrowingTime(Date approvalBorrowingTime) {
        this.approvalBorrowingTime = approvalBorrowingTime;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public String getBorrowingStatus() {
        return borrowingStatus;
    }

    public void setBorrowingStatus(String borrowingStatus) {
        this.borrowingStatus = borrowingStatus;
    }

    @Override
    public String toString() {
        return "BorrowInfo{" +
                "infoId=" + infoId +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", administrator='" + administrator + '\'' +
                ", applyBorrowingTime=" + applyBorrowingTime +
                ", approvalBorrowingTime=" + approvalBorrowingTime +
                ", returnTime=" + returnTime +
                ", borrowingStatus='" + borrowingStatus + '\'' +
                '}';
    }
}
