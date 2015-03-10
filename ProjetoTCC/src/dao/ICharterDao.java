/**
 * 
 */
package dao;

import java.sql.SQLException;
import java.util.List;

import model.Charter;

/**
 * @author Maciel B
 *
 */
public interface ICharterDao {
	
	public void saveCharter(Charter charter) throws SQLException;
	public void deleteCharter(Charter charter) throws SQLException; 
	public List<Charter> listCharter() throws SQLException;
	public void updateCharter(Charter chater) throws SQLException;
}
