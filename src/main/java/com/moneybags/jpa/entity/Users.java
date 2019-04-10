package com.moneybags.jpa.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by dan on 2/18/15.
 */
@Entity
@Table(name = "USERS")
public class Users {// extends BasePersistenceJpa {
    private static final long serialVersionUID = -1093515711353444437L;

    private Long userIdSeq;
    private String userName;
    private String password;

    private Set<Budgets> budgets = new HashSet<>();

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "USER_ID_SEQ", nullable = false, precision = 11, scale = 0)
    public Long getUserIdSeq() {
        return userIdSeq;
    }

    public void setUserIdSeq(Long userIdSeq) {
        this.userIdSeq = userIdSeq;
    }

    @Column(name = "USER_NAME", nullable = false, length = 20)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "PASSWORD", nullable = false, length = 20)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
    public Set<Budgets> getBudgets() {
        return budgets;
    }

    public void setBudgets(Set<Budgets> budgets) {
        this.budgets = budgets;
    }
}
