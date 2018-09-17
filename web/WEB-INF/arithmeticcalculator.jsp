<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 13, 2018, 1:41:09 PM
    Author     : 659159
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="first" value="${first}"><br>
            Second: <input type="text" name="second" value="${second}"><br>
            <input type="submit" value="+" name="mathsym">
            <input type="submit" value="-" name ="mathsym">
            <input type="submit" value="*" name="mathsym">
            <input type="submit" value="%" name="mathsym">

        </form>
        <div>
           Result: ${answer}
        </div>
        <a href="age">Age Calculator</a>
    </body>
</html>
