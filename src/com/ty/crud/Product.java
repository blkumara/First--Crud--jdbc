package com.ty.crud;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;
	public class Product {


			public static void main(String[] args) {
				String url="jdbc:mysql://localhost:3306/javabatch";
				String userName="root";
				String password="root";
				
				String sql="insert into javabatch. product values(5,'car','poloGT','petrol',1000000.00)";
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					Connection con=DriverManager.getConnection(url,userName,password);
					
					Statement stm=con.createStatement();
					
					stm.execute(sql);
					
					con.close();
					
					System.out.println("Data Inserted");
					//System.out.println(con);
					
					//System.out.println("Driver Loaded");
				} 
				catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				
			}
	}



