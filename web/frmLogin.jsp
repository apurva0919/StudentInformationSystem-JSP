<%-- 
    Document   : frmLogin
    Created on : Oct 6, 2015, 9:27:27 AM
    Author     : VAIBHAV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
    <head>
        <title>Login</title>
<!--        <link rel="shortcut icon" href="../favicon.ico" type="image/x-icon"/>-->
        <link rel="stylesheet" type="text/css" href="bootstrap/css/style.css" />
        <script src="bootstrap/js/cufon-yui.js" type="text/javascript"></script>
        <script src="bootstrap/js/ChunkFive_400.font.js" type="text/javascript"></script>
		<script type="text/javascript">
			Cufon.replace('h1',{ textShadow: '1px 1px #fff'});
			Cufon.replace('h2',{ textShadow: '1px 1px #fff'});
			Cufon.replace('h3',{ textShadow: '1px 1px #000'});
			Cufon.replace('.back');
		</script>
        <script type="text/javascript">
function alphanumeric(uadd)
{
    var letters = /^[0-9a-zA-Z]+$/;
    if(uadd.value.match(letters))
    {
    return true;
    }
    else
    {
   // alert(' address must have alphanumeric characters only');
    document.getElementById("demo").innerHTML = "*  Must have Alphanumeric Characters only ";
    uadd.focus();
    return false;
    }
}


 function validateForm(){
    
    if(document.frm.txtUserName.value == "")
    {
        alert('USER NAME SHOULD NOT BE LEFT BLANK');
//        document.getElementById("demo").innerHTML = "* USER NAME SHOULD NOT BE LEFT BLANK ";
        document.frm.txtUserName.focus();
        return false;
    }
     if(document.frm.txtPassword.value == "")
    {
       // document.getElementById("demo").innerHTML = "* PASSWORD SHOULD NOT BE LEFT BLANK ";
        alert("PASSWORD SHOULD NOT BE LEFT BLANK");
        document.frm.txtPassword.focus();
        return false;
    }
       if(alphanumeric(document.frm.txtUserName)==false)
       {
          return false; 
       }
       if(alphanumeric(document.frm.txtPassword)==false)
       {
          return false; 
       }    
    else
    {    
        return true;
    }
}

</script>
    </head>
    <body>
        <div class="wrapper">
            <h1><center>Student Information System</center></h1>
                <div class="content">
                        <div id="form_wrapper" class="form_wrapper">
                            <form class="login active" name="frm" method="post" action="bllLogin.jsp" onsubmit="return validateForm();">
                                        <h3>Login</h3>
                                        <div>
                                                <label>Username:</label>
                                                <input type="text" name="txtUserName" />
                                        </div>
                                        <div>
                                                <label>Password:</label>
                                                <input type="password" name="txtPassword" />

                                        </div>
                                        <div class="bottom">
                                                <div class="remember"><input type="checkbox"/><span>Keep me logged in</span></div>
                                                <input type="submit" value="Login" name="submit" />
                                                <div class="clear"></div>
                                        </div>
                                </form>
                        </div>
                        <div class="clear"></div>
                </div>
        </div>
		<!-- The JavaScript -->
		
    </body>
</html>
