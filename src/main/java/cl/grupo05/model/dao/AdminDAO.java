package cl.grupo05.model.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import cl.grupo05.model.connection.Connection;
import cl.grupo05.model.dao.interfaces.IAdminDAO;
import cl.grupo05.model.dto.AdminDTO;



public class AdminDAO implements IAdminDAO {

	@Override
	public void create(AdminDTO a) {
		String sql = "insert into admin (run,apellido,correo,area) values ('+" + a.getId()+"','+" + a.getRun()+"',"+ a.getApellido()+"',"+ a.getCorreo()+"',"+ a.getArea()+")";
		try {
			
			java.sql.Connection connection = Connection.getConnection();
			Statement stm = connection.createStatement();
			stm.execute(sql);
			stm.close();
	    
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public List<AdminDTO> read() {
		List<AdminDTO> lista = new ArrayList<AdminDTO>();
		
		try {
			java.sql.Connection connection = Connection.getConnection();
			Statement statement = connection.createStatement();
			String sql ="select id,nombre,username,password,apellido,correo,area from admin";
		
			ResultSet result = statement.executeQuery(sql);
		
			while(result.next()) {
				AdminDTO a = new AdminDTO();
				
				a.setId(result.getInt("id"));
				a.setNombre(result.getString("nombre"));
				a.setUsername(result.getString("username"));
				a.setPassword(result.getString("password"));
				a.setRut(result.getString("run"));	
				a.setApellido(result.getString("apellido"));
				a.setCorreo(result.getString("correo"));
				a.setArea(result.getString("area"));
				
				lista.add(a);
				
			}
	
		
		}catch (SQLException e) {
			e.printStackTrace();
		} 
		
		
		return lista;
	}

	@Override
	public AdminDTO read(int id) {
		AdminDTO adminDTO = null;
		
		try {
			java.sql.Connection connection = Connection.getConnection();
			Statement statement = connection.createStatement();
			String sql = "select id,run,nombre,apellido,correo,area,usuario_id from admin where usuario_id = " + id;
			
			ResultSet rs =statement.executeQuery(sql);
			
			
			if(rs.next()) {
				adminDTO = new AdminDTO();
				adminDTO.setId(rs.getInt("id"));
				adminDTO.setRut(rs.getString("run"));;
				adminDTO.setNombre(rs.getString("nombre"));
				adminDTO.setApellido(rs.getString("apellido"));
				adminDTO.setCorreo(rs.getString("correo"));
				adminDTO.setArea(rs.getString("area"));
				adminDTO.setRut(rs.getString("usuarioid"));
			
			
			}	
	
			rs.close();
			statement.close();

		}catch (SQLException e) {
		   e.printStackTrace();	
		}
		return adminDTO;
	}

	@Override
	public void update(AdminDTO a) {
		String sql = "update administrativo set id= '" + a.getId() + "',run= '"+ a.getRun() + "' nombre= '" + a.getNombre()+ "',apellido  = '" + a.getApellido() 
		+ "',correo = '" + a.getCorreo() + "' area = '" + a.getArea();

	try {
		java.sql.Connection connection = Connection.getConnection();
		Statement statement = connection.createStatement();
	
		System.out.println(sql);
		statement.execute(sql);
		statement.close();
		
	
	} catch (SQLException e) {
		e.printStackTrace();
	}

		
	}

	@Override
	public void delete(int id) {
		String sql = "delete from administrativo where id =" + id;
		try {
			java.sql.Connection connection = Connection.getConnection();
			Statement stt = connection.createStatement();
			stt.execute(sql);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}	


	}

		














}


		
	
	



	

