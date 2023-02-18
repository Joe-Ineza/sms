/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.service;

import com.sms.model.Sign;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;



/**
 *
 * @author joe7n
 */
public interface SignServiceInterface extends Remote {
     public void createAccount(Sign sign) throws RemoteException;
     public void updateAccount(Sign sign) throws RemoteException;
     public List<Sign> retrieveUsers() throws RemoteException;
}
