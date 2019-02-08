package com.ikubinfo.store.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.ikubinfo.store.entity.Product;
import com.ikubinfo.store.utils.HibernateUtil;

public class ProductRepository {

	private static EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
	private static EntityTransaction tx = em.getTransaction();

	public boolean createProduct(Product product) {
		tx.begin();
		try {
		em.persist(product);
		tx.commit();
		return true;
		}catch (Exception e){
			
		return false;
		}
		

	}

}
