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
	
	@Override
	public void createCharter(Charter charter) {
		dao.saveCharter(charter);
		
	}

	
	@Override
	public void updateCharter(Charter charter) {
		dao.updateCharter(charter);
		
	}

	
	@Override
	public List<Charter> listarCharter() {
		return dao.listCharter();
	}

	
	@Override
	public void deleteCharter(Charter charter) {
		dao.deleteCharter(charter);
		
	}

}
