package com.kls.in.DAOImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.log4j.Logger;

import com.kls.in.DAOInterface.UserDAOInterface;
import com.kls.in.configuration.DataBaseProp;
import com.kls.in.model.UserDetails;

public class UserDAOImpl implements UserDAOInterface {

	private static Logger logger = Logger.getLogger(UserDAOImpl.class);
	public static Connection con;

	@Override
	public boolean insertUserDetails(UserDetails userDetails, boolean insertFlag) {
		logger.info("========== DAO Insertion Process ============");

		try {
			con = DataBaseProp.getConnection();
			String insertQuery = "Insert into userdetails (firstName,email,phone,gender,password,role) values('"
					+ userDetails.getFirstName() + "','" + userDetails.getEmail() + "','" + userDetails.getPhone()
					+ "','" + userDetails.getGender() + "','" + userDetails.getPassword() + "','admin')";

			Statement statement = con.createStatement();
			int insert = statement.executeUpdate(insertQuery);
			if (insert != 0) {
				insertFlag = true;
				logger.info("========== User Details Inserted Successfully ============");
			} else {
				insertFlag = false;
				logger.info("========== User Details Not Inserted Successfully ============");
			}
			con.close();

		} catch (Exception e) {
			System.out.println(e);
			logger.info("========== Exception Occured ============");
			insertFlag = false;
		}
		return insertFlag;

	}

	@Override
	public boolean gettUserDetails(UserDetails userDetails, boolean selectFlag) {
		try {
			con = DataBaseProp.getConnection();
			String selectQuery = "Select firstName from userdetails where email='" + userDetails.getEmail()
					+ "' and password='" + userDetails.getPassword() + "'";

			Statement statement = con.createStatement();
			ResultSet result = statement.executeQuery(selectQuery);
			if (result.next()) {
				selectFlag = true;
				logger.info("========== User Validaion Successfully ============");
			} else {
				selectFlag = false;
				logger.info("========== User Validaion Not Successfully ============");
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
			logger.info("========== Exception Occured ============");
			selectFlag = false;
		}
		return selectFlag;
	}

	@Override
	public boolean insertEmployeeDetails(UserDetails userDetails, boolean insertFlag) {
		logger.info("========== DAO Insertion Process ============");

		try {
			con = DataBaseProp.getConnection();
			String insertQuery = "Insert into userdetails (firstName,email,phone,gender,role) values('"
					+ userDetails.getFirstName() + "','" + userDetails.getEmail() + "','" + userDetails.getPhone()
					+ "','" + userDetails.getGender() + "','employee')";

			Statement statement = con.createStatement();
			int insert = statement.executeUpdate(insertQuery);
			if (insert != 0) {
				insertFlag = true;
				logger.info("========== Employee Details Inserted Successfully ============");
			} else {
				insertFlag = false;
				logger.info("========== Employee Details Not Inserted Successfully ============");
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
			logger.info("========== Exception Occured ============");
			insertFlag = false;
		}
		return insertFlag;

	}

	@Override
	public boolean updateEmployeeDetails(UserDetails userDetails, boolean insertFlag) {
		logger.info("========== DAO Insertion Process ============");

		try {
			con = DataBaseProp.getConnection();
			String insertQuery = "Update userdetails set firstName='" + userDetails.getFirstName() + "',phone='"
					+ userDetails.getPhone() + "',gender='" + userDetails.getGender()
					+ "',role='employee' where email='" + userDetails.getEmail() + "'";
			Statement statement = con.createStatement();
			int insert = statement.executeUpdate(insertQuery);
			if (insert != 0) {
				insertFlag = true;
				logger.info("========== Employee Details Update Successfully ============");
			} else {
				insertFlag = false;
				logger.info("========== Employee Details Not Update Successfully ============");
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
			logger.info("========== Exception Occured ============");
			insertFlag = false;
		}
		return insertFlag;
	}

}
