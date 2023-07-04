package cl.grupo05.model.service;

import java.util.List;

import cl.grupo05.model.dao.CapacitacionDAO;
import cl.grupo05.model.dto.CapacitacionDTO;

public class CapacitacionService {

	private CapacitacionDAO capacitacionDAO = new CapacitacionDAO();
	
	public void create(CapacitacionDTO t) {
		capacitacionDAO.create(t);
	}
	
	public List<CapacitacionDTO> findAll(){
		return capacitacionDAO.read();
		
	}
	public CapacitacionDTO findOne(int id) {
		return capacitacionDAO.read(id);
		
	}
	public void update(CapacitacionDTO t) {
		capacitacionDAO.update(t);
	}
	public void delete(int id) {
		capacitacionDAO.delete(id);
	}


}
