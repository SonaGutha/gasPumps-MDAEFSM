package main.java.com.strategy.displayMenu;

import main.java.com.dataStore.DataStore;

/**
 * Class to implement logic to display menu for the gas pump 1
 * This class belongs to strategy pattern
 */

public class DisplayMenu1 extends DisplayMenu {

	public DisplayMenu1(DataStore ds) {
		super(ds);
	}

	// Method to display menu for the gas pump 1
	@Override
	public void displayMenu() {
		System.out.println("Credit Card is approved.");
	}

}
