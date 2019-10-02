package dao;

import beans.Software;
import java.sql.PreparedStatement;

public class SoftwareDao {
    PreparedStatement ps = null;
    public String addSoftware(Software softObj){    
        try{
            ps = DBConn.getConnection().
               prepareStatement("insert into softwares(name,version,tag,link,descript,last_update,logo) "
                        +"values(?,?,?,?,?,?,?)");
            ps.setString(1, softObj.getName());
            ps.setString(2, softObj.getVersion());
            ps.setString(3, softObj.getTag());
            ps.setString(4, softObj.getLink());
            ps.setString(5, softObj.getDescription());
            ps.setString(6, softObj.getLastUpdate());
            ps.setString(7, softObj.getPath());
            
            if(ps.executeUpdate()!=0)
                return "Success";
        }
        catch(Exception e){
            return e.getMessage();
        }
        return null;
    }
}
