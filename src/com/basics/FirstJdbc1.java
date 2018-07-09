package com.personal;


import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class  FirstJdbc1 {
	public FirstJdbc1() {
	}
	
		/*public void select(){
	        Connection connection = null;
	        Statement statement = null;
	        ResultSet resultSet = null;
	        try {
	          Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver for mysql into JVM
	          connection = DriverManager // jdbc:dbproductname://ipaddress:port/dbname
	              .getConnection("jdbc:mysql://localhost:3306/attendence","root","");
	          System.out.println(connection);
	          statement = connection.createStatement();
	          String sql = "select * from employee";
	          resultSet = statement.executeQuery(sql);
	          System.out.println(statement);
	          System.out.println(resultSet);
	          while(resultSet.next()){
	            System.out.print(resultSet.getString("empid")+" ");
	            System.out.print(resultSet.getString("name")+" ");
	            System.out.print(resultSet.getString(3)+" ");
	            System.out.print(resultSet.getString("salary")+"\n");
	          }
	       
	        } catch (Exception e) {
	          e.printStackTrace();
	        }finally {
	          try {
	            if(resultSet != null)
	              resultSet.close();
	            if(statement != null)
	              statement.close();
	            if(connection != null)
	              connection.close();
	          } catch (Exception e2) {
	            e2.printStackTrace();
	          }
	        }
	      }
	     
	      public void update(){
	        Connection connection = null;
	        Statement statement = null;
	        try {
	          Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver for mysql into JVM
	          connection = DriverManager // jdbc:dbproductname://ipaddress:port/dbname
	              .getConnection("jdbc:mysql://localhost:3306/attendence","root","");
	          System.out.println(connection);
	          statement = connection.createStatement();
	          String sql = "update employee set age=40 where empid = 1";
	          int ret = statement.executeUpdate(sql);
	          System.out.println(ret);
	        } catch (Exception e) {
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
	      public void delete(){
	        Connection connection = null;
	        Statement statement = null;
	        try {
	          Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver for mysql into JVM
	          connection = DriverManager // jdbc:dbproductname://ipaddress:port/dbname
	              .getConnection("jdbc:mysql://localhost:3306/attendence","root","");
	          System.out.println(connection);
	          statement = connection.createStatement();
	          String sql = "delete from employee where empid=1";
	          int ret = statement.executeUpdate(sql);
	          System.out.println(ret);
	        } catch (Exception e) {
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
	      public void dbMetadata(){
	        Connection connection = null;
	        try {
	          Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver for mysql into JVM
	          connection = DriverManager // jdbc:dbproductname://ipaddress:port/dbname
	              .getConnection("jdbc:mysql://localhost:3306/attendence","root","");
	          System.out.println(connection);
	          DatabaseMetaData  dbMetaData = connection.getMetaData();
	          System.out.println(dbMetaData.getDatabaseProductName());
	          System.out.println(dbMetaData.getDatabaseProductVersion());
	          System.out.println(dbMetaData.getDatabaseMajorVersion());
	          System.out.println(dbMetaData.getDatabaseMinorVersion());
	        } catch (Exception e) {
	          e.printStackTrace();
	        }finally {
	          try {
	            if(connection != null)
	              connection.close();
	          } catch (Exception e2) {
	            e2.printStackTrace();
	          }
	        }
	      }
	      public void resultsetMetaData(){
	        Connection connection = null;
	        Statement statement = null;
	        ResultSet resultSet = null;
	        try {
	          Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver for mysql into JVM
	          connection = DriverManager // jdbc:dbproductname://ipaddress:port/dbname
	              .getConnection("jdbc:mysql://localhost:3306/attendence","root","");
	          System.out.println(connection);
	          statement = connection.createStatement();
	          String sql = "select * from employee";
	          resultSet = statement.executeQuery(sql);
	          System.out.println(statement);
	          System.out.println(resultSet);
	          ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
	          System.out.println(resultSetMetaData.getColumnCount());
	          while(resultSet.next()){
	            System.out.print(resultSet.getString("empid")+resultSetMetaData.getColumnName(1)+resultSetMetaData.getColumnType(1)+"   ");
	            System.out.print(resultSet.getString("name")+resultSetMetaData.getColumnName(2)+resultSetMetaData.getColumnType(2)+"   ");
	            System.out.print(resultSet.getString(3)+resultSetMetaData.getColumnName(3)+resultSetMetaData.getColumnType(3)+"   ");
	            System.out.print(resultSet.getString("salary")+resultSetMetaData.getColumnName(4)+resultSetMetaData.getColumnType(4)+"\n");
	          }
	       
	        } catch (Exception e) {
	          e.printStackTrace();
	        }finally {
	          try {
	            if(resultSet != null)
	              resultSet.close();
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
	        //first.update();
	        //first.delete();
	        //first.dbMetadata();
	        first.resultsetMetaData();
	      }

	    }

	}


		

	}*/

	 public void AutoCommit() {
		Connection connection =null;
		PreparedStatement preparedStatementOne =null;
		PreparedStatement preparedStatementTwo=null;
		try {
			

		 Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver for mysql into JVM
	          connection = DriverManager // jdbc:dbproductname://ipaddress:port/dbname
              .getConnection("jdbc:mysql://localhost:3306/nisha","root","");
	          System.out.println(connection);
		 connection.setAutoCommit(false);
		String sql="update Student set salary= ? where empid = ? ";
		
	    preparedStatementOne=connection.prepareStatement(sql);
		preparedStatementOne.setDouble(1,23879);
		preparedStatementOne.setInt(2,2);
		int ret=preparedStatementOne.executeUpdate();
		System.out.println(ret);
		
	    preparedStatementTwo=connection.prepareStatement(sql);
		preparedStatementTwo.setDouble(1,1478);
		preparedStatementTwo.setString(2,"jf");
	    int ret1=preparedStatementTwo.executeUpdate();
		System.out.println(ret1);
		connection.commit();
	}
	catch(Exception e) {
		try {
			connection.rollback();
		}
		catch(Exception e1) {
			e1.printStackTrace();
		}
		e.printStackTrace();
	}finally {
			try {
				if(preparedStatementOne != null)
                  preparedStatementOne.close();
				if(preparedStatementTwo != null)
					preparedStatementTwo.close();
			
		}catch(Exception e2) {
			e2.printStackTrace();
		}
	}
	 }
	    public static void main(String[] args) {
			FirstJdbc1 first = new FirstJdbc1();
	    	first.AutoCommit() ;
		}
	  }

