package cl.grupo05.model.service;
import java.util.List;

import cl.grupo05.model.dao.UserDAO;
import cl.grupo05.model.dto.UserDTO;


public class UserService {
	private UserDAO usDAO = new UserDAO();
	
	public List<UserDTO> findAll(){
		return usDAO.read();		
	}
	
	public UserDTO findOne(int id) {
		return usDAO.read(id);
	}
	
	public void update(UserDTO a) {
		usDAO.update(a);
	}
	
	public void create(UserDTO a) {
		usDAO.create(a);
	}
	
	public void delete(int id) {
		usDAO.delete(id);
	}
	public UserDTO login(String username,String password) {
		return usDAO.login(username, password);
	}
	
}
