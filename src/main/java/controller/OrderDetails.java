package controller;

import model.Product;

/**
 * Write an OrderDetails class which has a Product and a quantity attributes.
 * Provide a Print method
 * 
 * @author Ivan
 * @version 2
 *
 */

public class OrderDetails {
	
	private Product product;
	private int quantity;
	
	public void print() {
		this.product.print();
		System.out.println(this.quantity);
	}

}
