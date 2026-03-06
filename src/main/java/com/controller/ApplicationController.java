package com.controller;

import java.io.IOException;

import com.DAO.RegisterDAO;
import com.Model.Register;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/abc")
public class ApplicationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sname=request.getParameter("sname");
		String roll=request.getParameter("roll");
		String section=request.getParameter("section");
		String course=request.getParameter("course");
		String dept=request.getParameter("dept");
		String mail=request.getParameter("mail");
		String pnumber=request.getParameter("pnumber");
		String fname=request.getParameter("fname");
		String mname=request.getParameter("mname");
		String gnumber=request.getParameter("gnumber");
		String address=request.getParameter("address");
		
		Register register=new Register();
		register.setSname(sname);
		register.setRoll(roll);
		register.setSection(section);
		register.setCourse(course);
		register.setDept(dept);
		register.setMail(mail);
		register.setPnumber(pnumber);
		register.setFname(fname);
		register.setMname(mname);
		register.setGnumber(gnumber);
		register.setAddress(address);
	
		RegisterDAO r=new RegisterDAO();
		r.sendData(register);
		
		
		response.sendRedirect("Dashboard.html");
	}

}
