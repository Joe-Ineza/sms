/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.service;

import com.sms.model.Student;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author hnjej
 */
public interface StudentServiceInterface extends Remote{
    public void saveStudent(Student student) throws RemoteException;
     public void updateStudent(Student student) throws RemoteException;
}
