/**
 * 
 */
package dao;

import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Session;
import ConexaoBD.Conexao;

/**
 * @author Maciel B
 *
 */
public class SessionDaoXML implements ISessionDAO{

	private Conexao conexao;
	private Session session;
	List<Session> sessions;

	public SessionDaoXML(){
		this.conexao = new Conexao();
		this.session = new Session();
		this.sessions = new ArrayList<Session>();
	}
	
	
	@Override
	public void saveSession(Session session)
			throws FileNotFoundException {
		conexao.conecta();	
		try {
			PreparedStatement pStatement = conexao.getConnection().prepareStatement("INSERT INTO SESSION (TESTERNAME,DURATION,COMMENTS,FK_CHARTER,FK_PRODUCT,FK_ISSUES,CURRENTTIME) VALUES (?,?,?,?,?,?,?)");		
			pStatement.setString(1,charter.getName());
			pStatement.setString(2,charter.getObjective());
			pStatement.setString(3,charter.getSetup());
			pStatement.setString(4,charter.getNotes());
			pStatement.setString(5,charter.getKeyAreas());
			pStatement.setString(6,charter.getIssuesToBeAware());
			pStatement.setString(7,charter.getImportantNotes());
			pStatement.setString(8,charter.getRequirements());
			pStatement.setInt(9,charter.getMaxTime());
			pStatement.setInt(10,charter.getMinTime());
			pStatement.executeUpdate();
			conexao.desconeta();
		} catch (SQLException e) {
			System.out.println("Erro de inserção"+e.getMessage());
		}
		
	}

}
