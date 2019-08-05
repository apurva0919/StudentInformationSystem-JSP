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
public class clsCalender
{
   public String Session="", Semester="",File_Name="",Path_Name="",Description="";
    public ResultSet select () throws ClassNotFoundException, SQLException
    {
    DBCnn obj=new DBCnn();
    Connection cnn=obj.ConnectMySql();
    PreparedStatement psmt = cnn.prepareStatement("SELECT * FROM calender ;");
    ResultSet rs=psmt.executeQuery();
    return rs;
    }
    public void Insert() throws SQLException
            
    {
    DBCnn obj=new DBCnn();
    Connection cnn=obj.ConnectMySql();
    PreparedStatement psmt=cnn.prepareStatement("{call sp_Calender_Insert(?,?,?,?,?)}");
    psmt.setString(1,Session);
    psmt.setString(2,Semester);
    psmt.setString(3,File_Name);
    psmt.setString(4,Path_Name);
    psmt.setString(5,Description);

    psmt.executeUpdate();
    }
    
    public ResultSet Search() throws ClassNotFoundException, SQLException
    {
    DBCnn obj=new DBCnn();
    Connection cnn=obj.ConnectMySql();
   
    String strQuery="select * from calender ";
    String whereClause="";
    if(Session.trim().length()>0)
    {
        whereClause=" File_Type like '" + Session +"%'";
    }
    if(Semester.trim().length()>0)
    {
        if(whereClause.trim().length()>0)
        {
            whereClause=whereClause+" and " ;
        }
        whereClause=whereClause+ " Session like '" + Semester +"%'";
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
