package com.example.kbfinancialjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "TRANSACTION")
public class Transaction {

    @Id
    @Column(name = "TRANSACTION_ID")
    private String transaction_Id;

    @Column(name = "ACCOUNT_ID")
    private Long account_Id;

    @Column(name = "TRANSACTION_TYPE")
    private String transaction_type;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "AMOUNT")
    private BigDecimal amount;

    @Column(name = "INITIAL_BALANCE")
    private BigDecimal initial_balance;

    @Column(name = "CLOSING_BALANCE")
    private BigDecimal closing_balance;

    @Column(name = "NOTES")
    private String notes;

    @Column(name = "LAST_UPDATED_BY")
    private String last_updated_by;

    @Column(name = "LAST_UPDATED_DATE")
    private Date last_updated_Date;

    @Column(name = "CREATED_BY")
    private String created_by;

    @Column(name = "CREATED_DATE")
    private Date created_Date;

    public Transaction(String transaction_Id, Long account_Id, String transaction_type, String title, BigDecimal amount, BigDecimal initial_balance, BigDecimal closing_balance, String notes, String last_updated_by, Date last_updated_Date, String created_by, Date created_Date) {
        this.transaction_Id = transaction_Id;
        this.account_Id = account_Id;
        this.transaction_type = transaction_type;
        this.title = title;
        this.amount = amount;
        this.initial_balance = initial_balance;
        this.closing_balance = closing_balance;
        this.notes = notes;
        this.last_updated_by = last_updated_by;
        this.last_updated_Date = last_updated_Date;
        this.created_by = created_by;
        this.created_Date = created_Date;
    }


    public String getTransaction_Id() {
        return transaction_Id;
    }

    public void setTransaction_Id(String transaction_Id) {
        this.transaction_Id = transaction_Id;
    }

    public Long getAccount_Id() {
        return account_Id;
    }

    public void setAccount_Id(Long account_Id) {
        this.account_Id = account_Id;
    }

    public String getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getInitial_balance() {
        return initial_balance;
    }

    public void setInitial_balance(BigDecimal initial_balance) {
        this.initial_balance = initial_balance;
    }

    public BigDecimal getClosing_balance() {
        return closing_balance;
    }

    public void setClosing_balance(BigDecimal closing_balance) {
        this.closing_balance = closing_balance;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getLast_updated_by() {
        return last_updated_by;
    }

    public void setLast_updated_by(String last_updated_by) {
        this.last_updated_by = last_updated_by;
    }

    public Date getLast_updated_Date() {
        return last_updated_Date;
    }

    public void setLast_updated_Date(Date last_updated_Date) {
        this.last_updated_Date = last_updated_Date;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public Date getCreated_Date() {
        return created_Date;
    }

    public void setCreated_Date(Date created_Date) {
        this.created_Date = created_Date;
    }
}
