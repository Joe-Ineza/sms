/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.service;

import com.sms.dao.StudentDAO;
import com.sms.model.Student;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author hnjej
 */
public class StudentService extends UnicastRemoteObject implements StudentServiceInterface{

    public StudentService() throws RemoteException{
        super();
    }
    @Override
    public void saveStudent(Student student) throws RemoteException {
        StudentDAO studentDao=new StudentDAO();
        studentDao.createStudent(student);
    }
    
     @Override
    public void updateStudent(Student student) throws RemoteException {
        StudentDAO studentDao=new StudentDAO();
        studentDao.updateStudent(student);
    }
    
}
