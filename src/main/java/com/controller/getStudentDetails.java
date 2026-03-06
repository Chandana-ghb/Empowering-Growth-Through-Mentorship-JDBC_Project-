package com.controller;

import java.io.IOException;

import com.DAO.RegisterDAO;
import com.Model.Register;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/getStudentDetails")
public class getStudentDetails extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String roll = request.getParameter("roll");

        RegisterDAO dao = new RegisterDAO();
        Register student = dao.getStudentDetails(roll);

        if (student != null) {
            request.setAttribute("student", student);
            request.getRequestDispatcher("studentDetails.jsp").forward(request, response);
        } else {
            response.getWriter().println("Student not found.");
        }
    }
}