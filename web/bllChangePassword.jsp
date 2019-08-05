<%-- 
    Document   : bllChangePassword
    Created on : Oct 22, 2015, 1:40:52 PM
    Author     : VAIBHAV
--%>
<%@page import="pkgStudent.clsChangePassword"%>
<%
clsChangePassword obj=new clsChangePassword();
obj.ChangePassword(request.getParameter("txtUserName"),request.getParameter("txtCurrentPassword"),request.getParameter("txtNewPassword"));
response.sendRedirect("frmChangePassword.jsp");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
