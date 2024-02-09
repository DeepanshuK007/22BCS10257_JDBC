package com.capgemini.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.util.Scanner;

public class Connection_Class {
	public Connection getConnection() throws ClassNotFoundException, SQLException { //getConnection is a user defined func
		Connection con = null; 
//		
	//Here Connection is an iterface and con is an obj but not of this 
//		interface as it doesnot have an obj thus it is an obj of the class which has this 'Connection' interface, as it has abstract methods in it
//		
		Class.forName("com.mysql.cj.jdbc.Driver");
//		// Here the Class is the interface
//		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cuims", "root", "Deepu#007");
//		System.out.println("Connection Established");
//		
		System.out.println(con.getClass().getName());
//		//Thus con is an object of jdbc class -> ConnectionImpl method's
		
		
		return con;
	}
}
