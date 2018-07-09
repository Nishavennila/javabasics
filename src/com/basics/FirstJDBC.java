package com.personal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class FirstJDBC {
	
		
		public FirstJDBC(){
		}
		
			public void select() {
			Connection connection=null;
			Statement statement=null;
			ResultSet resultSet=null;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");//load the driver for mysql into JVM
			    connection = DriverManager //jdbc:dbproductname://ipaddress:port/dbname
						.getConnection("jdbc:mysql://localhost:3306/nisha","root","");
				System.out.println(connection);
				statement=connection.createStatement();
				String sql="select * from Student";
				resultSet=statement.executeQuery(sql);
				System.out.println(statement);
				System.out.println(resultSet);
				while(resultSet.next()) {
					System.out.println(resultSet.getString("empid")+" ");
					System.out.println(resultSet.getString("name")+" ");
					System.out.println(resultSet.getString(3)+" ");
					System.out.println(resultSet.getString("salary")+"\n");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally{
				try {
				if(resultSet != null) 
					resultSet.close();
					if(statement != null)
						resultSet.close();
					if(connection != null)
						resultSet.close();
				}  
				catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			}
		public void update() {
			Connection connection =null;
			Statement statement=null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/nisha","root","");
				System.out.println(connection);
				statement=connection.createStatement();
				String sql="update Student set name=shankar where empid=1"; 
				int ret=statement.executeUpdate(sql);
				System.out.println(ret);
			}
			
		 catch (Exception e) {
			e.printStackTrace();
		}finally {
		      try {
			        if(statement != null)
			          statement.close();
			        if(connection != null)
			          connection.close();
			      } catch (Exception e2) {
			        e2.printStackTrace();
			      }
			    }
} 
		public void delete() {
			Connection connection =null;
			Statement statement=null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/nisha","root","");
				System.out.println(connection);
				statement=connection.createStatement();
				String sql="delete from Student  where empid=1"; 
				int ret=statement.executeUpdate(sql);
				System.out.println(ret);
			}
			
		 catch (Exception e) {
			e.printStackTrace();
		}finally {
		      try {
			        if(statement != null)
			          statement.close();
			        if(connection != null)
			          connection.close();
			      } catch (Exception e2) {
			        e2.printStackTrace();
			      }
			    }
} 
		public static void main(String[] args) {
			FirstJDBC first = new FirstJDBC();
		}

	}


