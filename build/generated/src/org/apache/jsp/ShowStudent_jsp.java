package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import pkgStudent.clsStudent;

public final class ShowStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/frmNavigationbar.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    
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



      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");

if(session.getAttribute("username")==null)
{
response.sendRedirect("frmLogin.jsp");
}

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap/bootstrap.min.css\" /> <!-- Main stylesheet /-->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-default\">\n");
      out.write("         <div class=\"container\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("      </button>\n");
      out.write("        <a class=\"navbar-brand\" href=\"frmHome.jsp\"><b>SIS</b></a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("          <li class=\"dropdown\">\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Student<span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"frmStudent.jsp\">Upload</a></li>\n");
      out.write("            <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("            <li><a href=\"ShowStudent.jsp\">Report</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Staff<span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("              <li><a href=\"frmStaff.jsp\">Upload</a></li>\n");
      out.write("            <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("            <li><a href=\"ShowStaff.jsp\">Report</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Department<span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"frmCalender.jsp\">Academic Calender</a></li>\n");
      out.write("            <li><a href=\"ShowCalender.jsp\">Academic Calender Report</a></li>\n");
      out.write("            <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("            <li><a href=\"frmSyllabus.jsp\">Syllabus</a></li>\n");
      out.write("            <li><a href=\"ShowSyllabus.jsp\">Syllabus Report</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li><a href=\"#\">");
      out.print(session.getAttribute("username"));
      out.write("</a></li>\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\"><span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"#\">My Profile</a></li>\n");
      out.write("            <li><a href=\"#\">Account Setting</a></li>\n");
      out.write("            <li><a href=\"frmUserCreation.jsp\">Create User</a></li>\n");
      out.write("\n");
      out.write("            <li><a href=\"frmChangePassword.jsp\">Change Password</a></li>\n");
      out.write("            <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("            <li><a href=\"frmLogin.jsp\">Logout</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("       \n");
      out.write("      </ul>\n");
      out.write("    </div><!-- /.navbar-collapse -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("</nav>\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        \n");
      out.write("<script> \n");
      out.write("$(document).ready(function(){\n");
      out.write("    $(\"#flip\").click(function(){\n");
      out.write("        $(\"#panel\").slideToggle(\"slow\");\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write(" <script type=\"text/javascript\"> \n");
      out.write("            function validateForm()\n");
      out.write("            {\n");
      out.write("               var r=confirm(\"Really want to export the file\");\n");
      out.write("               if(r==true)\n");
      out.write("               {\n");
      out.write("                   alert(\"file exported sucessfully\");\n");
      out.write("                   return true;\n");
      out.write("                   \n");
      out.write("                  \n");
      out.write("               }\n");
      out.write("               else\n");
      out.write("               {\n");
      out.write("                   return false;\n");
      out.write("               }\n");
      out.write("            }   \n");
      out.write("    \n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"ShowStudent.jsp\" name=\"frm\" method=\"post\" >\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("        <div class=\"panel panel-primary\">\n");
      out.write("                    <div class=\"panel-heading\"><h4><b>List of Students</b></h4></div>\n");
      out.write("  <div class=\"panel-body\">\n");
      out.write("      \n");
      out.write("      <div  class=\"panel panel-success\">\n");
      out.write("                  <div id=\"flip\" class=\"panel panel-heading\">General Search</div>\n");
      out.write("                  <div id=\"panel\" class=\"panel panel-body\" style=\"display: none;\">\n");
      out.write("                       <div class=\"form-group\">\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <label class=\"control-label\">Enrollment No.</label>\n");
      out.write("                            </div>\n");
      out.write("                           <div class=\"col-sm-3\">\n");
      out.write("                                <label class=\"control-label\">Name</label>\n");
      out.write("                            </div>\n");
      out.write("                           <div class=\"col-sm-3\">\n");
      out.write("                                <label class=\"control-label\">Mobile No.</label>\n");
      out.write("                            </div>\n");
      out.write("                           <div class=\"col-sm-3\">\n");
      out.write("                               <label class=\"control-label\">&nbsp;</label>\n");
      out.write("                            </div>\n");
      out.write("                       </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <input class=\"form-control\" type=\"text\" name=\"SrchEnrollmentNo\">\n");
      out.write("                            </div>\n");
      out.write("                           <div class=\"col-sm-3\">\n");
      out.write("                                <input class=\"form-control\" type=\"text\" name=\"SrchName\">\n");
      out.write("                            </div>\n");
      out.write("                           <div class=\"col-sm-3\">\n");
      out.write("                                <input class=\"form-control\" type=\"text\" name=\"SrchMobileNo\">\n");
      out.write("                            </div>\n");
      out.write("                           <div class=\"col-sm-3\">\n");
      out.write("                               \n");
      out.write("                               <input class=\"btn btn-block\" type=\"submit\" value=\"Search\" name=\"btn\">\n");
      out.write("                               \n");
      out.write("                           </div>\n");
      out.write("                       </div>\n");
      out.write("                 </div>\n");
      out.write("                </div>\n");
      out.write("      <div class=\"col-sm-12\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                         <table class=\"table table-bordered table-striped table-hover\">\n");
      out.write("    <thead>\n");
      out.write("      <tr>\n");
      out.write("        <th></th>\n");
      out.write("        <th>Enrollment No</th>\n");
      out.write("        <th>Student</th>\n");
      out.write("        <th>Father Name</th>\n");
      out.write("        <th>Permanent Address</th>\n");
      out.write("        <th>Email</th>\n");
      out.write("        <th>Mobile_No</th>\n");
      out.write("        <th>Photograph</th>\n");
      out.write("      </tr>\n");
      out.write("    </thead>\n");
      out.write("            ");
while(rs.next())
            {
            
      out.write("\n");
      out.write("            <tbody>\n");
      out.write("            <tr>\n");
      out.write("                <td><a href=\"\" > SELECT </a>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(rs.getString("Enrollment_No"));
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(rs.getString("Student_Name"));
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(rs.getString("Father_Name"));
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(rs.getString("Permanent_Address"));
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(rs.getString("Email"));
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(rs.getString("Mobile_No"));
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(rs.getString("Photograph"));
      out.write("\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            </tbody>\n");
      out.write("         ");
}
      out.write("\n");
      out.write("        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("      \n");
      out.write("  </div>\n");
      out.write("  <div class=\"panel-footer\">\n");
      out.write(" <INPUT TYPE=\"submit\" class=\"btn btn-primary\" name=\"btn\" VALUE=\"CSV\">\n");
      out.write(" <INPUT TYPE=\"submit\" class=\"btn btn-primary\" name=\"btn\" VALUE=\"PDF\">\n");
      out.write("  \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    </div>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("                \n");
      out.write("           \n");
      out.write("        ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
