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
	
	public void create(User user){
		if (dbConnection != null) {
	          try {
	        	  PreparedStatement prepStatement = dbConnection.prepareStatement("insert into [user](id) values (?)");
	              prepStatement.setString(1, user.getId());
	              prepStatement.executeUpdate();
	          } catch (SQLException e) {
	              e.printStackTrace();
	          } 
	      }
		
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
