package com.niit.emart.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.emart.dao.ProductDAO;
import com.niit.emart.model.Category;
import com.niit.emart.model.Product;
import com.niit.emart.model.User;

@Repository(value="productDAO")
@Transactional//it provides acid property 
public class ProductDAOImpl  implements ProductDAO{
	//to hide the implementation data we use interface class and it is loose coupling and also used in factory pattern
		@Autowired
		private SessionFactory sessionFactory;


		public boolean addProduct(Product product) {
			// TODO Auto-generated method stub
			try {
				sessionFactory.getCurrentSession().save(product);

				return true;
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			return false;
		}
		}

		public boolean updateProduct(Product product) {
			// TODO Auto-generated method stub
			try {
				sessionFactory.getCurrentSession().save(product);

				return true;
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			return false;
		}
		}

		public boolean deleteProduct(Product product) {
			// TODO Auto-generated method stub
			try {
				sessionFactory.getCurrentSession().save(product);

				return true;
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			return false;
		}
		}

		public Product getProduct(int productId) {
			// TODO Auto-generated method stub
			try {
				Session session=sessionFactory.getCurrentSession();
				Product prop=(Product)session.get(Product.class,productId);
				return prop;
				
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			return null;
			}
		}

		public List<Product> Listproducts() {
			// TODO Auto-generated method stub
			try {
				Session session=sessionFactory.getCurrentSession();
			Query q=session.createQuery("from product");
				List<Product>ListProduct=q.list();
				return ListProduct;
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			return null;
			}
		}

		public List<Product> ListproductsByCategory(int categoryId) {
			// TODO Auto-generated method stub
			try {
				Session session=sessionFactory.getCurrentSession();
			Query q=session.createQuery("from product where categoryId= :catid");
				List<Product>ListProductsByCategory=q.list();
				return ListProductsByCategory;
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			return null;
		}
		}

}
