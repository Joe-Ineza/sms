/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.controller;

import com.sms.model.Student;
import com.sms.service.StudentService;
import com.sms.service.StudentServiceInterface;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hnjej
 */
public class StudentRegistrationServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Student student = new Student();
            String payslip = request.getParameter("payslip");
            String firstName = request.getParameter("fname");
            String lastName = request.getParameter("lname");
            String dob = request.getParameter("dob");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String nationality = request.getParameter("nationality");
            String faculty = request.getParameter("faculty");
            String department = request.getParameter("department");
            String pic = request.getParameter("profile_pic");
            File image = new File(pic);
            FileInputStream inputStream=new FileInputStream(image);
             ByteArrayOutputStream bos=new ByteArrayOutputStream();
            byte[] buf= new byte[1024];
            for(int readNum; (readNum=inputStream.read(buf))!=-1;){
                bos.write(buf,0,readNum);
                byte[] student_image=null;
                
                student_image=bos.toByteArray();
                student.setPhotolink(student_image);
                
            }
            
            
            Date dateOfBirth = formatter.parse(dob);
            
            student.setPayslip(payslip);
            student.setFistName(firstName);
            student.setLastName(lastName);
            student.setDepartment(department);
            student.setDob(dateOfBirth);
            student.setFaculty(faculty);
            student.setEmail(email);
            student.setNationality(nationality);
            student.setPassword(password);
            StudentServiceInterface studentService = new StudentService();
            studentService.saveStudent(student);
            out.println("<h1>Student registered Successfully!</h1>");
            
            
        } catch (ParseException ex) {
            Logger.getLogger(StudentRegistrationServlet.class.getName()).log(Level.SEVERE, null, ex);
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
