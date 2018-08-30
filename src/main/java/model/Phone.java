package model;

/**
 * A Phone class. It will Inherit from the Product class. It will have
 * attributes for make (Apple, Motorola, Samsung, etc), model (iPhone 6, Moto X,
 * Galaxy S5, etc), and storage space (in gigabytes). Write getters and setters
 * and Overload the print() method that's inherited from the Product class. Make
 * use of the super.print() call. 3. A TV class. It will Inherit from the
 * Product class. It will have attributes for
 * 
 * @author Ivan
 * @version 2
 *
 */

public class Phone extends Product {
	
	/**
	 * Attributes
	 */
	private String make;
	private String model;
	private int storageSpace;
	
	/**
	 * Constructor
	 */
	public Phone(String name, String description, double price, String make, String model, int storageSpace) {
		super(name, description, price);
		this.make = make;
		this.model = model;
		this.storageSpace = storageSpace;
	}
	
	/**
	 * Getters/Setters
	 */
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getStorageSpace() {
		return storageSpace;
	}

	public void setStorageSpace(int storageSpace) {
		this.storageSpace = storageSpace;
	}

	/**
	 * Method to print full Phone details
	 */
	public void print() {
		super.print();
		System.out.println("Make: " + this.make + "\nModel: " + this.model + "\nStorage: " + this.storageSpace + "GB");
	}

	@Override
	public String toString() {
		//return string of main phone attributes
		return " Make: " + make + " Model: " + model + " StorageSpace: " + storageSpace + "GB";
	}
	
	

}
