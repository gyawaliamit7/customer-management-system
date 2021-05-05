package com.ektha.spring.cms.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ektha.spring.cms.model.Customer;

public class CustomerMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Customer customer = new Customer();
		customer.setId(rs.getInt("id"));
		customer.setFirstName(rs.getString("firstName"));
		customer.setLastName(rs.getString("lastName"));
		customer.setPhoneNumber(rs.getString("phoneNumber"));
		customer.setEmailAddress(rs.getString("emailAddress"));
	
		return customer;
				
				 
	}

	
}
