package com.comvivaapp;

import java.util.ArrayList;
import java.util.List;

import com.comvivaapp.model.Customer;
import com.opensymphony.xwork2.ModelDriven;

public class RegisterAction implements 
							ModelDriven<Customer>{
	
		public Customer getModel(){
			return customer;
		}
		
		private Customer customer  = new Customer();		
		public Customer getCustomer() {
			return customer;
		}
		public void setCustomer(Customer customer) {
			this.customer = customer;
		}

		public String execute(){
			return "success";
		}		
		public String performRegister(){			
			System.out.println(customer.getUserName());
			System.out.println(customer.getPassword());
			System.out.println(customer.getGender());
			System.out.println(customer.getAddress());
			System.out.println(customer.getCountry());			
			System.out.println(customer.getHobbies());
			System.out.println(customer.isFlag());			
			return "success";
		}
}
