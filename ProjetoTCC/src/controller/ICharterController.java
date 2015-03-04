/**
 * 
 */
package controller;

import java.util.List;

import model.Charter;

/**
 * @author Maciel B
 *
 */
public interface ICharterController {
	
	public void createCharter(Charter charter);
	public void updateCharter(Charter charter);
	public List<Charter> listarCharter();
	public void deleteCharter(Charter charter);

}
