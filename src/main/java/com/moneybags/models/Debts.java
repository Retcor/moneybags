package com.moneybags.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by dan on 2/18/15.
 */
@Entity
public class Debts {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private long user;
    private String description;
    private double payAmount;
    private Date dueDate;
    private double rate;
    private double totalLeft;

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

    public double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(double payAmount) {
        this.payAmount = payAmount;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getTotalLeft() {
        return totalLeft;
    }

    public void setTotalLeft(double totalLeft) {
        this.totalLeft = totalLeft;
    }
}
