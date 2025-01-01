package com.haroon.BatchExample.Config;

import org.springframework.batch.item.ItemProcessor;

import com.haroon.BatchExample.model.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

	@Override
	public Customer process(Customer item) throws Exception {
		
		//logic
		
		//Example
		/*
		 * if(country==india) { 
		 * 	return null; 
		 * }
		 */
		
		return item;
	}

}
