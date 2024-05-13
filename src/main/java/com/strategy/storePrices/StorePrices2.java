package main.java.com.strategy.storePrices;

import main.java.com.dataStore.DataStore;
import main.java.com.dataStore.DataStore2;

/**
 * Class to implement logic to set the initial price of the gas based on the
 * temporary values for GP2
 * This class belongs to strategy pattern
 */

public class StorePrices2 extends StorePrices {

	public StorePrices2(DataStore ds) {
		super(ds);
	}

	// Method to read the temporary variable a,b,c from the input and set the gas price
	// for gas pump 2
	@Override
	public void storePrices() {
		DataStore2 ds2 = (DataStore2) ds;
		ds2.setRprice(ds2.getTemp_a());
		ds2.setPprice(ds2.getTemp_b());
		ds2.setDprice(ds2.getTemp_c());
		System.out.println("GasPump2 is activated!");
	}
}
