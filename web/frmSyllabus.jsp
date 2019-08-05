<%-- 
    Document   : frmSyllabus
    Created on : Oct 26, 2015, 1:23:01 PM
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
                if(ext !="pdf")
                {
                    alert("Upload pdf File only Can't Upload" + ext);
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
        <form class="form-horizontal" enctype="multipart/form-data" action="bllSyllabus.jsp" method="post" name="frm" onsubmit="return validateForm();" >
            <div class="container-fluid">
                <div class="panel panel-primary">
                    <div class="panel-heading"><h4><b>Upload Student Information</b></h4></div>
  <div class="panel-body">
      <div class="col-sm-12">
                    <div class="form-group">
                        <div class="col-sm-2">
                            <label class="control-label">File Type</label>
                        </div>
                        <div class="col-sm-3">
                            <select name="Select_File_Type" class="form-control">
                                <option value="0">--Select--</option>
                                <option value="Syllabus">Syllabus</option>
                                <option value="Scheme">Scheme</option>
                                
                            </select>
                        </div>
                        <div class="col-sm-2">
                            <label class="control-label">Session</label>
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
                        
                    </div>
      </div>
      <div class="col-sm-12">
                    <div class="form-group">
                        <div class="col-sm-2">
                            <label class="control-label">Semester</label>
                        </div>
                        <div class="col-sm-3">
                            <select name="Select_Sem" class="form-control">
                                <option>--Select--</option>
                                <option value="Even">Even</option>
                                <option value="Odd">Odd</option>
                            </select>
                        </div>
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
