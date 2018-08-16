package app;

import controller.ProductDB;
import model.Phone;
import model.Product;
import model.TV;
import model.TVType;


/**
 * Write a Test class that instantiates a number of phones and TVs and sets
 * their attributes. Create some Customer objects. Create a ProductDB object
 * called database. Add all your products to the object. Create some Order
 * objects for a Customer and add the orders to that Customer object. See
 * 
 * @author Ivan
 * @version 2
 *
 */

public class Test {

	public static void main(String[] args) {

		// Test Objects
		Phone p1 = new Phone("Phone", "HD", 230.00, "Samsung", "S7", 128);
		Phone p2 = new Phone("Phone", "Lightweight", 650.00, "Apple", "X", 128);
		Phone p3 = new Phone("Phone", "Lightweight", 750.00, "Apple", "X", 128);

		TV t1 = new TV("TV", "Large screen", 559.00, "Toshiba", 55, TVType.LED, true);
		
		// print Objects
		p1.print();
		p2.print();
		t1.print();

		//DB Object to hold list of products
		ProductDB db = new ProductDB();
		
		//Test functionality
		db.addProduct(p1);
		db.addProduct(p2);
		db.addProduct(t1);
		db.addProduct(p3);

		db.removeProduct(p2);
		Product a = db.findProduct(p2);
		if(a != null) {
			System.out.println("Product found");
		}
		
		
		
		/*
		 * for(Product p : db.getProductList()) { System.out.println(p.getName() + " " +
		 * p.getProductID()); }
		 */
		
	}

}
