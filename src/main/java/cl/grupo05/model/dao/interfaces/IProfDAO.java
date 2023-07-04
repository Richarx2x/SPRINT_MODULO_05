package cl.grupo05.model.dao.interfaces;

import java.util.*;

import cl.grupo05.model.dto.ProfDTO;

public interface IProfDAO {
	
	/**
	 * se declara el CRUD
	 */
	
	public void create(ProfDTO p);
	public List<ProfDTO> read();
	public ProfDTO read(int id);
	public void update(ProfDTO p);
	public void delete(int id);

}
