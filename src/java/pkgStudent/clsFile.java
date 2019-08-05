/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgStudent;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;

/**
 *
 * @author VAIBHAV
 */
public class clsFile {
     
    public String File_Code="";
    public String File_Name="";
    public String path="";
    public String Description="";
    
    public void Insert() throws SQLException
            
    {
    DBCnn obj=new DBCnn();
    Connection cnn=obj.ConnectMySql();
    PreparedStatement psmt=cnn.prepareStatement("{call sp_File_Insert(?,?,?,?)}");
    psmt.setString(1,File_Code);
    psmt.setString(2,File_Name);
    psmt.setString(3,path);
    psmt.setString(4,Description);
    psmt.executeUpdate();
    }
    
}
