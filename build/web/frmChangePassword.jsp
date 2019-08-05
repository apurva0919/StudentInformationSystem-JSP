<%-- 
    Document   : frmChangePassword
    Created on : Oct 22, 2015, 12:39:03 AM
    Author     : VAIBHAV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <%@include file="frmNavigationbar.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script>
            function validateForm()
            {
               
              if(document.frm.txtUserName.value == "")
                {
                    alert('USER NAME SHOULD NOT BE LEFT BLANK');
            //        document.getElementById("demo").innerHTML = "* USER NAME SHOULD NOT BE LEFT BLANK ";
                    document.frm.txtUserName.focus();
                    return false;
                }
                 if(document.frm.txtCurrentPassword.value == "")
                {
                   // document.getElementById("demo").innerHTML = "* PASSWORD SHOULD NOT BE LEFT BLANK ";
                    alert("CURRENT PASSWORD SHOULD NOT BE LEFT BLANK");
                    document.frm.txtCurrentPassword.focus();
                    return false;
                }
                if(document.frm.txtNewPassword.value == "")
                {
                   // document.getElementById("demo").innerHTML = "* PASSWORD SHOULD NOT BE LEFT BLANK ";
                    alert("NEW PASSWORD SHOULD NOT BE LEFT BLANK");
                    document.frm.txtNewPassword.focus();
                    return false;
                }
               if(document.frm.btn.value !="Update")
                {
                  //  alert("Select the file");
                    return false;
                }
                else
                {
                 if(confirm("Really want to change password")==true)
                 {
                    return  true; 
                 }
                 else
                    return  false;
                }
            }   
    
    
</script>
        <title>JSP Page</title>
    </head>
    <body>
            <div class="container-fluid">
                <div class="row">
        <div class="col-md-12">
            <form class="form-horizontal" action="bllChangePassword.jsp" method="post" name="frm" onsubmit="return validateForm();">
                <div class="panel panel-primary">
                    <div class="panel-heading"><h4><b>Change Password</b></h4></div>
  <div class="panel-body">
      <div class="col-sm-12">
                    <div class="form-group">
                        <div class="col-sm-2"></div>
                        <div class="col-sm-2">
                            <label class="control-label">User Name</label>
                        </div>
                        <div class="col-sm-4">
                            <INPUT class="form-control" name="txtUserName" type="text" >
                        </div>
                        <div class="col-sm-4"></div>
                        
                    </div>
                    <div class="form-group">
                                                <div class="col-sm-2"></div>
                        <div class="col-sm-2">
                            <label class="control-label">Current Password</label>
                        </div>
                        <div class="col-sm-4">
                            <INPUT class="form-control" name="txtCurrentPassword" type="password" >
                        </div>
                        <div class="col-sm-4"></div>
                        
                    </div>
          <div class="form-group">
                                                <div class="col-sm-2"></div>
                        <div class="col-sm-2">
                            <label class="control-label">New Password</label>
                        </div>
                        <div class="col-sm-4">
                            <INPUT class="form-control" name="txtNewPassword" type="password" >
                        </div>
                        <div class="col-sm-4"></div>
                        
                    </div>
        </div>      
  </div>
  <div class="panel-footer">
          <INPUT TYPE="submit" class="btn btn-primary" name="btn" VALUE="Update">
  </div>
</div>
            </form>        
            </div> 
                </div>
            </div>
    </body>
</html>
