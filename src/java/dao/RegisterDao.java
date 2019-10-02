package dao;

import beans.Admin;
import beans.User;
import java.sql.PreparedStatement;

public class RegisterDao {
    PreparedStatement ps = null;
    public String resisterUser(User userObj)
    {    
        try{
            ps = DBConn.getConnection().
               prepareStatement("insert into users(name,email,username,password,country) "
                        +"values(?,?,?,?,?)");
            ps.setString(1, userObj.getName());
            ps.setString(2, userObj.getEmail());
            ps.setString(3, userObj.getUsername());
            ps.setString(4, userObj.getPassword());
            ps.setString(5, userObj.getCountry());
            
            if(ps.executeUpdate()!=0)
                return "Success";
        }
        catch(Exception e){
            return e.getMessage();
        }
        return "Oops...!!! Something went to wrong";
    }
    public String resisterAdmin(Admin adminObj)
    {
        try{
            ps = DBConn.getConnection().
               prepareStatement("insert into admins(name,email,username,password) "
                        +"values(?,?,?,?)");
            ps.setString(1, adminObj.getName());
            ps.setString(2, adminObj.getEmail());
            ps.setString(3, adminObj.getUsername());
            ps.setString(4, adminObj.getPassword());
            
            if(ps.executeUpdate()!=0)
                return "Success";
        }
        catch(Exception e){
            return e.getMessage();
        }
        return "Oops...!!! Something went to wrong";
    }
}