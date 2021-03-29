<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Boot Demo App</title>
</head>
<body>

	<H1>Employee Addition Form</H1>
	<form action="addEmployee">
	<input type="text" name="eID"><br>
	<input type="text" name="eName"><br>
	<input type="text" name="eSalary"><br>
	<input type="Submit"><br>
	</form>
	<H1>Employee Retrieval Form</H1>
	<form action="getEmployee">
	<input type="text" name="eID"><br>
	<input type="Submit"><br>
	</form>
	<H1>Employee Retrieval Form</H1>
	<form action="updEmployee">
	Enter ID of Employee to be Updated : <input type="text" name="eID" value="${Employee.eID}"><br>
	Employee New Name : <input type="text" name="eName" value="${Employee.eName}"><br>
	Employee New Salary : <input type="text" name="eSalary" value="${Employee.eSalary}"><br>
	<input type="Submit"><br>
	Employee Updated Details : 
	Employee Name : ${Employee.eName}
	Employee Salary :  ${Employee.eSalary}
	</form>
	</body>
</html>