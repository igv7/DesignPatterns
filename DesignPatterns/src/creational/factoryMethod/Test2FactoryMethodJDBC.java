package creational.factoryMethod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test2FactoryMethodJDBC {

	private final static String DRIVER_NAME = "com.mysql.jdbc.Driver";
	private final static String DB_NAME = "moshedb";
	private final static String USER_NAME = "root";
	private final static String PASSWORD = "1234";
	
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		Statement statement = null;
		
		try
		{
			Class.forName(DRIVER_NAME);
			connection = DriverManager.getConnection(DB_NAME, USER_NAME, PASSWORD);
		}
		catch(Exception e)
		{ 
			System.err.println("can't connect to " + DB_NAME + " because " + e);
			connection = DriverManager.getConnection(DB_NAME + ";create=true");
		}
		statement=connection.createStatement();
		statement.execute("Select * from Moshe table");
	}
	
}
