package app;

import model.Phone;
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
		Phone p2 = new Phone("Phone", "Lightweight", 650.00, "Apple", "X", 64);
		
		TV t1 = new TV("TV","Large screen",559.00,"Toshiba",55,TVType.LED,true);
		// print Objects
		p1.print();
		p2.print();
		t1.print();
	}

}
