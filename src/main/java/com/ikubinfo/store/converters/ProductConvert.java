package com.ikubinfo.store.converters;

import com.ikubinfo.store.entity.Product;
import com.ikubinfo.store.model.ProductModel;

public class ProductConvert {
	
	public static Product convertToProduct(ProductModel productModel) {
	Product	product = new Product();
	product.setId(productModel.getId());
	product.setName(productModel.getName());
	product.setPrice(productModel.getPrice());
	product.setValid(productModel.isValid());
	return product;	
	}
	
	public static ProductModel convertToProductModel(Product product) {
		ProductModel productModel = new ProductModel();
		productModel.setId(product.getId());
		productModel.setName(product.getName());
		productModel.setPrice(product.getPrice());
		productModel.setValid(product.isValid());
		return productModel;
	}

}
