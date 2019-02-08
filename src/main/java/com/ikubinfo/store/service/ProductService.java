package com.ikubinfo.store.service;

import com.ikubinfo.store.converters.ProductConvert;
import com.ikubinfo.store.model.ProductModel;
import com.ikubinfo.store.repository.ProductRepository;

public class ProductService {
	
	private ProductRepository productrepository;
	
	public boolean create(ProductModel productModel) {
		
		return productrepository.createProduct(ProductConvert.convertToProduct(productModel));
	}
	

}
