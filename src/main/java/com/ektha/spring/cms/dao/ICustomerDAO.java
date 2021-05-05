package com.ektha.spring.cms.dao;


import java.util.List;

import com.ektha.spring.cms.model.Customer;

public interface ICustomerDAO {
	
	public boolean add(Customer customer);
	public boolean delete(Customer customer);
	public List<Customer> viewAll();
	public boolean update(Customer customer);
	public Customer findCustomer(String id);

}
