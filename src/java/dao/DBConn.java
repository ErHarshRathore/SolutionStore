package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
    static Connection con = null;
    public static final String url="jdbc:mysql://localhost:3306/sol_store";
    
    public static Connection getConnection() throws ClassNotFoundException,SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url,"root","root");
        return con;
    }
}
