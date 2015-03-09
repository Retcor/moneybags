package com.moneybags.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by dan on 2/18/15.
 */
@Entity
public class Debt {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @Column(name = "user_id")
    private long userId;
    private String description;
    @Column(name="pay_amount")
    private double payAmount;
    @Column(name="due_date")
    @JsonFormat(pattern = "MM-dd-yyyy")
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

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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
