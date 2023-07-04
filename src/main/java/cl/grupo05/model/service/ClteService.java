package cl.grupo05.model.service;

import java.util.List;

import cl.grupo05.model.dao.ClteDAO;

import cl.grupo05.model.dto.ClteDTO;

public class ClteService {

	private ClteDAO clteDAO = new ClteDAO();
	
	public void create(ClteDTO c) {
		clteDAO.create(c);
	}
	public List<ClteDTO>findAll() {
		return clteDAO.read();
	
	}
	
	public ClteDTO findOne(int id) {
		return clteDAO.read(id);
		
	}

	public void update(ClteDTO c) {
		clteDAO.update(c);
	}
	public void delete(int id) {
		clteDAO.delete(id);
	}

}
