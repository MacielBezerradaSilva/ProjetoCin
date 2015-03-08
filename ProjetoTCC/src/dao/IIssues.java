/**
 * 
 */
package dao;

import java.util.List;

import model.Issue;

/**
 * @author Maciel B
 *
 */
public interface IIssues {
	
	public void saveIssue(Issue issue);
	public void deleteIssue(Issue issue); 
	public List<Issue> listIssue();
	public void updateIssue(Issue issue);

}
