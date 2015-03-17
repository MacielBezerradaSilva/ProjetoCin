/**
 * 
 */
package dao;

import java.sql.SQLException;
import java.util.List;

import entity.Issue;

/**
 * @author Maciel B
 *
 */
public interface IIssues {
	
	public void saveIssue(Issue issue) throws SQLException;
	public void deleteIssue(Issue issue) throws SQLException; 
	public List<Issue> listIssue() throws SQLException;
	public void updateIssue(Issue issue) throws SQLException;

}
