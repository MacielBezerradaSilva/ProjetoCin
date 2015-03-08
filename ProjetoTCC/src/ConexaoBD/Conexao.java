/**
 * 
 */
package ConexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
	
	private static final String dir = "D:/projetos/TCC/ProjetoCin/ProjetoTCC/db/DBEXPLORATORIO.FDB";
	private static final String driver = "org.firebirdsql.jdbc.FBDriver";
	private static final String databaseURL = "jdbc:firebirdsql:localhost:" + dir;
	private static final String user = "root";
	private static final String password = "turma15";

	java.sql.Connection con = null;
    java.sql.ResultSet rs = null;
    
    /**
     * Conexão com a base de dados 
     * @return boolean result
     */
	public boolean conectar(){
		
		boolean result = true;
		
		try {
			Class.forName(driver);
			con = java.sql.DriverManager.getConnection(databaseURL, user, password);
			System.out.println("conexao executada com sucesso");
		} catch (ClassNotFoundException e) {
            // A call to Class.forName() forces us to consider this exception
            System.out.println("Firebird JCA-JDBC driver not found in class path");
            System.out.println(e.getMessage());
			result = false;
		} catch (SQLException f) {
            f.printStackTrace();
            System.out.println("Não é possível estabelecer uma conexão através do gerenciador de driver.");
            showSQLException(f);
			result = false;
		}
		return result;
		
	}
	
	/**
	 * Desconectar a base de dados.
	 */
	public void desconectar(){	
        try {
            if (con != null)
                con.close();
            System.out.println("Conexão com a base de dados encerrada.");
        } catch (java.sql.SQLException e) {
            showSQLException(e);
        }
	}
	
	public java.sql.Connection getConnection() {
		return con;
	}
	
	public void setConnection(java.sql.Connection con) {
		this.con = con;
	}
	
    /**
     * Display an SQLException which has occurred in this application.
     * @param e SQLException
     */
    private static void showSQLException(java.sql.SQLException e) {
        /* Notice that a SQLException is actually a chain of SQLExceptions,
         * let's not forget to print all of them
         */
        java.sql.SQLException next = e;
        while (next != null) {
            System.out.println(next.getMessage());
            System.out.println("Error Code: " + next.getErrorCode());
            System.out.println("SQL State: " + next.getSQLState());
            next = next.getNextException();
        }
    }		
}
