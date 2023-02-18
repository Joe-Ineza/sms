/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author joe7n
 */

@Entity
public class Sign implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int stuId;
    private String userName;
    private String email;
    private String password;

    public Sign() {
    }

    public Sign(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

   

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
