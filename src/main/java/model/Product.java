package model;

/**
 * A Product class. This will be a generic class for Products that a company may
 * sell. It will have attributes for the following: name, description, price and
 * productID. Use appropriate data types. Write getters and setters for all
 * attributes. Write a method called print() that prints the Product information
 * to the screen. A unique productID is assigned to the product when it is
 * created
 * 
 * @author Ivan
 * @version 2
 */

public abstract class Product {
	
	/**
	 * Fields
	 */
	private String name;
	private String description;
	private double price;
	private int productID;
	private static int counter = 0;
	
	/**
	 * Constructor
	 */
	public Product(String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.productID = ++counter;
	}
	
	/**
	 * Getters/Setters
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getProductID() {
		return productID;
	}
	
	/**
	 * Method to print Product details
	 */
	public void print() {
		System.out.println("\nID: " + this.productID + "\nName: " + this.name + "\nDescription: " + this.description + "\nPrice " + this.price);
	}

}
