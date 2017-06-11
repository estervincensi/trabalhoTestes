package com.jardimBotanico.jardimBotanico.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by harley on 11/06/2017.
 */
@Entity
public class Account {

    @Id
    private  Long id;

    private String name;

    private String email;

    private String city;

    private String password;

    private String user;

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
