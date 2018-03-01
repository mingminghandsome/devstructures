package com.wish.mm.dao.sg.entity;

public class Member {
    private Integer memberId;

    private String memberCellphone;

    private String memberPassword;

    private String memberNickname;

    private String memberCoinaddress;

    private Integer memberDate;

    private String memberStatus;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberCellphone() {
        return memberCellphone;
    }

    public void setMemberCellphone(String memberCellphone) {
        this.memberCellphone = memberCellphone == null ? null : memberCellphone.trim();
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword == null ? null : memberPassword.trim();
    }

    public String getMemberNickname() {
        return memberNickname;
    }

    public void setMemberNickname(String memberNickname) {
        this.memberNickname = memberNickname == null ? null : memberNickname.trim();
    }

    public String getMemberCoinaddress() {
        return memberCoinaddress;
    }

    public void setMemberCoinaddress(String memberCoinaddress) {
        this.memberCoinaddress = memberCoinaddress == null ? null : memberCoinaddress.trim();
    }

    public Integer getMemberDate() {
        return memberDate;
    }

    public void setMemberDate(Integer memberDate) {
        this.memberDate = memberDate;
    }

    public String getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus == null ? null : memberStatus.trim();
    }
}