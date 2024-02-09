package com.capgemini.main;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main_Class {  
//	here 'class' is a user defined datatype

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		Scanner input = new Scanner(System.in); //Standard input stream
		//Here the first Scanner is the Clas and the sec Scanner is a parameterised const, 
		//input tis an obj created, new allocates memory at run time
		
		do {
			Operation_Class object = new Operation_Class();
			System.out.println("Enter 1 for insert a record");
			System.out.println("Enter 2 for delete a record");
			System.out.println("Enter 3 for update a record");
			System.out.println("Enter 4 for display a record");
			System.out.println("Enter 5 for display all record");
			Scanner sc = new Scanner(System.in);
			
			int reply = input.nextInt();
			switch(reply) {
			case 1: 
				object.insert_record();
				break;
			case 2: 
				object.delete();
				break;
			case 3: 
				break;
			case 4: 
				break;
			case 5: 
				break;
			default: 
				System.out.println("Invalid Input!");
			}} while (true);
		}
	}


