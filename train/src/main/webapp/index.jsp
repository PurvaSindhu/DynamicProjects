<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
</head>
<body style="text-align: center">
<form action="login" method = post>
<h1>welcome to Indian Railway service</h1>
<pre>
Enter name :<input type=text placeholder="name" id=name name= "enterName">
Enter number :<input type=number placeholder="number" id=02 name= "enterNumber">
Train Type:<select name ="trainType">
<option value="select">Select</option>
<option value="indian express">Indian express</option>
<option value="mumbai express">mumbai express</option>
<option value="">Indian express</option>
<option value="rajdhani express">rajdhani express</option>
<option value="others">others</option>
</select>
Enter destination :<input type=text placeholder=" Enter destination" id=03 name= "destination">
Enter location:<input type=text placeholder="Enter location" id=04 name= "location">
<center><button>submit</button></center>
</pre>
</form>
</body>
</html>