/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.dao;

import com.sms.model.Sign;
import com.sms.model.Student;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author joe7n
 */
public class SignDAO {
    public boolean createAccount(Sign sign) {
        boolean result=false;
        Session session=FactoryManager.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        session.save(sign);
        tx.commit();
        session.close();
        result=Boolean.TRUE;
        return result;
    }
    
    
    public List<Sign> retrieveUsers(){
        List<Sign> users = new ArrayList<>();
        Session ss=null;
        try{
            ss=FactoryManager.getSessionFactory().openSession();
            users = ss.createQuery("FROM ClientTable").list();
        }catch(HibernateException ex){
            JOptionPane.showMessageDialog(null, ex);
        }finally{
            if(ss!=null){
                ss.close();
            }
        }        
        return users;
    }
    
     public boolean updateAccount(Sign sign) {
        boolean result=false;
        Session session=FactoryManager.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        session.update(sign);
        tx.commit();
        session.close();
        result=Boolean.TRUE;
        return result;
    }
}


   


