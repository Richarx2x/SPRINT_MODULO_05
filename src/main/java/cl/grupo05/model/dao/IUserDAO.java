package cl.grupo05.model.dao;

import java.util.List;

import cl.grupo05.model.dto.UserDTO;

public interface IUserDAO {
	
	/**
	 * se declara el CRUD
	 */

	
	public void create( UserDTO u);
	public List<UserDTO> read();
	public  UserDTO read (int id);
	public void update(UserDTO u);
	public void delete(int id);
	
}
