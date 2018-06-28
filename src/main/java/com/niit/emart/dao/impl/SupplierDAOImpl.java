package com.niit.emart.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.emart.dao.SupplierDAO;
import com.niit.emart.model.Category;
import com.niit.emart.model.Product;
import com.niit.emart.model.Supplier;
import com.niit.emart.model.User;


@Repository(value = "supplierDAO")
@Transactional // it provides acid property
public class SupplierDAOImpl implements SupplierDAO {
	// to hide the implementation data we use interface class and it is loose
	// coupling and also used in factory pattern
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(supplier);

			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		return false;
		}
	}

	public boolean updateSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(supplier);

			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		return false;
		}
	}

	public boolean deleteSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(supplier);

			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		return false;
		}
	}

	public Supplier getSupplier(int supplierId) {
		// TODO Auto-generated method stub
		try {
			Session session=sessionFactory.getCurrentSession();
			Supplier supplier=(Supplier)session.get(Supplier.class,supplierId);
			return supplier;
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		return null;
	}
	}

	public List<Supplier> ListSuppliers() {
		// TODO Auto-generated method stub
		try {
			Session session=sessionFactory.getCurrentSession();
		Query q=session.createQuery("from supplier");
			List<Supplier>ListSupplier=q.list();
			return ListSupplier;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		return null;
	}
		

}
}

	