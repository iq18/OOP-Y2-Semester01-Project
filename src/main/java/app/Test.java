package app;

import model.Phone;


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
		 Phone p1 = new Phone("Samsung","HD",230.00,"Samsung","S7",128);
		 
		 p1.print();
	}

}
