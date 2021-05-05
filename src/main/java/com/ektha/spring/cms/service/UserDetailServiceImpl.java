package com.ektha.spring.cms.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


import com.ektha.spring.cms.model.User;
import com.ektha.spring.cms.util.UserDetailImp;

public class UserDetailServiceImpl  implements UserDetailsService{
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = new User();
		user.setUsername("admin");
		user.setPassword("amit");
		user.setRole("ADMIN");
		
		UserDetailImp userDetailImp = new UserDetailImp(user);
		
		return userDetailImp;
	   
	}

}
