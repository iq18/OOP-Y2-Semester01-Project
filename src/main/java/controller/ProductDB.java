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
		productsList = new ArrayList<Product>();
	}
}
