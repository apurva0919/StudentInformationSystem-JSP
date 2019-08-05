<%-- 
    Document   : bllStudent
    Created on : Oct 4, 2015, 10:57:59 AM
    Author     : VAIBHAV
--%>


<%@page import="java.sql.ResultSet"%>
<%@page import="pkgStudent.clsFile"%>
<%@page import="pkgStudent.clsStudent"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="org.apache.commons.fileupload.*,java.util.*,java.io.*"%>

<%  
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
   response.sendRedirect("frmStudent.jsp");

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
%>


