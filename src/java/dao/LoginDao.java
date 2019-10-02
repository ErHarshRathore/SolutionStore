package dao;

import beans.User;
import beans.Admin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
    public String loginUser(User userObj)
    {
        String mail = userObj.getEmail();
        String user = userObj.getUsername();
        String pass = userObj.getPassword();
        
        PreparedStatement ps = null;
        ResultSet rs=null;
        
        try{
            ps = DBConn.getConnection().
               prepareStatement("select name from users where (email=? or username=?) and password=?");
            ps.setString(1, mail);
            ps.setString(2, user);
            ps.setString(3, pass);
            rs=ps.executeQuery();
            
            if(rs.next())
                return rs.getString("name");
        }
        catch(Exception e){
            return e.getMessage();
        }
        return "Invalid Username or Password! Retry" ;
    }
    public String loginAdmin(Admin userObj)
    {
        String mail = userObj.getEmail();
        String user = userObj.getUsername();
        String pass = userObj.getPassword();
        
        PreparedStatement ps = null;
        ResultSet rs=null;
        
        try{
            ps = DBConn.getConnection().
               prepareStatement("select name from admins where (email=? or username=?) and password=?");
            ps.setString(1, mail);
            ps.setString(2, mail);
            ps.setString(3, pass);
            rs=ps.executeQuery();
            
            if(rs.next())
                return rs.getString("name");
        }
        catch(Exception e){
            return e.getMessage();
        }
        return "Invalid Username or Password!" ;
    }
}
