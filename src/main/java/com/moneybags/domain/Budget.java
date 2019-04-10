package com.moneybags.domain;

public class Budget {
    private Long budgIdSeq;
    private Long userIdSeq;
    private String descr;

    public Long getBudgIdSeq() {
        return budgIdSeq;
    }

    public void setBudgIdSeq(Long budgIdSeq) {
        this.budgIdSeq = budgIdSeq;
    }

    public Long getUserIdSeq() {
        return userIdSeq;
    }

    public void setUserIdSeq(Long userIdSeq) {
        this.userIdSeq = userIdSeq;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
}
