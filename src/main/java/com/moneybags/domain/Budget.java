package com.moneybags.domain;

public class Budget {
    private Long budgIdSeq;
    private String descr;

    public Long getBudgIdSeq() {
        return budgIdSeq;
    }

    public void setBudgIdSeq(Long budgIdSeq) {
        this.budgIdSeq = budgIdSeq;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
}
