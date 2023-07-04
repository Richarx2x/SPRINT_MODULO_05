package cl.grupo05.model.service;

import java.util.List;

import cl.grupo05.model.dao.ProfDAO;
import cl.grupo05.model.dto.ProfDTO;

public class ProfService {

	private ProfDAO profDAO = new ProfDAO();
	
	public void create(ProfDTO p) {
		profDAO.create(p);
	}

	public List<ProfDTO> findAll(){
		return profDAO.read();
		
	}

	public ProfDTO findOne(int id) {
		return profDAO.read(id);
		
	}
	public void update(ProfDTO p) {
		profDAO.update(p);
	}
	
	public void delete(int id) {
		profDAO.delete(id);
	}
	

}
