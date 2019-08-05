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

/**
 *
 * @author VAIBHAV
 */
public class clsSyllabus 
{
   public String File_Type="", Session="", Semester="",File_Name="",Path_Name="",Description="";
    public ResultSet select () throws ClassNotFoundException, SQLException
    {
    DBCnn obj=new DBCnn();
    Connection cnn=obj.ConnectMySql();
    PreparedStatement psmt = cnn.prepareStatement("SELECT * FROM Syllabus_Scheme;");
    ResultSet rs=psmt.executeQuery();
    return rs;
    }
    public void Insert() throws SQLException
            
    {
    DBCnn obj=new DBCnn();
    Connection cnn=obj.ConnectMySql();
    PreparedStatement psmt=cnn.prepareStatement("{call sp_Syllabus_Scheme_Insert(?,?,?,?,?,?)}");
    psmt.setString(1,File_Type);
    psmt.setString(2,Session);
    psmt.setString(3,Semester);
    psmt.setString(4,File_Name);
    psmt.setString(5,Path_Name);
    psmt.setString(6,Description);

    psmt.executeUpdate();
    }
    
    public ResultSet Search() throws ClassNotFoundException, SQLException
    {
    DBCnn obj=new DBCnn();
    Connection cnn=obj.ConnectMySql();
   
    String strQuery="select * from syllabus_scheme ";
    String whereClause="";
    if(File_Type.trim().length()>0)
    {
        whereClause=" File_Type like '" + File_Type +"%'";
    }
    if(Session.trim().length()>0)
    {
        if(whereClause.trim().length()>0)
        {
            whereClause=whereClause+" and " ;
        }
        whereClause=whereClause+ " Session like '" + Session +"%'";
    }
    if(Semester.trim().length()>0)
    {
        if(whereClause.trim().length()>0)
        {
            whereClause=whereClause+" and " ;
        }
        whereClause=whereClause+ " Semester like '" + Semester +"%'";
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
