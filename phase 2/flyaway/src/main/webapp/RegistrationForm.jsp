<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body >
<br>
<a href=index.jsp style="color:black;text-decoration:none ;font-size:35px;font-weight:bold;">FlyAway</a>
<br><br>

<form action=RegistrationForm method=post>
	<label for=email>Email : </label> <input type="email" name=email id=email /><br><br>
	<label for=pass>Password : </label> <input type="password" name=password id=pass /><br><br>
	<label for=name>Name : </label> <input type="text" name=name id=name /><br><br>
	<label for=phno>Phone No. : </label> <input type="text" name=phno id=phno /><br><br>
	<input type=submit value=submit /> <input type=reset />
</form>

</body>
</html>