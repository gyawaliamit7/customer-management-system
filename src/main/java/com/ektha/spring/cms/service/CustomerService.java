package com.ektha.spring.cms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ektha.spring.cms.dao.ICustomerDAO;
import com.ektha.spring.cms.model.Customer;

@Service
public class CustomerService implements ICustomerService {
	
	private ICustomerDAO customerDAO;
	
	public void setCustomerDAO(ICustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	@Override
	public boolean addCustoemr(Customer customer) {
		return customerDAO.add(customer);
	}

	@Override
	public boolean deleteCustomer(String id) {
		
		Customer customer = customerDAO.findCustomer(id);
		return customerDAO.delete(customer);
	
	}

	@Override
	public Customer findCustomer(String id) {
		return this.customerDAO.findCustomer(id);
		
	}

	@Override
	public List<Customer> viewAll() {
		return this.customerDAO.viewAll();
	}

	
	@Override
	public boolean updateCustomer(String id) {
		Customer customer = customerDAO.findCustomer(id);
		return customerDAO.update(customer);
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDAO.update(customer);
	}
	
	

}
