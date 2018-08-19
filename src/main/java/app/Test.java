package app;

import controller.Order;
import controller.OrderDetails;
import controller.ProductDB;
import model.Customer;
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
		/*p1.print();
		p2.print();
		t1.print();
*/
		//DB Object to hold list of products
		ProductDB db = new ProductDB();
		
		//Test functionality
		//add Products to ProductDB list
		db.addProduct(p1);
		db.addProduct(p2);
		db.addProduct(t1);
		db.addProduct(p3);
		//remove product
		db.removeProduct(p2);
		//find Product
		/*Product a = db.findProduct(p2);
		//inform user product found or not
		String result =  (a != null)? "Product found" : "Product not found";
		System.out.println(result);
		//attempt to remove Product not in List
		db.removeProduct(p2);
		//display all products
		for(Product p : db.getProductList()) { 
			p.print(); 
		}
		*/
		OrderDetails od1 = new OrderDetails(p1,5);
		OrderDetails od2 = new OrderDetails(t1,7);
		
		/*od1.print();
		od2.print();*/
		
		//============================================================================
		
		Customer Mary = new Customer("Mary","2 Main St");
		Customer Derek = new Customer("Derek","7 Lotto Row");
		Order o = new Order();
		o.addOrder(p2,12); // ordered 12 iphone 6 products
		o.addOrder(p1,1); //ordered 1 Galaxy s6
		Mary.addCustomerOrder(o);
		Order o1 = new Order();
		o1.addOrder(p2,1); // ordered 1 iphone 5 products
		o1.addOrder(t1,5); //ordered 5 Galaxy s5 products
		Mary.addCustomerOrder(o1);
		
		Mary.printCustomerOrders();
		Derek.printCustomerOrders();
		 
		
	}

}
