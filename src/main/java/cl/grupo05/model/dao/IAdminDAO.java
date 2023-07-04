package cl.grupo05.model.dao;

import java.util.List;
import cl.grupo05.model.dto.AdminDTO;




public interface IAdminDAO {
	/**
	 * se declara el CRUD
	 */

	
	public void create( AdminDTO a);
	public List<AdminDTO> read();
	public  AdminDTO read (int id);
	public void update(AdminDTO a);
	public void delete(int id);

}
