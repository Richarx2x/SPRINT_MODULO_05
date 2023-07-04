package cl.grupo05.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.grupo05.model.connection.Conexion;
import cl.grupo05.model.dao.interfaces.IClteDAO;
import cl.grupo05.model.dto.ClteDTO;


public class ClteDAO implements IClteDAO{

	@Override
	public void create(ClteDTO c) {
		String sql = "insert into cliente (rut,apellido,correo,telefono,afp,direccion,comuna,usuario_id) "
				+ "values ('+" + c.getRut()+"','+" + c.getApellido()+"','+" + c.getCorreo()+"',"+ c.getTelefono()+"',"+ c.getAfp()+"',"
						+ ""+ c.getDireccion()+"',"+ c.getComuna()+"',"+ c.getId()+"')";
		try {
			
			java.sql.Connection connection = Conexion.getConexion();
			Statement stm = connection.createStatement();
			stm.execute(sql);
			stm.close();
	    
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
		
	

	@Override
	public List<ClteDTO> read() {
		List<ClteDTO> lista = new ArrayList<ClteDTO>();
		try {
			Connection connection = Conexion.getConexion();
			Statement statement = connection.createStatement();
			String sql ="select rut,apellido,correo,telefono,afp,direccion,comuna,usuario_id  from cliente";
		
			ResultSet result = statement.executeQuery(sql);
		
			while(result.next()) {
				ClteDTO c = new ClteDTO();
				
				c.setId(result.getInt("id"));
				c.setApellido(result.getString("apellido"));
				c.setCorreo(result.getString("correo"));
				c.setTelefono(result.getString("telefono"));
				c.setCorreo(result.getString("correo"));	
				c.setAfp(result.getString("afp"));
				c.setDireccion(result.getString("direcion"));
				c.setComuna(result.getString("comuna"));
				
				
				lista.add(c);
				
			}
	
		
		}catch (SQLException e) {
			e.printStackTrace();
		} 
				
		
		return lista;
	}

	@Override
	public ClteDTO read(int id) {
		ClteDTO clteDTO = null;
		
		try {
			Connection connection = Conexion.getConexion();
			Statement statement = connection.createStatement();
			String sql = "select id,run,nombre,apellido,correo,area,telefono,cargo from profesional where usuario_id = " + id;
			
			ResultSet rs =statement.executeQuery(sql);
			
			
			if(rs.next()) {
				clteDTO= new ClteDTO();
				clteDTO.setId(rs.getInt("id"));
				clteDTO.setApellido(rs.getString("apellido"));
				clteDTO.setCorreo(rs.getString("correo"));
				clteDTO.setTelefono(rs.getString("telefono"));
				clteDTO.setCorreo(rs.getString("correo"));	
				clteDTO.setAfp(rs.getString("afp"));
				clteDTO.setDireccion(rs.getString("direcion"));
				clteDTO.setComuna(rs.getString("comuna"));
				
			
			
			}	
	
			rs.close();
			statement.close();

		}catch (SQLException e) {
		   e.printStackTrace();	
		}
		
		
		
		
		
		return clteDTO;
	}

	@Override
	public void update(ClteDTO c) {
		String sql = "update cliente set id= '"+ c.getId()+ "',rut = '"+ c.getRut()+ "',apellido = '" + c.getApellido() + "',"
				+ "',correo = '" + c.getCorreo()+ "',telefono = '" + c.getTelefono()+ "',afp= '" + c.getAfp()+ "',"
				+ "',direccion = '" + c.getDireccion()+ "',comuna = '" + c.getComuna();
				
	try {
		Connection connection = Conexion.getConexion();
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
			Connection connection = Conexion.getConexion();
			Statement stt = connection.createStatement();
			stt.execute(sql);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}	

		
	}

		
}



