package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import pkgStudent.clsSyllabus;
import java.sql.ResultSet;

public final class ShowSyllabus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

clsSyllabus obj=new clsSyllabus();
ResultSet rs=obj.select();
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
       ResultSet rs1=obj.Search();

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
      out.write("        <a class=\"navbar-brand\" href=\"#\"><b>SIS</b></a>\n");
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
      out.write("        <li><a href=\"frmSyllabus.jsp\">Syllabus<span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("        <li><a href=\"ShowSyllabus.jsp\">Syllabus Report</a></li>\n");
      out.write("        <li ><a href=\"#\">Home<span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("        <li><a href=\"#\">About</a></li>\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Dropdown <span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"#\">Action</a></li>\n");
      out.write("            <li><a href=\"#\">Another action</a></li>\n");
      out.write("            <li><a href=\"#\">Something else here</a></li>\n");
      out.write("            <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("            <li><a href=\"#\">Separated link</a></li>\n");
      out.write("            <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("            <li><a href=\"#\">One more separated link</a></li>\n");
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
      out.write("            <li><a href=\"frmChangePassword.jsp\">Change Password</a></li>\n");
      out.write("            <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("            <li><a href=\"frmLogin.jsp\">Logout</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"frmLogin.jsp\">Logout</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div><!-- /.navbar-collapse -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("</nav>\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <script> \n");
      out.write("$(document).ready(function(){\n");
      out.write("    $(\"#flip\").click(function(){\n");
      out.write("        $(\"#panel\").slideToggle(\"slow\");\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"ShowSyllabus.jsp\" name=\"frm\" method=\"post\" >\n");
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
      out.write("                                <label class=\"control-label\">File Type</label>\n");
      out.write("                            </div>\n");
      out.write("                           <div class=\"col-sm-3\">\n");
      out.write("                                <label class=\"control-label\">Session</label>\n");
      out.write("                            </div>\n");
      out.write("                           <div class=\"col-sm-3\">\n");
      out.write("                                <label class=\"control-label\">Year</label>\n");
      out.write("                            </div>\n");
      out.write("                           <div class=\"col-sm-3\">\n");
      out.write("                               <label class=\"control-label\">&nbsp;</label>\n");
      out.write("                            </div>\n");
      out.write("                       </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <select name=\"Select_File_Type\" class=\"form-control\">\n");
      out.write("                                <option value=\"0\">--Select--</option>\n");
      out.write("                                <option value=\"Syllabus\">Syllabus</option>\n");
      out.write("                                <option value=\"Scheme\">Scheme</option>\n");
      out.write("                                \n");
      out.write("                            </select>\n");
      out.write("                            </div>\n");
      out.write("                           <div class=\"col-sm-3\">\n");
      out.write("                                <select name=\"Select_Session\" class=\"form-control\">\n");
      out.write("                                <option value=\"0\">--Select--</option>\n");
      out.write("                                <option value=\"2010-2011\">2010-2011</option>\n");
      out.write("                                <option value=\"2011-2012\">2011-2012</option>\n");
      out.write("                                <option value=\"2012-2013\">2012-2013</option>\n");
      out.write("                                <option value=\"2013-2014\">2013-2014</option>\n");
      out.write("                                <option value=\"2014-2015\">2014-2015</option>\n");
      out.write("                                <option value=\"2015-2016\">2015-2016</option>\n");
      out.write("                                <option value=\"2016-2017\">2016-2017</option>\n");
      out.write("                                <option value=\"2017-2018\">2017-2018</option>\n");
      out.write("                                <option value=\"2018-2019\">2018-2019</option>\n");
      out.write("                            </select>\n");
      out.write("                            </div>\n");
      out.write("                           <div class=\"col-sm-3\">\n");
      out.write("                               <select name=\"Select_Sem\" class=\"form-control\">\n");
      out.write("                                <option>--Select--</option>\n");
      out.write("                                <option value=\"Even\">Even</option>\n");
      out.write("                                <option value=\"Odd\">Odd</option>\n");
      out.write("                            </select>\n");
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
      out.write("        <th>Open</th>        \n");
      out.write("        <th>File Type</th>\n");
      out.write("        <th>Session</th>\n");
      out.write("        <th>Semester</th>\n");
      out.write("        <th>Path</th>\n");
      out.write("        \n");
      out.write("      </tr>\n");
      out.write("    </thead>\n");
      out.write("            ");
while(rs.next())
            {
            
      out.write("\n");
      out.write("            <tbody>\n");
      out.write("            <tr>\n");
      out.write("                <td><a href=\"#\" onclick=\"window.open('DATA/");
      out.print(rs.getString("File_Name"));
      out.write("', 'sdd', 'width=600,height=600');return false;\" >");
      out.print(rs.getString("File_Name"));
      out.write(" </a>\n");
      out.write("                </td>\n");
      out.write("                <td>");
      out.print(rs.getString("File_Type"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("Session"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("Semester"));
      out.write("</td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(rs.getString("Path_Name"));
      out.write("\n");
      out.write("                </td>\n");
      out.write("                \n");
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
