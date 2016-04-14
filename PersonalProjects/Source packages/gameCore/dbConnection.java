package gameCore;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class dbConnection {

	// Setting up the connection. Catching and displaying errors/connections.
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// Establish connection
			conn = DBUtil.getConnection(DBType.MYSQLDB);
			// Create a statement
			stmt = conn.createStatement();
			// Perform a query search
			rs = stmt.executeQuery("SELECT * FROM Cards");
			// Formatting the output with a new line on the end
			String format = "%10s%10d%20s%n";
			// As long as there is a next row in the resultset; print following columns.
			while (rs.next()){
				System.out.format(format, rs.getString("cardName"), rs.getInt("cardCost"), rs.getString("cardType"));
			}
		} catch (SQLException ex){
			DBUtil.showErrorMessage(ex);
		} finally {
			// Closing all statements in reversed order as to their creation.
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
		
	}

}
