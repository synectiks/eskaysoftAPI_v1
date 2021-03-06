package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.entity.CustomerWiseDiscounts;
import com.rest.eskaysoftAPI.model.CustomerWiseDiscountsDto;

public interface CustomerWiseDiscountsService {

	List<CustomerWiseDiscountsDto> listAllCustomerWiseDiscounts();
	
	List<CustomerWiseDiscountsDto> listAllCustomerWiseDiscountsByAccountId(Long id);

	CustomerWiseDiscountsDto getCustomerWiseDiscountsById(Long id);

	CustomerWiseDiscountsDto updatecwd(CustomerWiseDiscountsDto customerWiseDiscounts);

	boolean deleteCustomerWiseDiscounts(Long id);

	List<CustomerWiseDiscounts> create(CustomerWiseDiscountsDto customerWiseDiscounts);

}
