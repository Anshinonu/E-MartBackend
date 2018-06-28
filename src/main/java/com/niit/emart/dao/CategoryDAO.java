package com.niit.emart.dao;

import java.util.List;

import com.niit.emart.model.Category;
import com.niit.emart.model.Product;
import com.niit.emart.model.Supplier;

public interface CategoryDAO {

	public boolean addCategory(Category category);

	public boolean updateCategory(Category category);

	public boolean deleteCategory(Category category);

	public Category getCategory(int categoryId);

	public List<Category> ListCategory();
}
