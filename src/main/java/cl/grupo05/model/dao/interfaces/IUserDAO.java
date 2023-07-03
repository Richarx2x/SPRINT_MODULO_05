package cl.grupo05.model.dao.interfaces;

import java.util.List;

import cl.grupo05.model.dto.UserDTO;

public interface IUserDAO {
  //CRUD DE USUARIO
	public boolean create(UserDTO c);
	public List<UserDTO> read();
	public  UserDTO read(int id);
	public boolean update(UserDTO c);
	public boolean delete(int id);

}
