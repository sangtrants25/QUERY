package com.webapp.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.webapp.model.BaseModel;
import com.webapp.model.Customer;
import com.webapp.util.DbUtil;

public class CustomerRepository {
	private Connection dbConnection;

	public CustomerRepository() {
		dbConnection = DbUtil.getConnection();
	}

	public boolean create(Customer cus) {
		// setup for create new record
		cus.setCreatedDate(LocalDateTime.now().toString());
		cus.setModifiedDate(LocalDateTime.now().toString());
		cus.setCreatedUser("Admin Q");
		cus.setModifiedUser("Admin Q");
		cus.setStatus("1");
		int success = 0;
		if (dbConnection != null) {
			try {
				String sql = "INSERT INTO [dbo].[Customer]([ID],[Name],[CustomerNo],[DistrictID],[WardID],[ProvinceID],[Street],[AddressNo],[TaxNo],[CreatedUser],[CreatedDate],[ModifiedUser],[ModifiedDate],[Status])"
						+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement prepStatement = dbConnection.prepareStatement(sql);
				prepStatement.setString(1, cus.getID());
				prepStatement.setString(2, cus.getName());
				prepStatement.setString(3, cus.getCustomerNo());
				prepStatement.setString(4, cus.getDistrictID());
				prepStatement.setString(5, cus.getWardID());
				prepStatement.setString(6, cus.getProvinceID());
				prepStatement.setString(7, cus.getStreet());
				prepStatement.setString(8, cus.getAddressNo());
				prepStatement.setString(9, cus.getTaxNo());
				prepStatement.setString(10, cus.getCreatedUser());
				prepStatement.setString(11, cus.getCreatedDate());
				prepStatement.setString(12, cus.getModifiedUser());
				prepStatement.setString(13, cus.getModifiedDate());
				prepStatement.setString(14, cus.getStatus());

				success = prepStatement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (success == 1)
			return true;
		return false;
	}

	public void update(Customer user) {

	}

	public void deleteById(String id) {

	}

	public Customer getById(String id) {
		return null;
	}

	public List<Customer> listAll() {
		List<Customer> listCustomer = new ArrayList<Customer>();
		if (dbConnection != null) {
			try {
				String sql = "select * from [Customer]";
				Statement stmt = dbConnection.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				if (rs != null) {
					while (rs.next()) {
						Customer cus = new Customer();
						cus.setID(rs.getString("ID"));
						cus.setName(rs.getString("Name"));
						/*
						 * cus.setPassword(rs.getString("password"));
						 * cus.setEmail(rs.getString("email"));
						 */
						listCustomer.add(cus);
					}
				}
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return listCustomer;
	}

	public List<String> ListProvince() {
		List<String> listProvince = new ArrayList<String>();
		if (dbConnection != null) {
			try {
				String sql = "select * from [Province]";
				Statement stmt = dbConnection.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				if (rs != null) {
					while (rs.next()) {
						listProvince.add(rs.getString("ID"));
					}
				}
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return listProvince;
	}

	public List<BaseModel> ListDistricts(String provinceID) {
		List<BaseModel> listDistricts = new ArrayList<BaseModel>();
		if (dbConnection != null) {
			try {
				String sql = "select * from [District]";
				if (provinceID != "" && provinceID != null)
					sql += " where ProvinceID = '" + provinceID + "'";
				Statement stmt = dbConnection.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				if (rs != null) {
					while (rs.next()) {
						BaseModel district = new BaseModel();
						district.setID(rs.getString("ID"));
						district.setName(rs.getString("Name"));
						listDistricts.add(district);
					}
				}
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return listDistricts;
	}
	
	public List<BaseModel> ListProvinces(String stateID) {
		List<BaseModel> listProvinces = new ArrayList<BaseModel>();
		if (dbConnection != null) {
			try {
				String sql = "select * from [Province]";
				/*if (stateID != "" && stateID != null)
					sql += " where ProvinceID = '" + stateID + "'";*/
				Statement stmt = dbConnection.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				if (rs != null) {
					while (rs.next()) {
						BaseModel province = new BaseModel();
						province.setID(rs.getString("ID"));
						province.setName(rs.getString("Name"));
						listProvinces.add(province);
					}
				}
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return listProvinces;
	}
	
	public List<BaseModel> ListWard(String districtID) {
		List<BaseModel> listWard = new ArrayList<BaseModel>();
		if (dbConnection != null) {
			try {
				String sql = "select * from [Ward]";
				if (districtID != "" && districtID != null)
					sql += " where DistrictID = '" + districtID + "'";
				Statement stmt = dbConnection.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				if (rs != null) {
					while (rs.next()) {
						BaseModel ward = new BaseModel();
						ward.setID(rs.getString("ID"));
						ward.setName(rs.getString("Name"));
						listWard.add(ward);
					}
				}
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return listWard;
	}

	/*
	 * public static void main(String [] arg){ Connection conn =
	 * DbUtil.getConnection(); if (conn != null) {
	 * System.out.println("connect to db successful"); try { String sql =
	 * "select * from providerExpired"; Statement stmt = conn.createStatement();
	 * ResultSet rs = stmt.executeQuery(sql); if(rs!=null){ while(rs.next()){
	 * System.out.println(rs.getString("id")); } } stmt.close(); } catch
	 * (SQLException e) { e.printStackTrace(); } }
	 * 
	 * }
	 */
}
