package com.moneybags.jpa.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by dan on 2/18/15.
 */
@Entity
@Table(name = "EXPENSES")
public class Expenses {// extends BasePersistenceJpa {
    private static final long serialVersionUID = -5161180869111992028L;

    private Long expsIdSeq;
    private Budgets budgets;
    private String descr;
    private BigDecimal amount;
    private Date dueDate;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "EXPS_ID_SEQ", nullable = false, precision = 11, scale = 0)
    public Long getExpsIdSeq() {
        return expsIdSeq;
    }

    public void setExpsIdSeq(Long expsIdSeq) {
        this.expsIdSeq = expsIdSeq;
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

    @Column(name = "AMOUNT", precision = 11, scale = 2)
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DUE_DATE", length = 11)
    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
