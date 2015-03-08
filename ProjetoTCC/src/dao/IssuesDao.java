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

	public void saveIssue(Issue issue) {
		conexao.conectar();	
		try {
			PreparedStatement pStatement = conexao.getConnection().prepareStatement("INSERT INTO ISSUES (NAME,DESCRIPTION,TIPE) VALUES (?,?,?)");		
			pStatement.setString(1,issue.getName());
			pStatement.setString(2,issue.getDescription());
			pStatement.setString(3,issue.getTipe()	);
			pStatement.executeUpdate();
			conexao.desconectar();
		} catch (SQLException e) {
			System.out.println("Erro de inserção"+e.getMessage());
		}

	}

	public void deleteIssue(Issue issue) {
		conexao.conectar();
		try {
			PreparedStatement pStatment = 
					conexao.getConnection().prepareStatement("Delete from ISSUES where Id = ? ");
			pStatment.setInt(1, issue.getId());
			pStatment.executeUpdate();
			conexao.desconectar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Issue> listIssue() {
		conexao.conectar();
		try {
			PreparedStatement pStatement = conexao.getConnection().prepareStatement("Select * from ISSUES");
			ResultSet rs = pStatement.executeQuery();
			while(rs.next()){
				Issue issue = new Issue();
				issue.setId(rs.getInt("ID"));
				issue.setName(rs.getString("NAME"));
				issue.setDescription(rs.getString("DESCRIPTION"));
				issues.add(issue);
				conexao.desconectar();
			}
			rs.close();
			pStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
		return issues;
	}

	public void updateIssue(Issue issue) {
		try {
			PreparedStatement pStatement = 
					conexao.getConnection().prepareStatement("UPDATE ISSUES SET name = ?, description = ?, tipe = ? where id = ?");	
			pStatement.setString(1,issue.getName());
			pStatement.setString(2,issue.getDescription());
			pStatement.setString(3,issue.getTipe());
			pStatement.executeUpdate();
			conexao.desconectar();
		} catch (Exception e) {
			System.out.println("Erro de atualização "+e.getMessage());
		}
	}
}
