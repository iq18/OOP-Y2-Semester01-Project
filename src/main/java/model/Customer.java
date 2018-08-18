package model;

import java.util.ArrayList;
import java.util.List;

import controller.Order;

/**
 * Write a Customer class that has attributes name, address. A Customer object
 * also has an ArrayList of Order objects.
 * 
 * @author Ivan
 * @version 2
 *
 */

public class Customer {

	private String name;
	private String address;
	private List<Order> customerOrders;
	
	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
		this.customerOrders = new ArrayList<Order>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<Order> getCustomerOrders() {
		return (ArrayList<Order>)customerOrders;
	}
	
	
	
	
}
