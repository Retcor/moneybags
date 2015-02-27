package com.moneybags.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by dan on 2/18/15.
 */
@Entity
public class Expenses {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private long user;
    private String description;
    private double amount;
    @Column(name="due_date")
    private Date dueDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUser() {
        return user;
    }

    public void setUser(long user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
