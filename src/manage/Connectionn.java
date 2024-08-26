package manage;

import java.sql.*;
import java.util.Scanner;

public class Connectionn {
    // Establish a connection to a database
	static Connection con;
    public static Connection connector(){
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    	  	  String url ="jdbc:mysql://localhost:3306/student";
    	  	  String userName=("root");
    	  	  String password=("Ngyawali1!");
    	  	  con = DriverManager.getConnection(url,userName,password);
    	}catch(Exception e) {
    		e.getMessage();
    	}
    	System.out.println("Connection Established!!");
    	return con;
    	}
    
    }
	
    
    
           