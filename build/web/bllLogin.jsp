<%-- 
    Document   : bllLogin
    Created on : Oct 8, 2015, 11:25:17 AM
    Author     : VAIBHAV
--%>

<%@page import="pkgStudent.clsLogin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    
    clsLogin obj=new clsLogin();
    obj.User_Name=request.getParameter("txtUserName");
    obj.password=request.getParameter("txtPassword");
 //   obj.User_Type_Id=Integer.parseInt(request.getParameter("selectUserType"));
    obj.CheckValidation();
 
    if(obj.User_Type_Id > 0)
    //if(obj.User_Name.equals(null))
    {
 //   obj.CheckValidation();
     String name=obj.First_Name+" "+obj.Last_Name;
//     String password=obj.First_Name;
     session.setAttribute("username", name);
     response.sendRedirect("frmHome.jsp");
    }
    else 
    {
    // System.out.println("Wrong User Name Password");
     response.sendRedirect("frmLogin.jsp");

    }
    
     
%>
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
