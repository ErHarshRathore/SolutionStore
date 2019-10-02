package dao;

import beans.User;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class UpdateDao {
    public String updateUser(User user,String oldp)
    {
        PreparedStatement ps=null;
        
        try{
            ps = DBConn.getConnection().
                    prepareStatement("update users set "+
                        "email=?,username=?,password=?,country=? where id=?");
            
            ResultSet rs = null;
            ShowDao sd = new ShowDao();
            rs = sd.showUsers(user.getName());
            
            if(rs.next())
            {
                if(rs.getString("password").equals(oldp))
                {
                    ps.setString(1,user.getEmail());
                    ps.setString(2,user.getUsername());
                    ps.setString(3,user.getPassword());
                    ps.setString(4,user.getCountry());
                    ps.setString(5,user.getName());
                    
                    if(ps.executeUpdate()!=0)
                        return "Updated";
                }
                else
                    return "Wrong Password";
            }
            
        }
        catch(Exception e)
        {
            return e.getMessage();
        }
        return null;
    }
}
