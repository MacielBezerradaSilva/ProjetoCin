/**
 * 
 */
package dao;

import java.sql.SQLException;
import java.util.List;

import entity.Product;

/**
 * @author Maciel B
 *
 */
public interface IProduct {
	
	public void saveProduct(Product product) throws SQLException;
	public void deleteProduct(Product product) throws SQLException; 
	public List<Product> listCharter() throws SQLException;
	public void updateProduct(Product product) throws SQLException;

}
