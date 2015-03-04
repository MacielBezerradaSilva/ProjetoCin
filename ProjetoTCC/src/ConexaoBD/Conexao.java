/**
 * 
 */
package ConexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
	
	private static final String driver = "org.firebirdsql.jdbc.FBDriver";
	private static final String url = "jdbc:firebirdsql:localhost:C:\\BaseTCC\\CHARTERS.fdb";
	private static final String user = "SYSDBA";
	private static final String password = "masterkey";
	private Connection connection;
	public ResultSet resultset;
	
	// o codigo de conxeao com o banco está correto.
	public boolean conecta(){
		
		boolean result = true;
		
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url,user,password);
			System.out.println("conexao executada com sucesso");
		} catch (ClassNotFoundException driver) {
			System.out.println("Driver não localizado "+driver);
			result = false;
		}catch (SQLException fonte) {
			System.out.println("Erro na conexão "+fonte);
			result = false;
		}
		return result;
		
	}
	public void desconeta(){
		boolean result = true;
		
		try {
			connection.close();
			System.out.println("banco fechado");
		} catch (SQLException fecha) {
			System.out.println("Não foi possível fechar a conexao"+fecha);
			result = false;
		}
	}
	public Connection getConnection() {
		return connection;
	}
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	public static void main(String args[]){
		 Conexao conexao = new Conexao();
		 conexao.conecta();
		}
	
}
