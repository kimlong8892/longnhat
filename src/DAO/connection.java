/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class connection {
    
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=QLBH;integratedSecurity=true";
    private static final String Driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    Connection conn;
    
    public Connection connect() throws SQLException, ClassNotFoundException
    {
        Class.forName(Driver);
        Connection conn =DriverManager.getConnection(URL);
        return conn;
    }
    
    public void Disconnect() throws SQLException{
        if(conn != null || !conn.isClosed())
            conn.close();
    }
}
