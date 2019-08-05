package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class frmLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Login</title>\n");
      out.write("<!--        <link rel=\"shortcut icon\" href=\"../favicon.ico\" type=\"image/x-icon\"/>-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap/css/style.css\" />\n");
      out.write("        <script src=\"bootstrap/js/cufon-yui.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"bootstrap/js/ChunkFive_400.font.js\" type=\"text/javascript\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\tCufon.replace('h1',{ textShadow: '1px 1px #fff'});\n");
      out.write("\t\t\tCufon.replace('h2',{ textShadow: '1px 1px #fff'});\n");
      out.write("\t\t\tCufon.replace('h3',{ textShadow: '1px 1px #000'});\n");
      out.write("\t\t\tCufon.replace('.back');\n");
      out.write("\t\t</script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("function alphanumeric(uadd)\n");
      out.write("{\n");
      out.write("    var letters = /^[0-9a-zA-Z]+$/;\n");
      out.write("    if(uadd.value.match(letters))\n");
      out.write("    {\n");
      out.write("    return true;\n");
      out.write("    }\n");
      out.write("    else\n");
      out.write("    {\n");
      out.write("   // alert(' address must have alphanumeric characters only');\n");
      out.write("    document.getElementById(\"demo\").innerHTML = \"*  Must have Alphanumeric Characters only \";\n");
      out.write("    uadd.focus();\n");
      out.write("    return false;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(" function validateForm(){\n");
      out.write("    \n");
      out.write("    if(document.frm.txtUserName.value == \"\")\n");
      out.write("    {\n");
      out.write("        alert('USER NAME SHOULD NOT BE LEFT BLANK');\n");
      out.write("//        document.getElementById(\"demo\").innerHTML = \"* USER NAME SHOULD NOT BE LEFT BLANK \";\n");
      out.write("        document.frm.txtUserName.focus();\n");
      out.write("        return false;\n");
      out.write("    }\n");
      out.write("     if(document.frm.txtPassword.value == \"\")\n");
      out.write("    {\n");
      out.write("       // document.getElementById(\"demo\").innerHTML = \"* PASSWORD SHOULD NOT BE LEFT BLANK \";\n");
      out.write("        alert(\"PASSWORD SHOULD NOT BE LEFT BLANK\");\n");
      out.write("        document.frm.txtPassword.focus();\n");
      out.write("        return false;\n");
      out.write("    }\n");
      out.write("       if(alphanumeric(document.frm.txtUserName)==false)\n");
      out.write("       {\n");
      out.write("          return false; \n");
      out.write("       }\n");
      out.write("       if(alphanumeric(document.frm.txtPassword)==false)\n");
      out.write("       {\n");
      out.write("          return false; \n");
      out.write("       }    \n");
      out.write("    else\n");
      out.write("    {    \n");
      out.write("        return true;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <h1><center>Student Information System</center></h1>\n");
      out.write("                <div class=\"content\">\n");
      out.write("                        <div id=\"form_wrapper\" class=\"form_wrapper\">\n");
      out.write("                            <form class=\"login active\" name=\"frm\" method=\"post\" action=\"bllLogin.jsp\" onsubmit=\"return validateForm();\">\n");
      out.write("                                        <h3>Login</h3>\n");
      out.write("                                        <div>\n");
      out.write("                                                <label>Username:</label>\n");
      out.write("                                                <input type=\"text\" name=\"txtUserName\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>\n");
      out.write("                                                <label>Password:</label>\n");
      out.write("                                                <input type=\"password\" name=\"txtPassword\" />\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"bottom\">\n");
      out.write("                                                <div class=\"remember\"><input type=\"checkbox\"/><span>Keep me logged in</span></div>\n");
      out.write("                                                <input type=\"submit\" value=\"Login\" name=\"submit\" />\n");
      out.write("                                                <div class=\"clear\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clear\"></div>\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("\t\t<!-- The JavaScript -->\n");
      out.write("\t\t\n");
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
