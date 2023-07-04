package cl.grupo05.model.service;

import java.util.List;

import cl.grupo05.model.dao.AdminDAO;
import cl.grupo05.model.dto.AdminDTO;


public class AdminService {
	private AdminDAO adminDAO = new AdminDAO();
	
	public void create(AdminDTO a){
		adminDAO.create(a);
	}
	
	public List<AdminDTO> findAll(){
		return adminDAO.read();
		
	}

	public AdminDTO findOne(int id){
		return adminDAO.read(id);	
	}
	
	public void update(AdminDTO u){
		adminDAO.update(u);
	}
	public void delete(int id){
		adminDAO.delete(id);
	}
}
