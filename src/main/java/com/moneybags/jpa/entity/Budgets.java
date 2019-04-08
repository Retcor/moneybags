package com.moneybags.jpa.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by dan on 2/18/15.
 */
@Entity
@Table(name = "BUDGETS")
public class Budgets {// extends BasePersistenceJpa {
    private static final long serialVersionUID = 3598306477480851088L;

    private Long budgIdSeq;
    private String descr;

    private Set<Expenses> expenses = new HashSet<>();
    private Set<Debts> debts = new HashSet<>();

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "BUXF_ID_SEQ", nullable = false, precision = 11, scale = 0)
    public Long getBudgIdSeq() {
        return budgIdSeq;
    }

    public void setBudgIdSeq(Long budgIdSeq) {
        this.budgIdSeq = budgIdSeq;
    }

    @Column(name = "DESCR", nullable = false, length = 128)
    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "budgets")
    public Set<Expenses> getExpenses() {
        return expenses;
    }

    public void setExpenses(Set<Expenses> expenses) {
        this.expenses = expenses;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "budgets")
    public Set<Debts> getDebts() {
        return debts;
    }

    public void setDebts(Set<Debts> debts) {
        this.debts = debts;
    }
}
