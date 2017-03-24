package com.launch.ecommerce.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ECommerceController {
	
	@Autowired
	ECommerceService service;
	
	@Autowired
	MessageSource messageSource;
	
	/*
	 * List all existing customers
	 */
	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String listCustomers(Model model) {
		List<Customer> customers = service.findAllCustomers();
		return "allcustomers";
	}
	
	/*
	 * Add a new customer infomation
	 */
	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String newCustomer(ModelMap model){
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		model.addAttribute("edit", false);	
		return "addcustomer";
	}
	
	/*
	 * Edit a exist customer infomation
	 */
	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String newCustomer(@Valid Customer customer, BindingResult result, ModelMap model){
		if (result.hasErrors()) {
			return "addcustomer";
		}
		
		service.saveCustomer(customer);
		model.addAttribute("success", "Customer " + customer.getEbayId() + " added successfully !");	
		return "success";
	}
	

}

