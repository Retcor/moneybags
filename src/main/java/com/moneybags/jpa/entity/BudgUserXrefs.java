package com.moneybags.jpa.entity;

import javax.persistence.*;

/**
 * Created by dan on 2/18/15.
 */
@Entity
@Table(name = "BUDG_USER_XREFS")
public class BudgUserXrefs {// extends BasePersistenceJpa {
    private static final long serialVersionUID = -8076740944812067915L;

    private Long buxfIdSeq;
    private Budgets budgets;
    private Users users;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "BUXF_ID_SEQ", nullable = false, precision = 11, scale = 0)
    public Long getBuxfIdSeq() {
        return buxfIdSeq;
    }

    public void setBuxfIdSeq(Long buxfIdSeq) {
        this.buxfIdSeq = buxfIdSeq;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BUDG_ID_SEQ")
    public Budgets getBudgets() {
        return budgets;
    }

    public void setBudgets(Budgets budgets) {
        this.budgets = budgets;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID_SEQ")
    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
