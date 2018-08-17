package model;

/**
 * A TV class. It will Inherit from the Product class. It will have attributes
 * for make, screen size, type (LCD, LED, Plasma) and whether or not it is 3D
 * capable. Write getters and setters and overload the print() method.
 * 
 * @author Ivan
 * @version 2
 */

public class TV extends Product {
	
	/**
	 * Attributes
	 */
	private String make;
	private int screenSize;
	private TVType type;
	private boolean threeD;
	
	/**
	 * Constructor
	 */
	public TV(String name, String description, double price, String make, int screenSize, TVType type, boolean threeD) {
		super(name, description, price);
		this.make = make;
		this.screenSize = screenSize;
		this.type = type;
		this.threeD = threeD;
	}
	
	/**
	 * Getter/Setters
	 */
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	public TVType getType() {
		return type;
	}

	public void setType(TVType type) {
		this.type = type;
	}

	public boolean isThreeD() {
		return threeD;
	}

	public void setThreeD(boolean threeD) {
		this.threeD = threeD;
	}
	
	/**
	 * Method to print full TV details
	 */
	public void print() {
		//assign yes/No value for TV 3D capability
		String isThreeD = (threeD)? "Yes" : "No";
		super.print();
		System.out.println("Make: " + make + "\nScreenSize: " + screenSize + "\nType: " + type + "\n3D: " + isThreeD);
	}

	@Override
	public String toString() {
		return " Make: " + make + " ScreenSize: " + screenSize + " inch";
	}
	
	

}
