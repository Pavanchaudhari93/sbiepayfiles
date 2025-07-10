package CommonLibs.Implementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection extends getConfigProperty {
	private static Connection connection = null;
	private static Statement statement;
	private static ResultSet resultSet;

	public static void connection() throws ClassNotFoundException, SQLException {
		System.out.println("Connecting JDBC Connection...");
		
		Class.forName("oracle.jdbc.driver.OracleDriver");

		connection = DriverManager.getConnection(getProperty("jdbcuaturl"), getProperty("jdbcuser"),
				getProperty("jdbcpwd"));

		System.out.println("JDBC Connection created successfully to Oracle db");
	}

	public static ResultSet prepareStatement(String sqlQuery) throws SQLException {
		statement = connection.createStatement();
		
		resultSet = statement.executeQuery(sqlQuery);
		
		return resultSet;
	}

	public static void close() throws SQLException {
		connection.close();
		
		statement.close();
		
		resultSet.close();

		System.out.println("JDBC Connection closed successfully to Oracle db.");
	}

}
