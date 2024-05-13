package main.java.com.strategy.displayMenu;

import main.java.com.dataStore.DataStore;

/**
 * Abstract class to display a menu with a list of selections
 * This class belongs to strategy pattern
 */

public abstract class DisplayMenu {
	DataStore ds;

	public DisplayMenu(DataStore ds) {
		this.ds = ds;
	}

	public abstract void displayMenu();
}
