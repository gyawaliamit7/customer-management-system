package com.ektha.spring.cms.service;


import java.util.List;

import com.ektha.spring.cms.model.Customer;

public interface ICustomerService {

	public boolean addCustoemr(Customer customer);
	public Customer findCustomer(String id);
	public List<Customer> viewAll();
	public boolean updateCustomer(Customer customer);
	boolean updateCustomer(String id);
	boolean deleteCustomer(String id);
}
