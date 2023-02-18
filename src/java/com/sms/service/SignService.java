/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.service;

import com.sms.dao.SignDAO;
import com.sms.model.Sign;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;


/**
 *
 * @author joe7n
 */
public class SignService extends UnicastRemoteObject implements SignServiceInterface  {

    public SignService() throws RemoteException{
        super();
    }
    @Override
    public void createAccount(Sign sign) throws RemoteException {
        SignDAO signDao = new SignDAO();
        signDao.createAccount(sign);
    }

    @Override
    public void updateAccount(Sign sign) throws RemoteException {
       SignDAO signDao = new SignDAO();
       signDao.updateAccount(sign);
    }
    
      @Override
     public List<Sign> retrieveUsers() throws RemoteException{
         SignDAO signDao = new SignDAO();
         List<Sign> users = signDao.retrieveUsers();
         return users;
     }
   
    
}
