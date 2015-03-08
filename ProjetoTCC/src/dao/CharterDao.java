package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Charter;
import ConexaoBD.Conexao;

public class CharterDao implements ICharterDao{

	private Charter charter;
	private Conexao conexao;
	List<Charter> charters;

	public CharterDao(){
		this.charter = new Charter();
		this.conexao = new Conexao();
		this.charters = new ArrayList<Charter>();
	}

	public void saveCharter(Charter charter) {
		conexao.conectar();	
		try {
			//java.sql.Statement stmt = conexao.getConnection().createStatement();
			
			PreparedStatement pStatement = conexao.getConnection().prepareStatement("INSERT INTO CHARTERS (NAME,OBJECTIVE,SETUP,NOTES,KEYAREAS,ISSUESTOBEAWARE,IMPORTANTNOTES,REQUIREMENTS,MAXTIME,MINTIME) VALUES (?,?,?,?,?,?,?,?,?,?)");		
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
			conexao.desconectar();
		} catch (SQLException e) {
			System.out.println("Erro de inserção"+e.getMessage());
		}

	}

	public void deleteCharter(Charter charter) {
		conexao.conectar();
		try {
			PreparedStatement pStatment = 
					conexao.getConnection().prepareStatement("Delete from Charters where EtId = ? ");
			pStatment.setInt(1, charter.getEtId());
			pStatment.executeUpdate();
			conexao.desconectar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Charter> listCharter() {
		conexao.conectar();
		try {
			PreparedStatement pStatement = conexao.getConnection().prepareStatement("Select * from CHARTERS");
			ResultSet rs = pStatement.executeQuery();
			while(rs.next()){
				Charter charter = new Charter();
				charter.setEtId(rs.getInt("ETID"));
				charter.setName(rs.getString("NAME"));
				charter.setObjective(rs.getString("OBJECTIVE"));
				charter.setSetup(rs.getString("SETUP"));
				charter.setNotes(rs.getString("NOTES"));
				charter.setKeyAreas(rs.getString("KEYAREAS"));
				charter.setIssuesToBeAware(rs.getString("ISSUESTOBEAWARE"));
				charter.setImportantNotes(rs.getString("IMPORTANTNOTES"));
				charter.setRequirements(rs.getString("REQUIREMENTS"));
				charter.setMaxTime(rs.getInt("MAXTIME"));
				charter.setMinTime(rs.getInt("MINTIME"));
				charters.add(charter);
				conexao.desconectar();
			}
			rs.close();
			pStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
		return charters;
	}

	public void updateCharter(Charter chater) {
		conexao.conectar();
		try {
			PreparedStatement pStatement = 
					conexao.getConnection().prepareStatement("UPDATE CHARTERS SET name = ?, objective = ?, setup = ?, notes = ?, keyareas = ?, issuestobeaware = ?, importantnotes = ?, requirements = ?, maxtime = ?, mintime = ? where EtId = ?");	
			pStatement.setString(1,chater.getName());
			pStatement.setString(2,chater.getObjective());
			pStatement.setString(3,chater.getSetup());
			pStatement.setString(4,chater.getNotes());
			pStatement.setString(5,chater.getKeyAreas());
			pStatement.setString(6,chater.getIssuesToBeAware());
			pStatement.setString(7, chater.getImportantNotes());
			pStatement.setString(8, chater.getRequirements());
			pStatement.setInt(9, chater.getMaxTime());
			pStatement.setInt(10,chater.getMinTime());
			pStatement.setInt(11,chater.getEtId());
			pStatement.executeUpdate();
			conexao.desconectar();
		} catch (Exception e) {
			System.out.println("Erro de atualização "+e.getMessage());
		}
	}

	public Charter getCharter() {
		return charter;
	}
	
	public void setCharter(Charter charter) {
		this.charter = charter;
	}

	public static void main(String[]args){		

		Charter chater = new Charter();
		chater.setEtId(3);
		/*chater.setName("Pedrino");
		chater.setObjective("Bastiano");
		chater.setSetup("ttttt");
		chater.setNotes("ttttttt");
		chater.setKeyAreas("kkkkkk");
		chater.setIssuesToBeAware("eeeeee");
		chater.setImportantNotes("wwwwwww");
		chater.setRequirements("999999");
		chater.setMaxTime(444);
		chater.setMinTime(5555);
		chater.setEtId(2);*/
		CharterDao dao = new CharterDao();
		dao.saveCharter(chater);
		//dao.deleteCharter(chater);
		//dao.update(chater);
	}
}
