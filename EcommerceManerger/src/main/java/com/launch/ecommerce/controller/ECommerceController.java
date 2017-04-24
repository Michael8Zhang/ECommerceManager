package com.launch.ecommerce.controller;

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.launch.ecommerce.model.ECustomer;;

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
		List<ECustomer> customers = service.findAllCustomers();
		return "allcustomers";
	}
	
	/*
	 * Add a new customer information
	 */
	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String newCustomer(ModelMap model){
		ECustomer customer = new ECustomer();
		model.addAttribute("ecustomer", customer);
		model.addAttribute("edit", false);	
		return "addcustomer";
	}
	
	/*
	 * Edit a exist customer information
	 */
	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String newCustomer(@Valid ECustomer customer, BindingResult result, ModelMap model){
		if (result.hasErrors()) {
			return "addcustomer";
		}
		
		if(!service.isEcustomerUnique(customer.getEbayId(), customer.getEbayId())){
            FieldError ssnError =new FieldError("customer","ebayId",messageSource.getMessage("non.unique.ebayid", new String[]{customer.getEbayId()}, Locale.getDefault()));
            result.addError(ssnError);
            return "registration";
        }
		service.saveCustomer(customer);
		model.addAttribute("success", "Customer " + customer.getEbayId() + " added successfully !");	
		return "success";
	}
	

}


