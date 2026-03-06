<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.Model.Register"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Details</title>
</head>

<body>

	<h1>Student Details</h1>

	<%
	Register student = (Register) request.getAttribute("student");

	if (student != null) {
	%>

	<p>
		<strong>Name:</strong>
		<%=student.getSname()%></p>
	<p>
		<strong>Roll Number:</strong>
		<%=student.getRoll()%></p>
	<p>
		<strong>Section:</strong>
		<%=student.getSection()%></p>
	<p>
		<strong>Course:</strong>
		<%=student.getCourse()%></p>
	<p>
		<strong>Department:</strong>
		<%=student.getDept()%></p>
	<p>
		<strong>Email:</strong>
		<%=student.getMail()%></p>
	<p>
		<strong>Phone Number:</strong>
		<%=student.getPnumber()%></p>
	<p>
		<strong>Father's Name:</strong>
		<%=student.getFname()%></p>
	<p>
		<strong>Mother's Name:</strong>
		<%=student.getMname()%></p>

	<%
	} else {
	%>

	<p>Student details not found.</p>

	<%
	}
	%>

</body>
</html>