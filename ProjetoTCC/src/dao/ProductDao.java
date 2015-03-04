/**
 * 
 */
package dao;

import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Product;
import ConexaoBD.Conexao;

/**
 * @author Maciel B
 *
 */
public class ProductDao implements IProduct{

	private Conexao conexao;
	private Product product;
	List<Product> products;

	public ProductDao(){
		this.conexao = new Conexao();
		this.product = new Product();
		this.products = new ArrayList<Product>();
	}

	@Override
	public void saveProduct(Product product) {
		conexao.conecta();	
		try {
			PreparedStatement pStatement = conexao.getConnection().prepareStatement("INSERT INTO PRODUCTS (NAME,PROJECT,LABEL) VALUES (?,?,?)");		
			pStatement.setString(1,product.getName());
			pStatement.setString(2,product.getProject());
			pStatement.setArray(3, (Array) product.getLabels());
			pStatement.executeUpdate();
			conexao.desconeta();
		} catch (SQLException e) {
			System.out.println("Erro de inserção"+e.getMessage());
		}
	}

	@Override
	public void deleteProduct(Product product) {
		conexao.conecta();
		try {
			PreparedStatement pStatment = 
					conexao.getConnection().prepareStatement("Delete from PRODUCTS where Id = ? ");
			pStatment.setInt(1, product.getId());
			pStatment.executeUpdate();
			conexao.desconeta();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	@Override
	public List<Product> listCharter() {
		conexao.conecta();
		try {
			PreparedStatement pStatement = conexao.getConnection().prepareStatement("Select * from PRODUCTS");
			ResultSet rs = pStatement.executeQuery();
			while(rs.next()){
				Product product = new Product();
				product.setId(rs.getInt("ID"));
				product.setName(rs.getString("NAME"));
				product.setProject(rs.getString("PROJECT"));
				products.add(product);
				conexao.desconeta();
			}
			rs.close();
			pStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
		return products;
	}	

	@Override
	public void updateProduct(Product product) {
		conexao.conecta();
		try {
			PreparedStatement pStatement = conexao.getConnection().prepareStatement("UPDATE PRODUCTS SET NAME = ?, PROJECT, LABEL where id = ?");
			pStatement.setString(1, product.getName());
			pStatement.setString(2, product.getProject());
			pStatement.setArray(3, (Array) product.getLabels());;
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String args[]){
		Product product = new Product();
		product.setName("lllllll");
		product.setProject("ppppp");

		String test = "maciel";
		List<String> labels_aux = new ArrayList<String>();
		labels_aux.add(test);

		product.setLabels(labels_aux);
		ProductDao dao = new ProductDao();
		dao.saveProduct(product);
	}

}
