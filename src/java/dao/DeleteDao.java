package dao;

import beans.Software;
import beans.User;
import java.sql.PreparedStatement;

public class DeleteDao {
    public String deleteUser(User userObj){
        try{
            PreparedStatement ps = DBConn.getConnection().
                prepareStatement("delete from users where id=?");
            ps.setString(1, userObj.getName());
            
            if(ps.executeUpdate()!=0)
                return "Deleted";
        }
        catch(Exception e){
            return e.getMessage();
        }
        return null;
    }
    public String deleteSoftware(Software softObj){
        try{
            PreparedStatement ps = DBConn.getConnection().
                prepareStatement("delete from softwares where id=?");
            ps.setString(1, softObj.getName());
            
            if(ps.executeUpdate()!=0)
                return "Deleted";
        }
        catch(Exception e){
            return e.getMessage();
        }
        return null;
    }
}
