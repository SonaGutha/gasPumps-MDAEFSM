package main.java.com.strategy.displayMenu;

import main.java.com.dataStore.DataStore;
import main.java.com.dataStore.DataStore2;

/**
 * Class to implement logic to display menu for the gas pump 2
 * This class belongs to strategy pattern
 */

public class DisplayMenu2 extends DisplayMenu {

	public DisplayMenu2(DataStore ds) {
		super(ds);
	}

	// Method to display menu for the gas pump 1
	@Override
	public void displayMenu() {
		DataStore2 ds2 = (DataStore2) ds;
		System.out.println("Choose Gas Type:");
		System.out.println("1: Regular - $"+ds2.getRprice()+"/gallon" );
		System.out.println("2: Diesel - $"+ds2.getDprice()+"/gallon");
		System.out.println("3: Premium - $"+ ds2.getPprice()+"/gallon");
	}

}
