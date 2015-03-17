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

import entity.Product;
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

	public void saveProduct(Product product) throws SQLException{
		conexao.conectar();	
		PreparedStatement pStatement = conexao.getConnection().prepareStatement("INSERT INTO PRODUCTS (NAME,PROJECT,LABEL) VALUES (?,?,?)");		
		pStatement.setString(1,product.getName());
		pStatement.setString(2,product.getProject());
		pStatement.setArray(3, (Array) product.getLabels());
		pStatement.executeUpdate();
		conexao.desconectar();
	}
	
	public void deleteProduct(Product product) throws SQLException{
		conexao.conectar();
		PreparedStatement pStatment = 
				conexao.getConnection().prepareStatement("Delete from PRODUCTS where product_id = ? ");
		pStatment.setInt(1, product.getId());
		pStatment.executeUpdate();
		conexao.desconectar();
	}
	
	public List<Product> listCharter() throws SQLException{
		conexao.conectar();
		PreparedStatement pStatement = conexao.getConnection().prepareStatement("Select * from PRODUCTS");
		ResultSet rs = pStatement.executeQuery();
		while(rs.next()){
			Product product = new Product();
			product.setId(rs.getInt("PRODUCT_ID"));
			product.setName(rs.getString("NAME"));
			product.setProject(rs.getString("PROJECT"));
			products.add(product);
			conexao.desconectar();
		}
		rs.close();
		pStatement.close();
		return products;
	}	

	public void updateProduct(Product product) throws SQLException{
		conexao.conectar();
		PreparedStatement pStatement = conexao.getConnection().prepareStatement("UPDATE PRODUCTS SET NAME = ?, PROJECT, LABEL where product_id = ?");
		pStatement.setString(1, product.getName());
		pStatement.setString(2, product.getProject());
		pStatement.setArray(3, (Array) product.getLabels());;
	}
	
}
