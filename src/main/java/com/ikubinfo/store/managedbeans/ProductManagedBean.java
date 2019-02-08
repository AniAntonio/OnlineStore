package com.ikubinfo.store.managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.ikubinfo.store.model.ProductModel;
import com.ikubinfo.store.service.ProductService;
@ManagedBean (name ="productManagedBean")
@SessionScoped
public class ProductManagedBean {
	
	private ProductService productService;
	
	private ProductModel productModel;
	
	

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public ProductModel getProductModel() {
		return productModel;
	}

	public void setProductModel(ProductModel productModel) {
		this.productModel = productModel;
	}
	
	
	
	

}
