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
	
	public ArrayList<Product> getProductList() {
		return (ArrayList)this.productsList;
	}
	
	public void addProduct(Product p) {
		this.productsList.add(p);
	}
	
	public void removeProduct(Product p) {
		this.productsList.remove(p);
	}
	
	public Product findProduct(Product p) {
		for (Product a : this.getProductList()) {
			if (p.equals(a)) {
				return p;
			}
		}
		System.out.println("Product not in records");
		return null;
	}
}
