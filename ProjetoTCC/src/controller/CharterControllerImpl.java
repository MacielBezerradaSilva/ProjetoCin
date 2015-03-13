/**
 * 
 */
package controller;

import java.sql.SQLException;
import java.util.List;

import dao.CharterDao;
import dao.ICharterDao;
import entity.Charter;

/**
 * @author Maciel B
 *
 */
public class CharterControllerImpl implements ICharterController{
	
	private ICharterDao dao; 
	
	public CharterControllerImpl(){
		this.dao = new CharterDao(); 
	}
	
	public void createCharter(Charter charter) throws SQLException {
		dao.saveCharter(charter);	
	}

	public void updateCharter(Charter charter) throws SQLException{
		dao.updateCharter(charter);
	}

	public List<Charter> listarCharter() throws SQLException{
		return dao.listCharter();
	}

	public void deleteCharter(Charter charter) throws SQLException{
		dao.deleteCharter(charter);
	}

}
