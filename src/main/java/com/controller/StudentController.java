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


@WebServlet("/cde")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("uname");
		String name1=request.getParameter("uname1");
		String email=request.getParameter("mail");
		String pass=request.getParameter("password");
		String pass1=request.getParameter("password1");

		
		Student student=new Student();
		
		student.setName(name);
		student.setName1(name1);
		student.setEmail(email);
		student.setPass(pass);
		student.setPass1(pass1);

		
		RegDAOLayer rd=new RegDAOLayer();
		String status=rd.sendData(student);
		
		if(status.equals("fail")) {
			RequestDispatcher r=request.getRequestDispatcher("Registration_Form.html");
			r.forward(request, response);
		}
		else {
			RequestDispatcher r=request.getRequestDispatcher("login.html");
			r.forward(request, response);
		}
		
	}

}

