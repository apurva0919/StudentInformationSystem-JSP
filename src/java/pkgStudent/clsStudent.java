/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgStudent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 *
 * @author VAIBHAV
 */
public class clsStudent 
{
    public String EnrollmentNo="";
        public String Name="";
    public String MobileNo="";

    public String ID="Delete from discount;";
    public String Temp="";
    public String ExportPath="";
    public String Query="";
    public String ExportQuery="";
    
    public void Upload() throws SQLException           
    {
    Query="LOAD DATA INFILE '"+Temp+"' INTO TABLE student_info FIELDS TERMINATED BY ',' ENCLOSED BY '\"' LINES TERMINATED BY'\n' IGNORE 1 LINES (Enrollment_No,Student_Name,Father_Name,Permanent_Address,Email,Mobile_No,Photograph,Description)";
    DBCnn obj=new DBCnn();
    Connection cnn=obj.ConnectMySql();
    PreparedStatement psmt=cnn.prepareStatement(Query);
  //  psmt.setString(1,csv);
    psmt.executeUpdate();
    }
    
    public ResultSet select () throws ClassNotFoundException, SQLException
    {
    DBCnn obj=new DBCnn();
    Connection cnn=obj.ConnectMySql();
    PreparedStatement psmt = cnn.prepareStatement("select * from student_info;");
    ResultSet rs=psmt.executeQuery();
    return rs;
    }
    
    public void Export(String abc) throws SQLException          
    {
    ExportQuery="SELECT * INTO OUTFILE '"+abc+"'FIELDS TERMINATED BY ','FROM student_info;";
    DBCnn obj=new DBCnn();
    Connection cnn=obj.ConnectMySql();
    PreparedStatement psmt=cnn.prepareStatement(ExportQuery);
  //  psmt.setString(1,csv);
    psmt.executeQuery();
    
    }
    public ResultSet Search() throws ClassNotFoundException, SQLException
    {
    DBCnn obj=new DBCnn();
    Connection cnn=obj.ConnectMySql();
   
    String strQuery="select * from student_info ";
    String whereClause="";
    if(EnrollmentNo.trim().length()>0)
    {
        whereClause="Enrollment_No like '" + EnrollmentNo +"%'";
    }
    if(Name.trim().length()>0)
    {
        if(whereClause.trim().length()>0)
        {
            whereClause=whereClause+" and " ;
        }
        whereClause=whereClause+ " Student_Name like '" + Name +"%'";
    }
    if(MobileNo.trim().length()>0)
    {
        if(whereClause.trim().length()>0)
        {
            whereClause=whereClause+" and " ;
        }
        whereClause=whereClause+ " Mobile_No like '" + MobileNo +"%'";
    }
    if(whereClause.trim().length()>0)
        {
                strQuery=strQuery+ " where "+whereClause;

        }
    PreparedStatement psmt = cnn.prepareStatement(strQuery);
   // psmt.setString(1,First_Name);
    ResultSet rs=psmt.executeQuery();
    return rs;
    
    }
    
    
}

