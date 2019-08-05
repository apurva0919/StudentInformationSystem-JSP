<%-- 
    Document   : frmUserCreation
    Created on : 31 Oct, 2015, 10:32:19 AM
    Author     : Apurva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include  file="frmNavigationbar.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form class="form-horizontal"> 
        <div class="container-fluid">
                <div class="panel panel-primary">
                    <div class="panel-heading"><h4><b>User Creation</b></h4></div>
  <div class="panel-body">
      <div class="col-sm-12">
                    <div class="form-group">
                        <div class="col-sm-2">
                            <label class="control-label">Faculty Name</label>
                        </div>
                        <div class="col-sm-3">
                            <select name="Select_File_Type" class="form-control">
                                <option value="0">--Select--</option>
                                <option value="Syllabus">ASDSF hjdsfhd</option>
                                <option value="Scheme">dsfb kjdhf/option>
                                
                            </select>
                        </div>
                        <div class="col-sm-2">
                            <label class="control-label">User Name</label>
                        </div>
                        <div class="col-sm-3">
                            <input type="text" class="form-control"/>
                        </div>
                        
                    </div>
      </div>
      <div class="col-sm-12">
                    <div class="form-group">
                        <div class="col-sm-2">
                            <label class="control-label">Password</label>
                        </div>
                        <div class="col-sm-3">
                                                        <input type="text" class="form-control"/>
                        </div>
                        <div class="col-sm-2">
                            <label class="control-label">Confirm Password</label>
                        </div>
                        <div class="col-sm-3">
                                                        <input type="text" class="form-control"/>
                        </div>
                    </div>
      </div>
  </div>
  <div class="panel-footer">
          <INPUT TYPE="submit" class="btn btn-primary" name="btn" VALUE="Create User">
  
  </div>
</div>
            </div>  
        
    </foRm>
    </body>
</html>
