package cl.grupo05.model.dao;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cl.grupo05.model.connection.Conexion;
import cl.grupo05.model.dao.interfaces.IUserDAO;
import cl.grupo05.model.dto.UserDTO;

public class UserDAO implements IUserDAO {

	public UserDTO login(String username, String password) {
		UserDTO us = null;
		try {
			Connection cnn = Conexion.getConexion();
			Statement stm = cnn.createStatement();
			String sql="select id,nombre,username, password from usuario where username="+username+" and password ="+password;
			
			ResultSet rs= stm.executeQuery(sql);
			while(rs.next()) {
				us= new UserDTO(rs.getInt("id"),
						rs.getString("nombre"),
						rs.getString(username),
						rs.getString(password));
				
			}
		}catch(SQLException e) {
				System.out.println("Error, no se encuentra usuario");
				e.printStackTrace();
			
			}
		return us;
		
		}
	
	@Override
	public boolean create(UserDTO c) {
		
		return false;
	}

	@Override
	public List<UserDTO> read() {
		// TODO Auto-generated method stub
		return null;
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
	public boolean update(UserDTO c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}


	

}
