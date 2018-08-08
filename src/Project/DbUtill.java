 package Project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.sql.*; 

public class DbUtill {
    
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String CONN_STRING =
		"jdbc:mysql://localhost/icums?autoReconnect=true&useSSL=false"; 
    public static Connection getConnection() throws SQLException {
        
       return DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD); 
    }
}
