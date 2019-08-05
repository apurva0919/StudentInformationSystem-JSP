<%-- 
    Document   : ShowStaff
    Created on : 31 Oct, 2015, 10:13:00 AM
    Author     : Apurva
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
        <form action="bllStudent.jsp" name="frm" method="post" >
            <div class="container-fluid">
        <div class="panel panel-primary">
                    <div class="panel-heading"><h4><b>List of Staff</b></h4></div>
  <div class="panel-body">
      
      
      <div class="col-sm-12">
                    <div class="form-group">
                         <table class="table table-bordered table-striped table-hover">
    <thead>
      <tr>
        
        <th>Staff</th>
        <th>Permanent Address</th>
        <th>Email</th>
        <th>Mobile No</th>
        <th>Photograph</th>
      </tr>
    </thead>
            <%while(rs.next())
            {
            %>
            <tbody>
            <tr>
               
                
                <td>
                    <%=rs.getString("Student_Name")%>
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
                    <img src="images.jpg"/>
                </td>
                
            </tr>
            </tbody>
         <%}%>
        </table>
                    </div>
                </div>
      
  </div>
  <div class="panel-footer">
 <INPUT TYPE="submit" class="btn btn-primary" name="btn" VALUE="CSV">
 <INPUT TYPE="submit" class="btn btn-primary" name="btn" VALUE="PDF">
  
  </div>
</div>
    </div>
        </form>
        
    </body>
</html>

