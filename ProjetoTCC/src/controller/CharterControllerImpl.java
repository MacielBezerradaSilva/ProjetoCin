/**
 * 
 */
package controller;

import java.util.List;

import model.Charter;
import dao.CharterDao;
import dao.ICharterDao;

/**
 * @author Maciel B
 *
 */
public class CharterControllerImpl implements ICharterController{
	
	private ICharterDao dao; 
	
	public CharterControllerImpl(){
		this.dao = new CharterDao(); 
	}
	
	public void createCharter(Charter charter) {
		dao.saveCharter(charter);	
	}

	public void updateCharter(Charter charter) {
		dao.updateCharter(charter);
	}

	public List<Charter> listarCharter() {
		return dao.listCharter();
	}

	public void deleteCharter(Charter charter) {
		dao.deleteCharter(charter);
	}

}
