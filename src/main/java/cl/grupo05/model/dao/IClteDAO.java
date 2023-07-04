package cl.grupo05.model.dao;

import java.util.List;

import cl.grupo05.model.dto.ClteDTO;

public interface IClteDAO {
	
	/**
	 * se declara el CRUD
	 */
	
	public void create(ClteDTO c);
	public List<ClteDTO> read();
	public ClteDTO read(int id);
	public void update(ClteDTO c);
	public void delete(int id);

}
