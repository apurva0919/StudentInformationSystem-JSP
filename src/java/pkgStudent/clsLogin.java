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
public class clsLogin {
     public String First_Name="";     
     public String Last_Name="";
        public String User_Name="";
        public String password="";
        public int User_Type_Id=0;
        
    public void CheckValidation() throws ClassNotFoundException, SQLException
    {
    DBCnn obj=new DBCnn();
    Connection cnn=obj.ConnectMySql();
    PreparedStatement psmt = cnn.prepareStatement("call sp_login(?,?)");
    psmt.setString(1,User_Name);
    psmt.setString(2,password);
    ResultSet rs =psmt.executeQuery();
    if(rs.next())
    {
    First_Name=rs.getString("First_Name");    
    Last_Name=rs.getString("Last_Name");
    User_Name=rs.getString("User_Name");
    User_Type_Id=1;
    }
    else 
    {
        First_Name="";  
        Last_Name="";
        User_Name="";

        
    }
    }
    
}
