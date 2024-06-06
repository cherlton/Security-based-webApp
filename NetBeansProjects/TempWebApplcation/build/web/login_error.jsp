<%-- 
    Document   : login
    Created on : 06 Jun 2024, 1:53:08 AM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login!</h1>
        <p style="color: red;">
            Invalid login details!!Please enter login credentials:
        </p>
        <form action="j_security_check" method="POST">
            <table border="1">
                <thead>
                    <tr>
                        <th>Username:</th>
                        <th>
                            <input type="text" name="j_username" required="">
                        </th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Password:</td>
                        <td>
                              <input type="password" name="j_password" required="">
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                              <input type="submit" vaue="submit">
                        </td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
