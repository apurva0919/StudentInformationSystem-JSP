<%-- 
    Document   : frmNavigationbar
    Created on : Oct 5, 2015, 11:08:35 AM
    Author     : VAIBHAV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (session.getAttribute("username") == null) {
        response.sendRedirect("frmLogin.jsp");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <nav class="navbar navbar-default">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="frmHome.jsp"><b>SIS</b></a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Student<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="frmStudent.jsp">Upload</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="ShowStudent.jsp">Report</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Staff<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="frmStaff.jsp">Upload</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="ShowStaff.jsp">Report</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Department<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="frmCalender.jsp">Academic Calender</a></li>
                                <li><a href="ShowCalender.jsp">Academic Calender Report</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="frmSyllabus.jsp">Syllabus</a></li>
                                <li><a href="ShowSyllabus.jsp">Syllabus Report</a></li>
                            </ul>
                        </li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#"><%=session.getAttribute("username")%></a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="caret"></span></a>
                            <ul class="dropdown-menu">

                                <li><a href="frmChangePassword.jsp">Change Password</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="frmLogin.jsp">Logout</a></li>
                            </ul>
                        </li>

                    </ul>
                </div><!-- /.navbar-collapse -->

            </div>
        </nav>

    </body>
</html>
