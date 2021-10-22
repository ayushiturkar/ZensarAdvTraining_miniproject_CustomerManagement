package com.zensar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zensar.dao.CustRepository;
import com.zensar.model.Customer;


@Controller
public class CustomerController {

	
	 @Autowired
	    private CustRepository crepo;
	

	@GetMapping("/list")
	public String viewall(Model m)
	{
		System.out.println("in home");
		List<Customer> slist=crepo.findAll();
		m.addAttribute("listCustomer",slist);
		
		return "index";
	}	

	
	
	  @PostMapping(value="/add/save") public String
	  saveadd(@ModelAttribute("custom") Customer c2) { crepo.save(c2); return
	 "redirect:/list"; }
	 
	/*
	 * @GetMapping(value="/add") public String addCustomer
	 * (@ModelAttribute("custom") Customer c2) { crepo.save(c2); return
	 * "redirect:/list"; }
	 */
	
	@GetMapping(value="/add/")
	public String addccustomer(Model m)
	{   
		Customer c1=new Customer();
		
		m.addAttribute("customer",c1);
		return "AddCustomer";
	}
			
		
	
	/*
	 * @PostMapping(value="/addpage") public String
	 * showAddCustomerPage(@ModelAttribute("custo") Customer c2) { crepo.save(c2);
	 * return "AddCustomer"; }
	 */
	 
	/*
	 * @PostMapping(value="/add") public String showNewProductPage(Model model) {
	 * Customer customer = new Customer(); model.addAttribute("customer", customer);
	 * System.out.println("in add"); return "redirect:/list"; }
	 */
	
	@GetMapping(value="/delete/{cid}")
	public String deleteCustomer(@PathVariable(name = "cid") int id) {
	    crepo.deleteById(id);
	    return "redirect:/list";       
	}

	@PostMapping(value="/edit/save")
	public String save(@ModelAttribute("cust") Customer c1) {
		
		crepo.save(c1);
		return "redirect:/list";  
	}

@GetMapping(value="/edit/{cid}")
public String updatecustomer(@PathVariable int cid,Model m)
{   
	Customer c1=crepo.findById(cid).orElse(null);
	System.out.println(c1);
	System.out.println("in edit "+cid );
	m.addAttribute("customer",c1);
	return "AddCustomer";
}

	  
	 
	 

}
