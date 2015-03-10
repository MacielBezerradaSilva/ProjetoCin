/**
 * 
 */
package controller;

import java.sql.SQLException;
import java.util.List;

import model.Charter;

/**
 * @author Maciel B
 *
 */
public interface ICharterController {
	
	public void createCharter(Charter charter) throws SQLException;
	public void updateCharter(Charter charter) throws SQLException;
	public List<Charter> listarCharter() throws SQLException;
	public void deleteCharter(Charter charter) throws SQLException;

}
