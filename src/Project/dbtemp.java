/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class dbtemp {
    
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String CONN_STRING =
		"jdbc:mysql://localhost/temp?autoReconnect=true&useSSL=false"; 
    public static Connection getConnection() throws SQLException {
        
       return DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD); 
    }
}

