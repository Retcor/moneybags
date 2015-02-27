package com.moneybags.models;

import javax.persistence.*;
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
    @Column(name="pay_amount")
    private double payAmount;
    @Column(name="due_date")
    private Date dueDate;
    private double rate;
    @Column(name="total_left")
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
