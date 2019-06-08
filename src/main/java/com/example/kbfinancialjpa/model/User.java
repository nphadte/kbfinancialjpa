package com.example.kbfinancialjpa.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "FINANCES_USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long user_Id;

    @Column(name = "FIRST_NAME")
    private String first_name;

    @Column(name = "LAST_NAME")
    private String last_name;

    @Column(name = "BIRTH_DATE", nullable = false)
    private Date birth_date;

    @Column(name = "EMAIL_ADDRESS")
    private String email_address;

    @Column(name = "LAST_UPDATED_BY")
    private String last_updated_by;

    @Column(name = "LAST_UPDATED_DATE")
    private Date last_updated_date;

    @Column(name = "CREATED_BY", updatable = false)
    private String created_by;

    @Column(name = "CREATED_DATE", updatable = false)
    private Date created_date;

    @Column(name = "USER_ADDRESS_LINE_1")
    private String user_address_line_1;

    @Column(name = "USER_ADDRESS_LINE_2")
    private String user_address_line_2;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STATE")
    private String state;

    @Column(name = "ZIP_CODE")
    private String zip_code;

    public User(Long user_Id, String first_name, String last_name, Date birth_date, String email_address, String last_updated_by, Date last_updated_date, String created_by, Date created_date, String user_address_line_1, String user_address_line_2, String city, String state, String zip_code) {
        this.user_Id = user_Id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.birth_date = birth_date;
        this.email_address = email_address;
        this.last_updated_by = last_updated_by;
        this.last_updated_date = last_updated_date;
        this.created_by = created_by;
        this.created_date = created_date;
        this.user_address_line_1 = user_address_line_1;
        this.user_address_line_2 = user_address_line_2;
        this.city = city;
        this.state = state;
        this.zip_code = zip_code;
    }

    public Long getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(Long user_Id) {
        this.user_Id = user_Id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
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

    public String getUser_address_line_1() {
        return user_address_line_1;
    }

    public void setUser_address_line_1(String user_address_line_1) {
        this.user_address_line_1 = user_address_line_1;
    }

    public String getUser_address_line_2() {
        return user_address_line_2;
    }

    public void setUser_address_line_2(String user_address_line_2) {
        this.user_address_line_2 = user_address_line_2;
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
}
