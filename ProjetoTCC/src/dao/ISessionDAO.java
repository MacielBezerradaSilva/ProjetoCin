/**
 * 
 */
package dao;

import java.io.FileNotFoundException;

import model.Session;

/**
 * @author Maciel B
 *
 */
public interface ISessionDAO {
	public void saveSession(Session session)throws FileNotFoundException;
}
