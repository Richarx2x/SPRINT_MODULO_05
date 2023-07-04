package cl.grupo05.model.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.*;

import cl.grupo05.model.connection.Conexion;
import cl.grupo05.model.dao.interfaces.IUserDAO;
import cl.grupo05.model.dto.UserDTO;

public class UserDAO implements IUserDAO {

	public UserDTO login(String username,String password) {
		UserDTO us = null;
		try {
			Connection cnn = Conexion.getConexion();
			Statement stm = cnn.createStatement();
			String sql="select id,nombre,username, password from usuario where username="+username+" and password ="+password;
			
			ResultSet rs= stm.executeQuery(sql);
			while(rs.next()) {
				us= new UserDTO(rs.getInt("id"),
						rs.getString("nombre"),
						rs.getString("username"),
						rs.getString("password"));
				
			}
		}catch(SQLException e) {
				System.out.println("Error, no se encuentra usuario");
				e.printStackTrace();
			
			}
		return us;
		
		}
	
	@Override
	public void create(UserDTO us){
		String sql = "INSERT INTO user (id,nombre,username,password) values ('" + us.getId()+"','"+ us.getNombre()+"','"+ us.getUsername()+"','"+ us.getPassword()+"')";
		try {

			
			
			Connection cnn = Conexion.getConexion();
			Statement stm = cnn.createStatement();
			stm.execute(sql);
			stm.close();
		
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

		}

	@Override
	public List<UserDTO> read() {
		List<UserDTO> lista= new ArrayList<UserDTO>();
	
	
	
	try {
		Connection cnn = Conexion.getConexion();
		Statement stm = cnn.createStatement();
        String sql = "select id,nombre,username,password from usuario";
	
   
        
	 ResultSet result = stm.executeQuery(sql);			
	
	 while (result.next()){
		 UserDTO us = new UserDTO();
	 
		 us.setId(result.getInt("id"));
		 us.setNombre(result.getString("nombre"));
		 us.setUsername(result.getString("username"));
		 us.setPassword(result.getString("password"));
	
		 lista.add(us);
		
	}
	

	
	}catch(SQLException e) {
		e.printStackTrace();
	}

	
	return lista;
	}
	
	@Override
	public UserDTO read(int id) {
		UserDTO us= null;
		try {
			Connection cnn = Conexion.getConexion();
			Statement stm = cnn.createStatement();
			
			String sql="select id,nombre,username, password from usuario where id="+id;
			ResultSet rs= stm.executeQuery(sql);
			while(rs.next()) {
				us=new UserDTO(
						rs.getInt("id"),
						rs.getString("nombre"),
						rs.getString("username"),
						rs.getString("password")
						);
			}
		}catch(SQLException e){
			System.out.println("Error en método que busca a usuario por id");
			e.printStackTrace();
			
		}
		return us;
	}

	@Override
	public void update(UserDTO u) {
		String sql = "update usurrio set id= '" + u.getId() + "', nombre = '" + u.getNombre()+ "',username  = '" + u.getUsername() + "',password = '" + u.getPassword();

	try {
		Connection cnn = Conexion.getConexion();
		Statement stm = cnn.createStatement();
	
		System.out.println(sql);
		stm.execute(sql);
		
	
	
	} catch (SQLException e) {
		e.printStackTrace();
	}

		
	}

	@Override
	public void delete(int id) {
		String sql = "delete from usuario where id =" + id;
		try {
			Connection cnn = Conexion.getConexion();
			Statement stm = cnn.createStatement();
			stm.execute(sql);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}	


	}


	

}
