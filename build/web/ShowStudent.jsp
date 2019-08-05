<%-- 
    Document   : ShowStudent
    Created on : Oct 4, 2015, 11:20:07 AM
    Author     : VAIBHAV
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="pkgStudent.clsStudent"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%    
    clsStudent obj=new clsStudent();
    //ResultSet rs=obj.select();
    if(request.getParameter("SrchEnrollmentNo")!=(null))
    {
    obj.EnrollmentNo=request.getParameter("SrchEnrollmentNo");
    }
    if(request.getParameter("SrchName")!=(null))
    {
    obj.Name=request.getParameter("SrchName");
    }
    if(request.getParameter("SrchMobileNo")!=(null))
    {
    obj.MobileNo=request.getParameter("SrchMobileNo");
    }
       ResultSet rs=obj.Search();


%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="frmNavigationbar.jsp" %>
        
<script> 
$(document).ready(function(){
    $("#flip").click(function(){
        $("#panel").slideToggle("slow");
    });
});
</script>
 <script type="text/javascript"> 
            function validateForm()
            {
               var r=confirm("Really want to export the file");
               if(r==true)
               {
                   alert("file exported sucessfully");
                   return true;
                   
                  
               }
               else
               {
                   return false;
               }
            }   
    
    
</script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ShowStudent.jsp" name="frm" method="post" >
            <div class="container-fluid">
        <div class="panel panel-primary">
                    <div class="panel-heading"><h4><b>List of Students</b></h4></div>
  <div class="panel-body">
      
      <div  class="panel panel-success">
                  <div id="flip" class="panel panel-heading">General Search</div>
                  <div id="panel" class="panel panel-body" style="display: none;">
                       <div class="form-group">
                            <div class="col-sm-3">
                                <label class="control-label">Enrollment No.</label>
                            </div>
                           <div class="col-sm-3">
                                <label class="control-label">Name</label>
                            </div>
                           <div class="col-sm-3">
                                <label class="control-label">Mobile No.</label>
                            </div>
                           <div class="col-sm-3">
                               <label class="control-label">&nbsp;</label>
                            </div>
                       </div>
                      <div class="form-group">
                            <div class="col-sm-3">
                                <input class="form-control" type="text" name="SrchEnrollmentNo">
                            </div>
                           <div class="col-sm-3">
                                <input class="form-control" type="text" name="SrchName">
                            </div>
                           <div class="col-sm-3">
                                <input class="form-control" type="text" name="SrchMobileNo">
                            </div>
                           <div class="col-sm-3">
                               
                               <input class="btn btn-block" type="submit" value="Search" name="btn">
                               
                           </div>
                       </div>
                 </div>
                </div>
      <div class="col-sm-12">
                    <div class="form-group">
                         <table class="table table-bordered table-striped table-hover">
    <thead>
      <tr>
        <th></th>
        <th>Enrollment No</th>
        <th>Student</th>
        <th>Father Name</th>
        <th>Permanent Address</th>
        <th>Email</th>
        <th>Mobile_No</th>
        <th>Photograph</th>
      </tr>
    </thead>
            <%while(rs.next())
            {
            %>
            <tbody>
            <tr>
                <td><a href="" > SELECT </a>
                </td>
                <td>
                    <%=rs.getString("Enrollment_No")%>
                </td>
                <td>
                    <%=rs.getString("Student_Name")%>
                </td>
                <td>
                    <%=rs.getString("Father_Name")%>
                </td>
                <td>
                    <%=rs.getString("Permanent_Address")%>
                </td>
                <td>
                    <%=rs.getString("Email")%>
                </td>
                <td>
                    <%=rs.getString("Mobile_No")%>
                </td>
                <td>
                    <%=rs.getString("Photograph")%>
                </td>
                
            </tr>
            </tbody>
         <%}%>
        </table>
                    </div>
                </div>
      
  </div>
  <div class="panel-footer">
 
  
  </div>
</div>
    </div>
        </form>
        
    </body>
</html>



        
                
           
        