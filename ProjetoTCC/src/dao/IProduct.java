/**
 * 
 */
package dao;

import java.util.List;

import model.Product;

/**
 * @author Maciel B
 *
 */
public interface IProduct {
	
	public void saveProduct(Product product);
	public void deleteProduct(Product product); 
	public List<Product> listCharter();
	public void updateProduct(Product product);

}
