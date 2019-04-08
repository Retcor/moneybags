package com.moneybags.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Debt {
    private Long debtIdSeq;
    private Long budgIdSeq;
    private String descr;
    private BigDecimal payAmount;
    private Date dueDate;
    private BigDecimal rate;
    private BigDecimal totalLeft;

    public Long getDebtIdSeq() {
        return debtIdSeq;
    }

    public void setDebtIdSeq(Long debtIdSeq) {
        this.debtIdSeq = debtIdSeq;
    }

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

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getTotalLeft() {
        return totalLeft;
    }

    public void setTotalLeft(BigDecimal totalLeft) {
        this.totalLeft = totalLeft;
    }
}
