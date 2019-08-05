<%-- 
    Document   : bllSyllabus
    Created on : Oct 26, 2015, 1:24:36 PM
    Author     : VAIBHAV
--%>

<%@page import="pkgStudent.clsCalender"%>
<%@page import="pkgStudent.clsSyllabus"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="pkgStudent.clsFile"%>
<%@page import="pkgStudent.clsStudent"%>
<%@page import="org.apache.commons.fileupload.*,java.util.*,java.io.*"%>

<%  
    clsCalender objSyllabus=new clsCalender();
    
    
    Date obj1=new Date();
    String Hrs=Integer.toString(obj1.getHours());
    String Min=Integer.toString(obj1.getMinutes());
    String sec=Integer.toString(obj1.getSeconds());
    String FileName=""+Hrs+"-"+Min+"-"+sec+".pdf";
    String PathName="F:/vaibhav/Student Information System/web/DATA/";
    
    String contentType = request.getContentType();
    if ((contentType != null) && (contentType.indexOf("multipart/form-data") >= 0)) 
    {
      
      DiskFileUpload upload = new DiskFileUpload();
      List <FileItem> items = upload.parseRequest(request);
      //FileItem  file = (FileItem) items.get(0); 
      FileItem  file1 = (FileItem) items.get(0);
      FileItem  file2 = (FileItem) items.get(1);
      FileItem  file3 = (FileItem) items.get(2) ;
      //String source = file.getString();
      String source1 = file1.getString();
      String source2 = file2.getString();
      String source3 = file3.getName();
    
      //String Path=PathName+"Upload"+FileName;
    String Path=PathName+source3;
     // obj.Temp=Path;
      File outfile = new File(Path);
      file3.write(outfile);
     
     
    objSyllabus.Session=source1;
    objSyllabus.Semester=source2;
    objSyllabus.File_Name=source3;
    objSyllabus.Path_Name=Path;
    objSyllabus.Insert();
      

    clsFile objFile=new clsFile();
    objFile.File_Name=source3;
    objFile.path=Path;
    objFile.Insert();
   out.println("File Uploaded  Successfully !");
   response.sendRedirect("frmCalender.jsp");

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
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
