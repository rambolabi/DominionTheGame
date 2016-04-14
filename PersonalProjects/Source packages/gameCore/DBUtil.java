package gameCore;
// This class stores all the utilities necessary to make a database connection.
// Be carefull editing values inhere, they might result in loss of connection. 
// I have documented as much as possible to make it understandable.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	// Required variables to setup a database connection (predefined).
	private static final String mySqlUser="root";
	private static final String mySqlPassword="devMachine1.";
	private static final String mySQLCS="jdbc:mysql://localhost:3306/dominiondb";
	
	// Method to set up a connection
	public static Connection getConnection(DBType dbType) throws SQLException{ 
		// Using switch so we can add other DBMS if client requires so. At this moment only MySql is necessary.
		switch (dbType){
		case MYSQLDB:
			return DriverManager.getConnection(mySQLCS, mySqlUser, mySqlPassword);
		default:
			return null;
		}
	}
	
	// Handling and formatting possible error messages 
	public static void showErrorMessage(SQLException e){
		System.err.println("Error: " + e.getMessage());
		System.err.println("Error code: " + e.getErrorCode());
	}
}

