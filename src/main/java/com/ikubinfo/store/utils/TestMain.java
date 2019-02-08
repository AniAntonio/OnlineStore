package com.ikubinfo.store.utils;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.ikubinfo.store.entity.Product;
import com.ikubinfo.store.entity.Store;
import com.ikubinfo.store.entity.User;
import com.ikubinfo.store.repository.ProductRepository;



public class TestMain {
	
	private static EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();
	private static EntityTransaction tx = em.getTransaction();
	public static void main(String[] args) {
		tx.begin();

		TypedQuery<User> userQuery = em.createQuery("Select u from User u  ", User.class);
		List<User> users = userQuery.getResultList();
		Product product = new Product();
		product.setName("Ring");
		product.setPrice(500);
		product.setValid(true);
		ProductRepository productRepository = new ProductRepository();
		productRepository.createProduct(product);

	}
	

}
