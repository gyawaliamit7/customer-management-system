package com.ektha.spring.cms.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ektha.spring.cms.model.Customer;
import com.ektha.spring.cms.util.CustomerMapper;

@Repository
public class CustomerDAOSpringJDBC implements ICustomerDAO {

	private JdbcTemplate jdbcTempate;

	/* We need this setter method to inject dependency */
	public void setJdbcTempate(JdbcTemplate jdbcTempate) {
		this.jdbcTempate = jdbcTempate;
	}

	@Override
	public boolean add(Customer customer) {
	
		String queryString = "insert into cms.customer (firstName, lastName, emailAddress, phoneNumber) values (?,?,?,?)";
		int result = jdbcTempate.update(queryString, customer.getFirstName(), customer.getLastName(), customer.getEmailAddress(), customer.getPhoneNumber());
		if(result > 0) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean delete(Customer customer) {
		int resp = jdbcTempate.update("delete from cms.customer where id = ?", customer.getId());
		
		if(resp > 0) {
			return true;
		}
		
		return false;
		
	}

	@Override
	public List<Customer> viewAll() {
		
		List<Customer> customerList = (List<Customer>) jdbcTempate.query("select * from cms.customer", new CustomerMapper());
		
		return customerList;
		
	}

	@Override
	public boolean update(Customer customer) {

		String queryString = "update cms.customer set firstName = ?, lastName = ?, emailAddress =?, phoneNumber =? where id = ?";
		int result = jdbcTempate.update(queryString, customer.getFirstName(), customer.getLastName(), customer.getEmailAddress(), customer.getPhoneNumber(), customer.getId());
		if(result > 0) {
			return true;
		}
		
		return false;
	}

	@Override
	public Customer findCustomer(String id) {

		Customer customer = (Customer) jdbcTempate.queryForObject("select * from cms.customer where id = ?",
				new Object[] {id } , new CustomerMapper());
		
		return customer;
	
	}

}
