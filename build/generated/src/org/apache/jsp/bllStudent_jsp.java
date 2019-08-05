package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import pkgStudent.clsFile;
import pkgStudent.clsStudent;
import org.apache.commons.fileupload.*;
import java.util.*;
import java.io.*;

public final class bllStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
  
    Date obj1=new Date();
    String Hrs=Integer.toString(obj1.getHours());
    String Min=Integer.toString(obj1.getMinutes());
    String sec=Integer.toString(obj1.getSeconds());
    String FileName=""+Hrs+"-"+Min+"-"+sec+".csv";
    String PathName="C:/CSV/";
    
    String contentType = request.getContentType();
    if ((contentType != null) && (contentType.indexOf("multipart/form-data") >= 0)) 
    {
      clsStudent obj=new clsStudent();
      DiskFileUpload upload = new DiskFileUpload();
      List <FileItem> items = upload.parseRequest(request);
      FileItem  file = (FileItem) items.get(0);
      String source = file.getName();
    
      String Path=PathName+"Upload"+FileName;
      obj.Temp=Path;
      File outfile = new File(Path);
      file.write(outfile);
      //out.println("Upload Is Successful!");   
      ///Please Add the Jars and the Libraries
      obj.Upload();  
     // out.println("Data  Is Successful!");   

    clsFile objFile=new clsFile();
    objFile.File_Name=source;
    objFile.path=Path;
    objFile.Insert();
   out.println("File Uploaded  Successfully !");   

    }
    else
    {
    String opr=request.getParameter("btn");
    if(opr.equals("CSV"))
    {
     String Temp=PathName+"Download"+FileName;
    //String Temp="lkhj.csv";
    clsStudent obj=new clsStudent();
    obj.Export(Temp);
    response.setContentType("application/csv");
    response.setHeader("Content-disposition:","attachment; filename="+Temp);
    
    java.io.FileInputStream fs=new FileInputStream(Temp);
    int i;
    while((i=fs.read())!= -1)
    {
        out.write(i);
    }
    fs.close();
//   // response.setCharacterEncoding("UTF-8");
    }
    else if(opr.equals("PDF"))
    {
              
    }
    else if(opr.equals("Search"))
    {
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

       response.sendRedirect("frmChangePassword.jsp");
    }
    }
    //response.sendRedirect("frmLogin.jsp");
   // }
  //      obj.csv=request.getParameter("F1");
    
   // Date obj1=new Date();
   //obj1.getDate();
  // int date=obj1.getDate()+obj1.getMonth();

      out.write("\n");
      out.write("\n");
      out.write("\n");
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
