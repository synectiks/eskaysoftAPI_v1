package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

public class ProductCategoryDto implements Serializable, Comparable<ProductCategoryDto> {

	private static final long serialVersionUID = 1L;

	private Long productCategoryId;
	private String productCategoryName;

	public Long getProductCategoryId() {
		return this.productCategoryId;
	}

	public void setProductCategoryId(Long productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public String getProductCategoryName() {
		return this.productCategoryName;
	}

	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}

	@Override
	public int compareTo(ProductCategoryDto productcategories) {

		return this.productCategoryName.compareTo(productcategories.getProductCategoryName());
	}

}