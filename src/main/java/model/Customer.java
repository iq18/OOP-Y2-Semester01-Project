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
	
	public void addOrder() {
		
	}
	
	public void printCustomerOrders(Customer c) {

		System.out.println("\nOrders for " + c.getName() + "\n---------------------");

		ArrayList<Order> cOrders = c.getCustomerOrders();
		if (c.getCustomerOrders().isEmpty()) {
			System.out.println("\nNo Orders for " + c.getName());
		} else {
			for (Order o : cOrders) {
				System.out.println(o);
			}
		}
	}
	
	
	
	
}
