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
public class clsChangePassword 
{
        public String UserName="";     
        public String CurrentPassword="";
        public String NewPassword="";
        
    public void ChangePassword(String UserName,String CurrentPassword,String NewPassword) throws ClassNotFoundException, SQLException
    {
    DBCnn obj=new DBCnn();
    Connection cnn=obj.ConnectMySql();
    PreparedStatement psmt = cnn.prepareStatement("call sp_ChangePassword(?,?,?)");
    psmt.setString(1,UserName);
    psmt.setString(2,CurrentPassword);
    psmt.setString(3,NewPassword);
    psmt.executeUpdate();
    }
}
