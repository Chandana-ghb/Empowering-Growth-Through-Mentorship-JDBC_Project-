package com.controller;

import java.io.IOException;

import com.DAO.RegDAOLayer;
import com.Model.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/login")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String email=request.getParameter("mail");
	String pass=request.getParameter("password");
	
	Student s=new Student();

	s.setEmail(email);
	s.setPass(pass);
	
	RegDAOLayer rdao=new RegDAOLayer();
	
	String status=rdao.checkData(s);
	
	if(status.equals("fail")) {
		RequestDispatcher r=request.getRequestDispatcher("login.html");
		r.forward(request, response);
	}
	else {
		RequestDispatcher r=request.getRequestDispatcher("Dashboard.html");
		r.forward(request, response);
	}
		
	}

}

