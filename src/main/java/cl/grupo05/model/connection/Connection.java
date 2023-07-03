package cl.grupo05.model.connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {

	private static java.sql.Connection connection = null;
	
	private Connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sakila", "root", "kupita");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static java.sql.Connection getConnection(){
		if (connection == null) {
			new Connection();
		}
		
		return connection;
	}
	
}
