package com.cogent.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Statement;
public class EmployeeQuery  {

	public static void main(String[] args) {		
		try {
			//forName is a method that is responsible to load the driver for us
			Class.forName("com.mysql.jdbc.Driver"); //load and register the driver (add external jdbc)
			
			String url="jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "password");
			PreparedStatement psmt;
			 //Modified the table added email
			//psmt = con.prepareStatement("alter table emptable add email int  after empLname");
			//psmt = con.prepareStatement(" alter table emptable drop colunm email");
			//creating a table
			//psmt = con.prepareStatement("create table emptable(empno int primary key, empFname varchar(20) not null,empLname varchar(20) not null, salary int) ");
 			
			int choice;
			
 			Scanner in = new Scanner(System.in);
 			do {
 				System.out.println("1. Insert Employee");
 	 			System.out.println("2. Update Employee");
 	 			System.out.println("3. Delete Employee");
 	 			System.out.println("4. FindEmployeeById");
 	 			System.out.println("5. Finde EmployeeByName");
 	 			System.out.println("6. Find employeeByEmail");
 	 			System.out.println("7. Quit");
 	 			System.out.println("*********************************");
 			System.out.println("Enter your choice:");
 			choice = in.nextInt();
 			
 			
 			if(choice == 1) {
 				psmt = con.prepareStatement("insert into emptable values(?, ?, ?, ?, ?)");
 				System.out.println("Enter employee Number");
 	 			int empNum = in.nextInt();
 	 			in.nextLine();
 	 			System.out.println("Enter employee firstname");
 	 			String fname=in.nextLine();
 	 			System.out.println("Enter employee lastname");
 	 			String lname=in.nextLine();
 	 			System.out.println("Enter employee email");
 	 			int email=in.nextInt(); //sorry email is int by accident
 	 			System.out.println("Enter employee salary");
 	 			int salary=in.nextInt();
 	 			
 	 			psmt.setInt(1, empNum);
 	 			psmt.setString(2, fname );
 	 			psmt.setString(3, lname);
 	 			psmt.setInt(4, email);
 	 			psmt.setInt(5, salary);
 	 			
 				int i = psmt.executeUpdate();
 	 			System.out.println(i+ " record is Inserted!");
 	 			psmt.close();
 			}else if(choice ==2) {
 				psmt = con.prepareStatement("update emptable set empFname=? where empno=?");
 				System.out.println("Enter employee Number you would like to update fname for?");
 				int empNum = in.nextInt();
 	 			in.nextLine();
 	 			System.out.println("Enter Updated employee firstname");
 	 			String fname=in.nextLine();
 	 			
 	 			psmt.setString(1, fname);
 	 			psmt.setInt(2, empNum);
 	 			
 	 			System.out.println("Emptable is updated");
 	 			psmt.close();
 			}else if(choice ==3) {
 				psmt = con.prepareStatement("delete from emptable where empno=?");
 				System.out.println("Enter the employeeNum to be deleted");
 				int empNum = in.nextInt();
 				psmt.setInt(1, empNum);
 				System.out.println("Employee is deleted");
 				psmt.close();
 			}else if(choice ==4) {
 				System.out.println("Enter the employeeNum to be searched");
 				int empNum = in.nextInt();
 				psmt = con.prepareStatement("select * from emptable where empno=?");
 				psmt.setInt(1, empNum);
 				ResultSet rs = psmt.executeQuery();
 				while(rs.next()) {
 					System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" +rs.getString(3) + "\t" + rs.getString(4)
 					+"\t" + rs.getString(5) );
 				}
 				psmt.close();
 			}else if(choice ==5) {
 				in.nextLine();
 				System.out.println("Enter the employeeName to be searched");
 				String empName = in.nextLine();
 				psmt = con.prepareStatement("select * from emptable where empFname=?");
 				psmt.setString(1, empName);
 				ResultSet rs = psmt.executeQuery();
 				while(rs.next()) {
 					System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" +rs.getString(3) + "\t" + rs.getString(4)
 					+"\t" + rs.getString(5) );
 				}
 				
 				psmt.close();
 				
 			}else if(choice ==6) {
 				
 				System.out.println("Enter the employee email to be searched(did int by accident)");
 				int empEmail = in.nextInt();
 				psmt = con.prepareStatement("select * from emptable where email=?");
 				psmt.setInt(1, empEmail);
 				ResultSet rs = psmt.executeQuery();
 				while(rs.next()) {
 					System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" +rs.getString(3) + "\t" + rs.getString(4)
 					+"\t" + rs.getString(5) );
 				} 
 				
 			}else {
 				System.out.println("Invalid choice.");
 			}
 			}while(choice != 7);
 		/*
			int i = psmt.executeUpdate();
	 			System.out.println(i+ " table created!");
	 			psmt.close();
	 			*/
			System.out.println("Get Connected");
			  con.close();
			//st.close();
			System.out.println("Class is Available");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}




	