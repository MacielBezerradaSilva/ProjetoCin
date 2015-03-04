/**
 * 
 */
package dao;

import java.util.List;

import model.Charter;

/**
 * @author Maciel B
 *
 */
public interface ICharterDao {
	
	public void saveCharter(Charter charter);
	public void deleteCharter(Charter charter); 
	public List<Charter> listCharter();
	public void updateCharter(Charter chater);
}
