package com.example.kbfinancialjpa.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "ACCOUNT")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ACCOUNT_ID")
    private Long account_Id;

    @Column(name = "BANK_ID")
    private Long bank_Id;


    private AccountType accountType;

    @Column(name = "NAME")
    private String name;

    @Column(name = "INITIAL_BALANCE")
    private BigDecimal initialBalance;

    @Column(name = "CURRENT_BALANCE")
    private BigDecimal currentBalance;

    @Column(name = "OPEN_DATE")
    private Date open_date;

    @Column(name = "CLOSE_DATE")
    private Date close_date;

    @Column(name = "LAST_UPDATED_BY")
    private String last_updated_by;

    @Column(name = "LAST_UPDATED_DAT")
    private Date last_updated_date;

    @Column(name = "CREATED_BY")
    private String created_by;

    @Column(name = "CREATED_DATE")
    private Date created_date;

    public Account(Long account_Id, Long bank_Id, AccountType accountType, String name, BigDecimal initialBalance, BigDecimal currentBalance, Date open_date, Date close_date, String last_updated_by, Date last_updated_date, String created_by, Date created_date) {
        this.account_Id = account_Id;
        this.bank_Id = bank_Id;
        this.accountType = accountType;
        this.name = name;
        this.initialBalance = initialBalance;
        this.currentBalance = currentBalance;
        this.open_date = open_date;
        this.close_date = close_date;
        this.last_updated_by = last_updated_by;
        this.last_updated_date = last_updated_date;
        this.created_by = created_by;
        this.created_date = created_date;
    }

    public Long getAccount_Id() {
        return account_Id;
    }

    public void setAccount_Id(Long account_Id) {
        this.account_Id = account_Id;
    }

    public Long getBank_Id() {
        return bank_Id;
    }

    public void setBank_Id(Long bank_Id) {
        this.bank_Id = bank_Id;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(BigDecimal initialBalance) {
        this.initialBalance = initialBalance;
    }

    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Date getOpen_date() {
        return open_date;
    }

    public void setOpen_date(Date open_date) {
        this.open_date = open_date;
    }

    public Date getClose_date() {
        return close_date;
    }

    public void setClose_date(Date close_date) {
        this.close_date = close_date;
    }

    public String getLast_updated_by() {
        return last_updated_by;
    }

    public void setLast_updated_by(String last_updated_by) {
        this.last_updated_by = last_updated_by;
    }

    public Date getLast_updated_date() {
        return last_updated_date;
    }

    public void setLast_updated_date(Date last_updated_date) {
        this.last_updated_date = last_updated_date;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }
}