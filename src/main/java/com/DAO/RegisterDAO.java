package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Model.Register;

public class RegisterDAO {
	public void sendData(Register reg) {
		String sname=reg.getSname();
		String roll=reg.getRoll();
		String section=reg.getSection();
		String course=reg.getCourse();
		String dept=reg.getDept();
		String mail=reg.getMail();
		String pnumber=reg.getPnumber();
		String fname=reg.getFname();
		String mname=reg.getMname();
		String gnumber=reg.getGnumber();
		String address=reg.getAddress();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "avnadmin";
			String password = "AVNS_9qX4X2KEIMV6ZdsAwAR";
			String url = "jdbc:mysql://mysql-1345440f-komaravoluchandana46-50c0.a.aivencloud.com:24468/defaultdb?ssl-mode=REQUIRED";
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement p=con.prepareStatement("insert into Application (sname,roll,section,course,dept,mail,pnumber,fname,mname,gnumber,address) values (?,?,?,?,?,?,?,?,?,?,?)");
			p.setString(1, sname);
			p.setString(2, roll);
			p.setString(3, section);
			p.setString(4, course);
			p.setString(5, dept);
			p.setString(6, mail);
			p.setString(7, pnumber);
			p.setString(8, fname);
			p.setString(9, mname);
			p.setString(10, gnumber);
			p.setString(11, address);
			
			int result=p.executeUpdate();
			if(result==0) {
				System.out.println("Something Went Wrong!!!!");
			}
			else {
				System.out.println("Success");
			}
		} 
		
		catch (Exception e) {
			e.printStackTrace();
	}
	
	}
	
	public Register getStudentDetails(String roll) {
        Register student = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String username = "avnadmin";
			String password = "AVNS_9qX4X2KEIMV6ZdsAwAR";
			String url = "jdbc:mysql://mysql-1345440f-komaravoluchandana46-50c0.a.aivencloud.com:24468/defaultdb?ssl-mode=REQUIRED";
			Connection con = DriverManager.getConnection(url, username, password);

            String query = "SELECT * FROM Application WHERE roll = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, roll);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                student = new Register();
                student.setSname(rs.getString("sname"));
                student.setRoll(rs.getString("roll"));
                student.setSection(rs.getString("section"));
                student.setCourse(rs.getString("course"));
                student.setDept(rs.getString("dept"));
                student.setMail(rs.getString("mail"));
                student.setPnumber(rs.getString("pnumber"));
                student.setFname(rs.getString("fname"));
                student.setMname(rs.getString("mname"));
                student.setGnumber(rs.getString("gnumber"));
                student.setAddress(rs.getString("address"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return student;
    }
	

}

