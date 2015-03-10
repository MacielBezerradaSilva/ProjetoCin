/**
 * 
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Issue;
import ConexaoBD.Conexao;


/**
 * @author Maciel B
 *
 */
public class IssuesDao implements IIssues{

	private Conexao conexao;
	private Issue issue;
	List<Issue> issues;

	public IssuesDao(){
		this.conexao = new Conexao();
		this.issue = new Issue();
		this.issues = new ArrayList<Issue>();
	}

	public void saveIssue(Issue issue) throws SQLException{
		conexao.conectar();	
		PreparedStatement pStatement = conexao.getConnection().prepareStatement("INSERT INTO ISSUES (NAME,DESCRIPTION,TIPE) VALUES (?,?,?)");		
		pStatement.setString(1,issue.getName());
		pStatement.setString(2,issue.getDescription());
		pStatement.setString(3,issue.getTipo()	);
		pStatement.executeUpdate();
		conexao.desconectar();
	}

	public void deleteIssue(Issue issue) throws SQLException{
		conexao.conectar();
		PreparedStatement pStatment = 
				conexao.getConnection().prepareStatement("Delete from ISSUES where issue_id = ? ");
		pStatment.setInt(1, issue.getId());
		pStatment.executeUpdate();
		conexao.desconectar();
	}

	//falta colocar o campo creation date
	public List<Issue> listIssue() throws SQLException{
		conexao.conectar();
		PreparedStatement pStatement = conexao.getConnection().prepareStatement("Select * from ISSUES");
		ResultSet rs = pStatement.executeQuery();
		while(rs.next()){
			Issue issue = new Issue();
			issue.setId(rs.getInt("ISSUE_ID"));
			issue.setName(rs.getString("NAME"));
			issue.setDescription(rs.getString("DESCRIPTION"));
			issues.add(issue);
			conexao.desconectar();
		}
		rs.close();
		pStatement.close();
		return issues;
	}

	public void updateIssue(Issue issue) throws SQLException{
		PreparedStatement pStatement = 
				conexao.getConnection().prepareStatement("UPDATE ISSUES SET name = ?, description = ?, tipe = ? where issue_id = ?");	
		pStatement.setString(1,issue.getName());
		pStatement.setString(2,issue.getDescription());
		pStatement.setString(3,issue.getTipo());
		pStatement.executeUpdate();
		conexao.desconectar();
	}
}
