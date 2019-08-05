<%-- 
    Document   : frmStudent
    Created on : Oct 4, 2015, 10:56:20 AM
    Author     : VAIBHAV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="frmNavigationbar.jsp" %>

        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript"> 
            function validateForm()
            {
                var fup = document.getElementById('file1');
        var fileName = fup.value;
        var ext = fileName.substring(fileName.lastIndexOf('.') + 1);

                // onsubmit="return validateForm()" write on form tag
                //alert("Sorry");
                if(document.frm.file1.value =="")
                {
                    alert("Select the file");
                    return false;
                }
                if(ext !="csv")
                {
                    alert("Upload csv File only Can't Upload" + ext);
                    return false;   
                }
                else
                {
                    return  true;
                }
            }   
    
    
</script>
    </head>
    <body> 
        <form enctype="multipart/form-data" action="bllStudent.jsp" method="post" name="frm" onsubmit="return validateForm();" >
            <div class="container-fluid">
                <div class="panel panel-primary">
                    <div class="panel-heading"><h4><b>Upload Student Information</b></h4></div>
  <div class="panel-body">
      <div class="col-sm-12">
                    <div class="form-group">
                        <div class="col-sm-2">
                            <label class="control-label">Upload File</label>
                        </div>
                        <div class="col-sm-3">
                            <INPUT class="file" name="file1" id="file1" type="file" data-show-upload="false" data-show-caption="true">
                        </div>
                        
                    </div>
                </div>
      
  </div>
  <div class="panel-footer">
          <INPUT TYPE="submit" class="btn btn-primary" name="btn" VALUE="SAVE">
  
  </div>
</div>
            </div>            

             </form>
    </body>
</html>
