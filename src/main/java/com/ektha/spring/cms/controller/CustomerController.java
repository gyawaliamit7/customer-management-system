package com.ektha.spring.cms.controller;

import java.util.List;
import java.util.Map;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ektha.spring.cms.model.Customer;
import com.ektha.spring.cms.service.CustomerService;
import com.google.protobuf.StringValue;

@Controller
public class CustomerController {

	private CustomerService customerService;

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	@RequestMapping(value = "/customer/form")
	public String viewCustomer() {

		return "customer/user-form";
	}

	@RequestMapping(value = "/customer/add", method = RequestMethod.POST)
	public String addCustomer(@RequestParam Map<String, String> requestParams) {

		Customer customer = new Customer();
		customer.setFirstName(requestParams.get("firstName"));
		customer.setLastName(requestParams.get("lastName"));
		customer.setEmailAddress(requestParams.get("emailAddress"));
		customer.setPhoneNumber(requestParams.get("phoneNumber"));

		boolean isSuccess = this.customerService.addCustoemr(customer);

		if (isSuccess)
			return "customer/list";
		return "error";
	}

	@RequestMapping("/customer/view")
	public String viewAllCustomer(ModelMap modelMap) {

		List<Customer> customerList = this.customerService.viewAll();

		modelMap.addAttribute("customerList", customerList);

		return "customer/list";
	}

	@RequestMapping("/")
	public String home() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if(authentication == null || authentication instanceof AnonymousAuthenticationToken) {
			return "home";
		}
		return "redirect:/customer/view";
	}
	
	@RequestMapping("/customer/logout")
	public String logout() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if(authentication == null || authentication instanceof AnonymousAuthenticationToken) {
			return "home";
		}
		return "redirect:/customer/view";
	}

	@RequestMapping("/customer/edit")
	public String edit(@RequestParam("id") String id,  ModelMap modelMap) {

		Customer customer = customerService.findCustomer(id);
		if (customer == null) {
			return "error";
		}

		modelMap.addAttribute("customer", customer);

		return "customer/user-form";
	}
	
	@RequestMapping(value = "/customer/update", method = RequestMethod.POST)
	public String updateCustomer(@RequestParam Map<String, String> requestParams) {

		Customer customer = new Customer();
		customer.setId(Integer.parseInt(requestParams.get("id")));
		customer.setFirstName(requestParams.get("firstName"));
		customer.setLastName(requestParams.get("lastName"));
		customer.setEmailAddress(requestParams.get("emailAddress"));
		customer.setPhoneNumber(requestParams.get("phoneNumber"));

		boolean isSuccess = this.customerService.updateCustomer(customer);

		if (isSuccess)
			return "customer/list";
		return "error";
	}
	

	@RequestMapping("/customer/delete")
	public String deleteCustomer(@RequestParam("id") String id, ModelMap modelMap) {
	
		boolean isSuccess = this.customerService.deleteCustomer(id);
		
		if(isSuccess)
			return "customer/list";
		return "error";
	}
	
	@RequestMapping("error")
	public String errorPage() {
		return "error";
	}
}
