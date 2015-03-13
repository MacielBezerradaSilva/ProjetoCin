package controller;

import dao.IProduct;
import dao.ProductDao;
import entity.Product;

/**
 *
 * @author Flavio Santos
 */
public class ProductController {

    private static ProductController instance;
    private IProduct dao;

    public ProductController() {
        dao = new ProductDao();
    }

    public synchronized static ProductController getInstance() {
        if (instance == null) {
            instance = new ProductController();
        }
        return instance;
    }

    public Product[] getProducts() {
        return null;
    }

    public Product getProductByName(String name) {
        return null;
    }

    public Product getProductById(String id) {
        return null;
    }
    
    public Product getProductByIndex(String id) {
        return null;
    }
    
    public String[] getProductNames() {
        return null;
    }
}
