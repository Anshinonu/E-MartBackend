package com.niit.emart.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.emart.dao.CategoryDAO;
import com.niit.emart.model.Category;
import com.niit.emart.model.User;

@Repository(value="categoryDAO")
@Transactional//it provides acid property 
public class CategoryDAOImpl implements CategoryDAO{
	//to hide the implementation data we use interface class and it is loose coupling and also used in factory pattern
		@Autowired
		private SessionFactory sessionFactory;


		public boolean addCategory(Category category) {
			// TODO Auto-generated method stub
			try {
				sessionFactory.getCurrentSession().save(category);

				return true;
			} 
			catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			return false;
		}
		}
		public boolean updateCategory(Category category) {
			// TODO Auto-generated method stub
			try {
				sessionFactory.getCurrentSession().update(category);

				return true;
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			return false;
		}
		}

		public boolean deleteCategory(Category category) {
			// TODO Auto-generated method stub
			try {
				sessionFactory.getCurrentSession().delete(category);

				return true;
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			return false;
		}
		}

		public Category getCategory(int categoryId) {
			// TODO Auto-generated method stub
			try {
				Session session=sessionFactory.getCurrentSession();
				Category category=(Category)session.get(Category.class,categoryId);
				return category;
				
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			return null;
		}
		}

		public List<Category> ListCategory() {
			// TODO Auto-generated method stub
			try {
				Session session=sessionFactory.getCurrentSession();
			Query q=session.createQuery("from category");
				List<Category>ListCategory=q.list();
				return ListCategory;
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			return null;
		}
			

}
}
