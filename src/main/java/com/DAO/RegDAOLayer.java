package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Model.Student;

public class RegDAOLayer {
	
	String status =null;
	
	public String sendData(Student s) {
		
		String name=s.getName();
		String name1=s.getName1();
		String email=s.getEmail();
		String pass=s.getPass();
		String pass1=s.getPass1();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String username = "avnadmin";
			String password = "AVNS_9qX4X2KEIMV6ZdsAwAR";
			String url = "jdbc:mysql://mysql-1345440f-komaravoluchandana46-50c0.a.aivencloud.com:24468/defaultdb?ssl-mode=REQUIRED";
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement p=con.prepareStatement("INSERT INTO Registration (FirstName,LastName,Email,Password,ConfirmPassword) VALUES (?,?,?,?,?)");
			
			p.setString(1, name);
			p.setString(2, name1);
			p.setString(3, email);
			p.setString(4, pass);
			p.setString(5, pass1);
			
			int result=p.executeUpdate();
			if(result==0) {
				System.out.println("Something went wrong !!!");
				status="fail";
			}
			else {
				System.out.println("Success !!!");
				status="success";

			}

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return status;
    }
	
	
	public String checkData(Student s) {
		String email=s.getEmail();
		String pass=s.getPass();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String username = "avnadmin";
			String password = "AVNS_9qX4X2KEIMV6ZdsAwAR";
			String url = "jdbc:mysql://mysql-1345440f-komaravoluchandana46-50c0.a.aivencloud.com:24468/defaultdb?ssl-mode=REQUIRED";
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement p=con.prepareStatement("select * from Registration where Email=? AND Password=?");
			
			
			p.setString(1, email);
			p.setString(2, pass);
			
			
			ResultSet result=p.executeQuery();
			if(result.next()) {
				System.out.println("Success !!!");
				status="success";
			}
			else {
				System.out.println("Something went wrong !!!");
				status="fail";

			}

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return status;
    }
	
}

