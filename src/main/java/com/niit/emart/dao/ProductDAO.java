package com.niit.emart.dao;

import java.util.List;

import com.niit.emart.model.Product;

public interface ProductDAO {
	public boolean addProduct(Product product);

	public boolean updateProduct(Product product);

	public boolean deleteProduct(Product product);

	public Product getProduct(int productId);

	public List<Product> Listproducts();

	public List<Product> ListproductsByCategory(int categoryId);

}
