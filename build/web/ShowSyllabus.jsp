<%-- 
    Document   : ShowSyllabus
    Created on : Oct 26, 2015, 1:36:03 PM
    Author     : VAIBHAV
--%>

<%@page import="pkgStudent.clsSyllabus"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
clsSyllabus obj=new clsSyllabus();
//ResultSet rs=obj.select();
    if(request.getParameter("Select_File_Type")!=(null))
    {
    obj.File_Type=request.getParameter("Select_File_Type");
    }
    if(request.getParameter("Select_Session")!=(null))
    {
    obj.Session=request.getParameter("Select_Session");
    }
    if(request.getParameter("Select_Sem")!=(null))
    {
    obj.Semester=request.getParameter("Select_Sem");
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ShowSyllabus.jsp" name="frm" method="post" >
            <div class="container-fluid">
        <div class="panel panel-primary">
                    <div class="panel-heading"><h4><b>List of Files</b></h4></div>
  <div class="panel-body">
      
      <div  class="panel panel-success">
                  <div id="flip" class="panel panel-heading">General Search</div>
                  <div id="panel" class="panel panel-body" style="display: none;">
                       <div class="form-group">
                            <div class="col-sm-3">
                                <label class="control-label">File Type</label>
                            </div>
                           <div class="col-sm-3">
                                <label class="control-label">Session</label>
                            </div>
                           <div class="col-sm-3">
                                <label class="control-label">Year</label>
                            </div>
                           <div class="col-sm-3">
                               <label class="control-label">&nbsp;</label>
                            </div>
                       </div>
                      <div class="form-group">
                            <div class="col-sm-3">
                                <select name="Select_File_Type" class="form-control">
                                <option value="0">--Select--</option>
                                <option value="Syllabus">Syllabus</option>
                                <option value="Scheme">Scheme</option>
                                
                            </select>
                            </div>
                           <div class="col-sm-3">
                                <select name="Select_Session" class="form-control">
                                <option value="0">--Select--</option>
                                <option value="2010-2011">2010-2011</option>
                                <option value="2011-2012">2011-2012</option>
                                <option value="2012-2013">2012-2013</option>
                                <option value="2013-2014">2013-2014</option>
                                <option value="2014-2015">2014-2015</option>
                                <option value="2015-2016">2015-2016</option>
                                <option value="2016-2017">2016-2017</option>
                                <option value="2017-2018">2017-2018</option>
                                <option value="2018-2019">2018-2019</option>
                            </select>
                            </div>
                           <div class="col-sm-3">
                               <select name="Select_Sem" class="form-control">
                                <option>--Select--</option>
                                <option value="Even">Even</option>
                                <option value="Odd">Odd</option>
                            </select>
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
        <th>Open</th>        
        <th>File Type</th>
        <th>Session</th>
        <th>Semester</th>
        
        
      </tr>
    </thead>
            <%while(rs.next())
            {
            %>
            <tbody>
            <tr>
                <td><a href="#" onclick="window.open('DATA/<%=rs.getString("File_Name")%>', 'sdd', 'width=600,height=600');return false;" ><%=rs.getString("File_Name")%> </a>
                </td>
                <td><%=rs.getString("File_Type")%></td>
                <td><%=rs.getString("Session")%></td>
                <td><%=rs.getString("Semester")%></td>
                
                
                
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
