package controller;

import model.Phone;
import model.Product;
import model.TV;

/**
 * Write an OrderDetails class which has a Product and a quantity attributes.
 * Provide a Print method
 * 
 * @author Ivan
 * @version 2
 *
 */

public class OrderDetails {
	
	/**
	 * Attributes
	 */
	private Product product;
	private int quantity;
	
	/**
	 * Constructor
	 */
	public OrderDetails(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	/**
	 * Getters/Setters
	 */
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * Method to print OrderDetails based on type of product
	 */
	public void print() {
		//check to see which type of Product | create instance of type | print relevant details for order
		if(this.product instanceof Phone) {
			Phone p = (Phone)this.product;
			System.out.println(p.getName() + p + " - Order Quantity: " + this.quantity);
		} else if(this.product instanceof TV) {
			TV t = (TV)this.product;
			System.out.println(t.getName() + t + " - Order Quantity: " + this.quantity);
		}
		
	}

}
