<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
<link rel="icon" href="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png">
<style>
    .formstyle{
        border : solid 2px;
        padding: 2vh;
        width: 40vh;
        margin-top: 150px;
        margin-left: 570px;
        border-radius: 10vh;
        box-shadow: 0px 10px 10px aqua;
        animation-timing-function: cubic-bezier(0.645, 0.045, 0.355, 1);
        white-space: nowrap;
        overflow: hidden;

    }
    @keyframes type{
        form{
        width: 0px;
        background: rgb(132, 217, 220);
        color: rgb(239, 238, 235);
        transform: translateY(-370);
        animation-timing-function: cubic-bezier(0.165, 0.84, 0.44, 1);
        }
    }
    .formstyle :hover {
        box-shadow: 0px 10px 7px #CC33CC;
        border-radius: 10vh;

    }
    label{
        font-size: 10px;
    }
    button{
        padding: 1vh;
        background-color: bisque;
        border-radius: 20px;
    }
    button :hover{
        background-color: black;
        border-radius: 10px;
    }
    
</style>

</head>
<body>
    <div class="formstyle">
<form action="login" method =get>
<pre>
<h1>login page</h1>
Enter Name : <input type="text" id=01 name="name"> <br> <br>
Enter Password : <input type="password" id="privacy" name="password"> <br> <br>
<label>date of birth</label>: <input type="date" id="dob" name="dob"> <br> <br>
Enter father Name : <input type="text" id="fname" name="fname"> <br> <br>
Enter mother Name : <input type="text" id="mname" name="mname"> <br> <br>
Enter Gender : <input type="radio" id="gender" name="gender" value=male><label>male</label> <input type="radio" id="gender" name="gender" value=female><label>female</label>

<center><button type="submit">submit</button></center>
</div>
</pre>
</form>
</body>
</html>