package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.Order;
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
 * objects for a Customer and add the orders to that Customer object.
 * Provide a menu in your Test class which has the following options:
 *	1. Create a new phone.
 *	2. Search for a product by supplying the product id.
 *	3. Display all products in the database.
 *	4. Allow a customer to order some products by supplying the productID and
 *		quantity for each product.
 *		You will need to use your find method on the database object to return the
 *		product object for the productID that was input by the user.
 *	5. Display all the orders that a customer has made and all the OrderDetails that
 *		are in each order.
 *	6. Quit 
 * 
 * @author Ivan
 * @version 2
 *
 */

public class Test {
	
	//class Scanner
	final static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Test Products
		Phone p1 = new Phone("Phone", "HD", 230.00, "Samsung", "S7", 128);
		Phone p2 = new Phone("Phone", "Lightweight", 650.00, "Apple", "X", 128);
		Phone p3 = new Phone("Phone", "Lightweight", 750.00, "Apple", "X", 128);
		TV t1 = new TV("TV", "Large screen", 559.00, "Toshiba", 55, TVType.LED, true);
		
		//DB Object to hold list of products
		ProductDB db = new ProductDB();
		
		//add Products to ProductDB list
		db.addProduct(p1);
		db.addProduct(p2);
		db.addProduct(t1);
		db.addProduct(p3);
		
		//Customers
		Customer Mary = new Customer("Mary","2 Main St");
		Customer Derek = new Customer("Derek","7 Lotto Row");
		
		//List of Customers
		List<Customer> customers = new ArrayList<Customer>();
		
		//add Customers to List
		customers.add(Mary);
		customers.add(Derek);
		
		//Orders
		Order o = new Order();
		Order o1 = new Order();
		
		//Add Products/Quantity to Order
		o.addOrder(p2,12); // ordered 12 iphone 6 products
		o.addOrder(p1,1); //ordered 1 Galaxy s6
		o1.addOrder(p2,1); // ordered 1 iphone 5 products
		o1.addOrder(t1,5); //ordered 5 Galaxy s5 products
		
		//Add Orders to specific Customer
		Mary.addCustomerOrder(o);
		Mary.addCustomerOrder(o1);
		
		//****************************MENU***************************************************
		
		//loop control variable
		boolean exit = false;
				
		//variable for switch
		int choice = 0;
				
		do {
			// display menu to user
			displayMenu();
			// user choice from menu
			choice = in.nextInt();
			// act on user choice
			switch (choice) {
			case 1:
				// create new Phone | add to database
				Phone newPhone = createPhone();
				db.addProduct(newPhone);
				break;
			case 2:
				// Search for product by ProductID
				searchByID(db);
				break;
			case 3:
				// display all products in database
				displayAllProducts(db);
				break;
			case 4:
				// order products
				orderProduct(db, (ArrayList<Customer>)customers);
				break;
			case 5:
				// Display all orders
				displayCustomerOrders((ArrayList<Customer>) customers);
				break;
			case 6:
				// exit program
				System.out.println("Goodbye");
				exit = true;
				break;
			default:
				System.out.println("Invalid choice - pick a number between 1 - 6");
			}
		} while (!exit);

				in.close();
	}
	
	/**
	 * Display menu
	 */
	public static void displayMenu() {
		System.out.println("\n*****************MENU**********************");
		System.out.println("* Please enter a menu option:             *");
		System.out.println("* 1. Create a new phone.                  *");
		System.out.println("* 2. Search for a product by Product ID.  *");
		System.out.println("* 3. Display all products.                *");
		System.out.println("* 4. Order Products                       *");
		System.out.println("* 5. Display orders for customer          *");
		System.out.println("* 6. Quit                                 *");
		System.out.println("*******************************************");
	}
	
	/**
	 * Method to create new phone
	 * @return Phone object
	 */
	public static Phone createPhone() {
		
		//prompt for phone details
		System.out.print("Enter make: ");
		String make = in.next();
		System.out.print("Enter model: ");
		String model = in.next();
		System.out.print("Enter storage space: ");
		int storage = in.nextInt();
		System.out.print("Enter name: ");
		String name = in.next();
		System.out.print("Enter description: ");
		in.nextLine();
		String description = in.nextLine();
		System.out.print("Enter price: ");
		double price = in.nextDouble();
		
		//create new Phone 
		Phone p1 = new Phone(name,description,price,make,model,storage);
		//inform user phone created
		System.out.print("Phone created: ");
		//display new phone details
		p1.print();
		
		//return new phone
		return p1;
	}
	
	/**
	 * Method to search for a product by Product ID
	 * @param db list to search
	 * @param id id of Product to find
	 * @return Product found
	 */
	public static Product searchByID (ProductDB db) {
		
		System.out.print("Enter Product ID: ");
		int id = in.nextInt();
		Product p = db.findProductByID(id);
		String result =  (p != null)? "Product found" : "Product not found";
		System.out.println(result);
		return p;
	}
	
	/**
	 * Method to display all Products in list
	 * @param db List to display
	 */
	public static void displayAllProducts(ProductDB db) {
		for(Product p : db.getProductList()) { 
			p.print(); 
		}
	}
	
	/**
	 * Helper method to verify valid Customer
	 * @param customers List of Customers
	 * @param name name of Customer
	 * @return Customer object
	 */
	private static Customer validCustomer(ArrayList<Customer> customers, String name) {
		for(Customer c : customers) { 
			if(c.getName().equalsIgnoreCase(name)) {
				return c;
			}
		}
		return null;
	}
	
	/**
	 * Method to display orders for specific Customer
	 * @param customers List of Customers
	 */
	public static void displayCustomerOrders(ArrayList<Customer> customers) {
		in.nextLine();
		System.out.print("Enter customer name: ");
		String name = in.nextLine();
		//ensure customer exists
		Customer foundCustomer = validCustomer(customers,name);
		if(foundCustomer == null) {
			System.out.println("Customer not found in database");
		} else {
			foundCustomer.printCustomerOrders();
		}
		
	}
	
	/**
	 * Method to allow Customer order Products
	 * @param db	List of available Products
	 * @param customers List of current Customers
	 */
	public static void orderProduct(ProductDB db, ArrayList<Customer> customers) {
		
		// prompt for name, product ID and quantity
		System.out.print("Enter Customer name:");
		String customerName = in.next();
		// ensure customer exists
			Customer foundCustomer = validCustomer(customers, customerName);
			if (foundCustomer == null) {
				System.out.println("Customer not found in database");
			} else {
				
				System.out.print("Enter product ID: ");
				int id = in.nextInt();
				// search for product
				Product foundIt = db.findProductByID(id);
				// inform user if product not in database
				if (foundIt == null) {
				System.out.println("Product not in database");
			} else {
				System.out.print("Enter amount: ");
				int amount = in.nextInt();
				// create new Order object
				Order newOrder = new Order();
				// add Order
				newOrder.addOrder(foundIt, amount);
				
				foundCustomer.addCustomerOrder(newOrder);
				System.out.print(customerName + " Ordered: ");
				newOrder.printOrders();

			}
				
		}
	}
}
