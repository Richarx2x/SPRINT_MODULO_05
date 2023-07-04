package cl.grupo05.model.dao.interfaces;

import java.util.List;

import cl.grupo05.model.dto.CapacitacionDTO;

public interface ICapacitacionDAO {

	/**
	 * se declara el CRUD
	 */
	
	public void create(CapacitacionDTO t);
	public List<CapacitacionDTO> read();
	public CapacitacionDTO read(int id);
	public void update(CapacitacionDTO t);
	public void delete(int id);
}
