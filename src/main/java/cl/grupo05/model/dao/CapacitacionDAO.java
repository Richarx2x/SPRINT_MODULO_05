package cl.grupo05.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.grupo05.model.connection.Connection;

import cl.grupo05.model.dto.CapacitacionDTO;



public class CapacitacionDAO implements ICapacitacionDAO{

	@Override
	public void create(CapacitacionDTO t) {
		String sql = "insert into capacitacion (cliente_id,nombre,detalle,fecha,hora,lugar,duracion,cantidad,) "
				+ "values ('+" + t.getNombre()+"','+" + t.getDetalle()+"','+" + t.getFecha()+"','+" + t.getHora()+"',,'+" + t.getLugar()+"'"+ t.getDuracion()+"',"+ t.getCantidad()+"')";
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
	public List<CapacitacionDTO> read() {
		List<CapacitacionDTO> lista = new ArrayList<CapacitacionDTO>();
		try {
			java.sql.Connection connection = Connection.getConnection();
			Statement statement = connection.createStatement();
			String sql ="select nombre,detalle,fecha,hora,lugar,duracion,cantidad from profesional";
		
			ResultSet result = statement.executeQuery(sql);
		
			while(result.next()) {
				CapacitacionDTO t = new CapacitacionDTO();
				
				
				t.setNombre(result.getString("nombre"));
				t.setDetalle(result.getString("detalle"));;
				t.setFecha(result.getString("fecha"));;
				t.setHora(result.getString("hora"));;
				t.setLugar(result.getString("lugar"));	
				t.setDuracion(result.getInt("duracion"));
				t.setCantidad(result.getInt("cantidad"));;
			
				lista.add(t);
				
			}
	
		
		}catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return lista;
	}

	@Override
	public CapacitacionDTO read(int id) {
		CapacitacionDTO capacitacionDTO = null;
		
		try {
			java.sql.Connection connection = Connection.getConnection();
			Statement statement = connection.createStatement();
			String sql = "select nombre,detalle,fecha,hora,lugar,duracion,cantidad from capacitacion where usuario_id = " + id;
			
			ResultSet rs =statement.executeQuery(sql);
			
			
			if(rs.next()) {
				capacitacionDTO = new CapacitacionDTO();
				capacitacionDTO.setNombre(rs.getString("nombre"));
				capacitacionDTO.setDetalle(rs.getString("detalle"));
				capacitacionDTO.setFecha(rs.getString("fecha"));
				capacitacionDTO.setHora(rs.getString("hora"));
				capacitacionDTO.setLugar(rs.getString("lugar"));
				capacitacionDTO.setDuracion(rs.getInt("duracion"));
				capacitacionDTO.setCantidad(rs.getInt("cantidad"));
			}	
	
			rs.close();
			statement.close();

		}catch (SQLException e) {
		   e.printStackTrace();	
		}
		
		
		
		
		return capacitacionDTO;
	}

	@Override
	public void update(CapacitacionDTO t) {
		String sql = "update capacitacion set nombre= '" + t.getNombre() + "',detalle= '"+ t.getDetalle() + "' fecha= '" + t.getFecha()+ "',hora = '" + t.getHora() 
		+ "',lugar = '" +t.getLugar() + "' duracion = '" + t.getDuracion()+"'cantidad = '" + t.getCantidad();

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
		String sql = "delete from capacitacion where cliente_id =" + id;
		try {
			java.sql.Connection connection = Connection.getConnection();
			Statement stt = connection.createStatement();
			stt.execute(sql);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}	


	}




}

	

	


