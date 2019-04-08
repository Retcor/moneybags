package com.moneybags.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Expense {
    private Long expsIdSeq;
    private Long budgIdSeq;
    private String descr;
    private BigDecimal amount;
    private Date dueDate;

    public Long getExpsIdSeq() {
        return expsIdSeq;
    }

    public void setExpsIdSeq(Long expsIdSeq) {
        this.expsIdSeq = expsIdSeq;
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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
