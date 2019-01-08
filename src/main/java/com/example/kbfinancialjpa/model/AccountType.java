package com.example.kbfinancialjpa.model;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class AccountType {

    private int accountType_id;


    private String name;


    private Date last_updated_date;

    private String last_updated_by;

    private Date created_date;

    private String created_by;

    public AccountType(int account_type_id, String name, Date last_updated_date, String last_updated_by, Date created_date, String created_by) {
        this.account_type_id = account_type_id;
        this.name = name;
        this.last_updated_date = last_updated_date;
        this.last_updated_by = last_updated_by;
        this.created_date = created_date;
        this.created_by = created_by;
    }

    public int getAccount_type_id() {
        return account_type_id;
    }

    public void setAccount_type_id(int account_type_id) {
        this.account_type_id = account_type_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLast_updated_date() {
        return last_updated_date;
    }

    public void setLast_updated_date(Date last_updated_date) {
        this.last_updated_date = last_updated_date;
    }

    public String getLast_updated_by() {
        return last_updated_by;
    }

    public void setLast_updated_by(String last_updated_by) {
        this.last_updated_by = last_updated_by;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }
}