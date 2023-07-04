package cl.grupo05.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.grupo05.model.connection.Connection;

import cl.grupo05.model.dto.ProfDTO;

public class ProfDAO implements IProfDAO{

	@Override
	public void create(ProfDTO p) {
		String sql = "insert into profesional (id,run,nombre,apellido,correo,telefono,cargo,usuario_id) "
				+ "values ('+" + p.getId()+"','+" + p.getRun()+"','+" + p.getNombre()+"',"+ p.getApellido()+"',"+ p.getCorreo()+"',"+ p.getTelefono()+"',"+ p.getCargo()+"')";
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
	public List<ProfDTO> read() {
		List<ProfDTO> lista = new ArrayList<ProfDTO>();
		try {
			java.sql.Connection connection = Connection.getConnection();
			Statement statement = connection.createStatement();
			String sql ="select id,run,nombre,apellido,correo,telefono,cargo,area from profesional";
		
			ResultSet result = statement.executeQuery(sql);
		
			while(result.next()) {
				ProfDTO p = new ProfDTO();
				
				p.setId(result.getInt("id"));
				p.setRun(result.getString("run"));
				p.setNombre(result.getString("nombre"));
				p.setApellido(result.getString("apellido"));
				p.setCorreo(result.getString("correo"));	
				p.setTelefono(result.getString("telefono"));
				p.setCargo(result.getString("cargo"));
			
				lista.add(p);
				
			}
	
		
		}catch (SQLException e) {
			e.printStackTrace();
		} 
		
		
		return lista;
		
	}

	@Override
	public ProfDTO read(int id) {
		ProfDTO profDTO = null;
		
		try {
			java.sql.Connection connection = Connection.getConnection();
			Statement statement = connection.createStatement();
			String sql = "select id,run,nombre,apellido,correo,area,telefono,cargo from profesional where usuario_id = " + id;
			
			ResultSet rs =statement.executeQuery(sql);
			
			
			if(rs.next()) {
				profDTO = new ProfDTO();
				profDTO.setId(rs.getInt("id"));
				profDTO.setRun(rs.getString("run"));;
				profDTO.setNombre(rs.getString("nombre"));
				profDTO.setApellido(rs.getString("apellido"));
				profDTO.setCorreo(rs.getString("correo"));
				profDTO.setTelefono(rs.getString("telefon"));
				profDTO.setCargo(rs.getString("cargo"));
			
			
			
			}	
	
			rs.close();
			statement.close();

		}catch (SQLException e) {
		   e.printStackTrace();	
		}
		return profDTO;
	}

	@Override
	public void update(ProfDTO p) {
		String sql = "update profesional set id= '"+ p.getId()+ "',run = '"+ p.getRun()+ "',nombre = '" + p.getNombre() + "',"
				+ "',apellido = '" + p.getApellido()+ "',correo = '" + p.getCorreo()+ "',telefono= '" + p.getTelefono()+ "',"
				+ "',cargo = '" + p.getCargo();
				
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
		String sql = "delete from profesional where id =" + id;
		try {
			java.sql.Connection connection = Connection.getConnection();
			Statement stt = connection.createStatement();
			stt.execute(sql);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}	

		
	}


}
