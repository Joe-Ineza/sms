/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.controller;

import com.sms.model.Sign;
import com.sms.service.SignService;
import com.sms.service.SignServiceInterface;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author joe7n
 */
public class Login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            String uname = request.getParameter("username");
            String pass = request.getParameter("password");
            SignServiceInterface signService = new SignService();
            List<Sign> credentials = signService.retrieveUsers();
            Iterator<Sign>  usersIter = credentials.iterator();
            boolean flag = false;
                System.out.println("Reached0");
                while(usersIter.hasNext())
                {
                      System.out.println("Reached0");
                    if(usersIter.next().getEmail().equals(uname) && usersIter.next().getPassword().equals(pass))
                    {
                         System.out.println("Reached1");
                         HttpSession session = request.getSession();
                         System.out.println("Reached2");
                         session.setAttribute("username",uname);
                         System.out.println("Reached3");
                         flag = true;
                         System.out.println("Reached4 "+flag);
                         response.sendRedirect("admission.html");
                    }
                }
                if(flag == false)
                {
                    response.sendRedirect("index.html");
                }
            
                
                
         
            
            
           
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
