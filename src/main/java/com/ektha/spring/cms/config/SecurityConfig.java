//package com.ektha.spring.cms.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//
////this is a servlet filter class known as spring security filter chain which is responsible for all the security.
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//	@Bean 
//	public UserDetailsService userDetailsService() {
//		 
//		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//	    manager.createUser(User.withDefaultPasswordEncoder().username("user").password("password").roles("USER").build());
//	    return manager;
//	}
//	
//	
//}
