/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.dao;


import com.sms.model.Student;
import org.hibernate.*;

/**
 *
 * @author hnjej
 */
public class StudentDAO {

    public boolean createStudent(Student student) {
        boolean result=false;
        Session session=FactoryManager.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        session.save(student);
        tx.commit();
        session.close();
        result=Boolean.TRUE;
        return result;
    }

    public boolean updateStudent(Student student) {
        boolean result=false;
        Session session=FactoryManager.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        session.update(student);
        tx.commit();
        session.close();
        result=Boolean.TRUE;
        return result;
    }
    
}
