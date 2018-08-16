package controller;

import java.util.ArrayList;
import java.util.List;

import model.Product;

/**
 * Write a ProductDB class which manages an ArrayList of Products. The class
 * provides methods to add, remove and find a product.
 * 
 * @author Ivan
 * @version 2
 *
 */

public class ProductDB {
	
	private List<Product> productsList;
	
	public ProductDB() {
		this.productsList = new ArrayList<Product>();
		System.out.println("DB made");
	}
	
	/**
	 * Getter to access list of Products
	 * @return
	 */
	public ArrayList<Product> getProductList() {
		return (ArrayList<Product>)this.productsList;
	}
	
	/**
	 * Method to add a Product to List
	 * @param p Product to add
	 */
	public void addProduct(Product p) {
		// use find method to avoid adding duplicate products
		if (findProduct(p) == null) {
			this.productsList.add(p);
		} else {
			System.out.println("Product already exists");
		}
	}
	
	/**
	 * Method to remove a Product
	 * @param p Product to remove
	 */
	public void removeProduct(Product p) {
		
		if (findProduct(p) == null) {
			System.out.println("Product doesn't exist");
		} else {
			this.productsList.remove(p);
		}
		
	}
	
	/**
	 * Method to find a Product
	 * @param p Product to find
	 * @return found Product/null
	 */
	public Product findProduct(Product p) {
		//iterate over List comparing Objects | return found Product
		for (Product a : this.getProductList()) {
			if (p.equals(a)) {
				return p;
			}
		}
		//null if Product not found
		return null;
	}
}
