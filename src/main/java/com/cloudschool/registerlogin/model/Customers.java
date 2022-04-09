package com.cloudschool.registerlogin.model;

import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
//@Table(name = "customers")
public class Customers {
    @Id
    @GeneratedValue
    private Integer id;
    private String username;
    private String city;
    private String country;
    private Integer accountId;

    public Customers(Integer id, String username, String city, String country, Integer accountId) {
        this.id = id;
        this.username = username;
        this.city = city;
        this.country = country;
        this.accountId = accountId;
    }

    public Customers() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
