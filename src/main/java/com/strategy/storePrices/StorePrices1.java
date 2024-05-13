package main.java.com.strategy.storePrices;

import main.java.com.dataStore.DataStore;
import main.java.com.dataStore.DataStore1;

/**
 * Class to implement logic to set the initial price of the gas based on the
 * temporary values for GP1
 * This class belongs to strategy pattern
 */

public class StorePrices1 extends StorePrices {

	public StorePrices1(DataStore ds) {
		super(ds);
	}

	// Method to read the temporary variable a from the input and set the gas price
	// for gas pump 1
	@Override
	public void storePrices() {
		DataStore1 ds1 = (DataStore1) ds;
		ds1.setPrice(ds1.getTemp_a());
		System.out.println("GasPump1 is activated!");
	}
}
