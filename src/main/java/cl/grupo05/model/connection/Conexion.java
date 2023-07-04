package cl.grupo05.model.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {
	private static Connection connection = null;
	private Conexion() {
		try {
			// Coexion a BD msql
			Class.forName("com.mysql.cj.jdbc.Driver");// para MySQL
			// url de la base de datos: jdbc:mysql://<host_base_de_datos>:<port>/<nombre_base_de_datos>
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/prevencion", "ricardo", "afrgt234hy7&r534$$s32368857fd");	
			
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}	
	}
	
	public static Connection getConexion() {
		if (connection == null) {
			new Conexion();
		}	
		return connection;
	}

}
