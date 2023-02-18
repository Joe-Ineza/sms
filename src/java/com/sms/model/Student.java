/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 *
 * @author hnjej
 */
@Entity
public class Student implements Serializable{
    @Id
    private String payslip;
    private String fistName;
    private String lastName;
    private Date dob;
    private String email;
    private String password;
    private String nationality;
    private String faculty;
    private String department;
    private byte[] photolink;

    public Student() {
    }

    
    
    public Student(String payslip, String fistName, String lastName, Date dob, String email, String password, String nationality, String faculty, String department, byte[] photolink) {
        this.payslip = payslip;
        this.fistName = fistName;
        this.lastName = lastName;
        this.dob = dob;
        this.email = email;
        this.password = password;
        this.nationality = nationality;
        this.faculty = faculty;
        this.department = department;
        this.photolink = photolink;
    }

    public String getPayslip() {
        return payslip;
    }

    public void setPayslip(String payslip) {
        this.payslip = payslip;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public byte[] getPhotolink() {
        return photolink;
    }

    public void setPhotolink(byte[] photolink) {
        this.photolink = photolink;
    }

    
    
}
