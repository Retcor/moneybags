package com.moneybags.jpa.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by dan on 2/18/15.
 */
@Entity
@Table(name = "DEBTS")
public class Debts {// extends BasePersistenceJpa {
    private static final long serialVersionUID = 3083148956805081102L;

    private Long debtIdSeq;
    private Budgets budgets;
    private String descr;
    private BigDecimal payAmount;
    private Date dueDate;
    private BigDecimal rate;
    private BigDecimal totalLeft;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "DEBT_ID_SEQ", nullable = false, precision = 11, scale = 0)
    public Long getDebtIdSeq() {
        return debtIdSeq;
    }

    public void setDebtIdSeq(Long debtIdSeq) {
        this.debtIdSeq = debtIdSeq;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BUDG_ID_SEQ")
    public Budgets getBudgets() {
        return budgets;
    }

    public void setBudgets(Budgets budgets) {
        this.budgets = budgets;
    }

    @Column(name = "DESCR", nullable = false, length = 128)
    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @Column(name = "PAY_AMOUNT", precision = 11, scale = 2)
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DUE_DATE", length = 11)
    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Column(name = "RATE", precision = 11, scale = 2)
    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @Column(name = "TOTAL_LEFT", precision = 11, scale = 2)
    public BigDecimal getTotalLeft() {
        return totalLeft;
    }

    public void setTotalLeft(BigDecimal totalLeft) {
        this.totalLeft = totalLeft;
    }
}
