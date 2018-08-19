package controller;

import java.util.ArrayList;
import java.util.List;

import model.Product;

/**
 * Write an Order class which manages an ArrayList of OrderDetails objects.
 * Provide a Print method. Provide an add method which takes a product object
 * and a quantity. The add method creates an OrderDetails object and adds it to
 * the ArrayList.
 * 
 * @author Ivan
 * @version 2
 */

public class Order {
	
	private List<OrderDetails> orders;
	
	public Order() {
		this.orders = new ArrayList<OrderDetails>();
	}

	public ArrayList<OrderDetails> getOrders() {
		return (ArrayList<OrderDetails>)this.orders;
	}
	
	public void addOrder(Product p, int quantity) {
		this.orders.add(new OrderDetails(p,quantity));
	}
	public void printOrders() {
		//iterate through order - print order details objects
		//use printOrderDetail
		for(OrderDetails od : orders) {
			od.printOrderDetail();
		}
	}
	
	

}
