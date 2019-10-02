package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ShowDao {
    PreparedStatement ps = null;
    ResultSet rs = null;
    public ResultSet showUsers(String id)
    {    
        try{
            if(id==null)
                ps = DBConn.getConnection().
                    prepareStatement("select * from users");
            else
            {
                ps = DBConn.getConnection().
                    prepareStatement("select * from users where id=?");
                ps.setString(1, id);
            }
            rs = ps.executeQuery();
            if(rs!=null)
                return rs;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    public ResultSet showSoftwares(String id)
    {
        try{
            if(id==null)
                ps = DBConn.getConnection().
                    prepareStatement("select * from softwares");
            else
            {
                ps = DBConn.getConnection().
                    prepareStatement("select * from softwares where id=?");
                ps.setString(1, id);
            }
            rs = ps.executeQuery();
            if(rs!=null)
                return rs;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
