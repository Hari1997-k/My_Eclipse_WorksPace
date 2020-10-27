package Dao;

import java.util.List;

import Model.Product;

public interface Product_Dao {

	public int createProduct(Product pro);

	public List<Product> viewAllProducts();

	public int updateProductByName(String pame);

	public int deleteProductByName(String pname);

	public Product getProductByName();

}
