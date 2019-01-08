package com.example.kbfinancialjpa.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "BANK")
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BANK_ID")
    private Long bank_Id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ADDRESS_LINE_1")
    private String address_line_1;

    @Column(name = "ADDRESS_LINE_2")
    private String address_line_2;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STATE")
    private String state;

    @Column(name = "ZIP_CODE")
    private String zip_code;

    @Column(name = "IS_INTERNATIONAL")
    private String is_international;

    @Column(name = "LAST_UPDATED_BY")
    private String last_updated_by;

    @Column(name = "LAST_UPDATED_DATE")
    private Date last_updated_Date;

    @Column(name = "CREATED_BY")
    private String created_by;

    @Column(name = "CREATED_DATE")
    private Date created_date;

    @Column(name = "ADDRESS_TYPE")
    private String address_type;

    public Bank() {
    }

    public Bank(Long bank_Id, String name, String address_line_1, String address_line_2, String city, String state, String zip_code, String is_international, String last_updated_by, Date last_updated_Date, String created_by, Date created_date, String address_type) {
        this.bank_Id = bank_Id;
        this.name = name;
        this.address_line_1 = address_line_1;
        this.address_line_2 = address_line_2;
        this.city = city;
        this.state = state;
        this.zip_code = zip_code;
        this.is_international = is_international;
        this.last_updated_by = last_updated_by;
        this.last_updated_Date = last_updated_Date;
        this.created_by = created_by;
        this.created_date = created_date;
        this.address_type = address_type;
    }

    public Long getBank_Id() {
        return bank_Id;
    }

    public void setBank_Id(Long bank_Id) {
        this.bank_Id = bank_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress_line_1() {
        return address_line_1;
    }

    public void setAddress_line_1(String address_line_1) {
        this.address_line_1 = address_line_1;
    }

    public String getAddress_line_2() {
        return address_line_2;
    }

    public void setAddress_line_2(String address_line_2) {
        this.address_line_2 = address_line_2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getIs_international() {
        return is_international;
    }

    public void setIs_international(String is_international) {
        this.is_international = is_international;
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

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public String getAddress_type() {
        return address_type;
    }

    public void setAddress_type(String address_type) {
        this.address_type = address_type;
    }
}
