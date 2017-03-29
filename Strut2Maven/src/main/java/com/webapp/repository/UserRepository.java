package com.webapp.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.webapp.model.User;
import com.webapp.util.DbUtil;

public class UserRepository {
	private Connection dbConnection;

	public UserRepository() {
		dbConnection = DbUtil.getConnection();
	}
	
	public boolean create(User user){
		//setup for create new record
		user.setCreatedDate("2017-01-01");
		user.setModifiedDate("2017-01-01");
		user.setCreatedUser("1");
		user.setModifiedUser("1");
		user.setStatus("1");
		int success = 0;
		if (dbConnection != null) {
	          try {
	        	  String sql = "INSERT INTO [dbo].[User]([ID],[Name],[Password],[Email],[CreatedUser],[CreatedDate],[ModifiedUser],[ModifiedDate],[Status])"
	        			  + "VALUES(?,?,?,?,?,?,?,?,?)";
	        	  PreparedStatement prepStatement = dbConnection.prepareStatement(sql);
	              prepStatement.setString(1, user.getId());
	              prepStatement.setString(2, user.getName());
	              prepStatement.setString(3, user.getPassword());
	              prepStatement.setString(4, user.getEmail());
	              prepStatement.setString(5, user.getCreatedUser());
	              prepStatement.setString(6, user.getCreatedDate());
	              prepStatement.setString(7, user.getModifiedUser());
	              prepStatement.setString(8, user.getModifiedDate());
	              prepStatement.setString(9, user.getStatus());
	              
	              success = prepStatement.executeUpdate();
	          } catch (SQLException e) {
	              e.printStackTrace();
	          } 
	      }
		if(success == 1)
			return true;
		return false;
	}
	public void update(User user){

	}
	public void deleteById(String id){

	}
	public User getById(String id){
		return null;
	}
	public List<User> listAll(){
		List<User> listUser = new ArrayList<User>();
		if (dbConnection != null) {
			try {
				String sql = "select * from [user]";
				Statement stmt = dbConnection.createStatement();
			     ResultSet rs = stmt.executeQuery(sql);
			     if(rs!=null){
						while(rs.next()){
							User user = new User();
							user.setId(rs.getString("id"));
							user.setName(rs.getString("name"));
							user.setPassword(rs.getString("password"));
							user.setEmail(rs.getString("email"));
							user.setCreatedDate(rs.getString("createdDate"));
							user.setCreatedUser(rs.getString("createdUser"));
							user.setModifiedDate(rs.getString("modifiedDate"));
							user.setModifiedUser(rs.getString("modifiedUser"));
							user.setStatus(rs.getString("status"));
							listUser.add(user);
						}
					}
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}	
		return listUser;
	}
	
	public static void main(String [] arg){
		Connection conn = DbUtil.getConnection();
		if (conn != null) {
			System.out.println("connect to db successful");
			try {
				String sql = "select * from providerExpired";
				Statement stmt = conn.createStatement();
			     ResultSet rs = stmt.executeQuery(sql);
				if(rs!=null){
					while(rs.next()){
						System.out.println(rs.getString("id"));
					}
				}
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		
	}
}
