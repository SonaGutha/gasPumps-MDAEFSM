package main.java.com.strategy.storeCash;

import main.java.com.dataStore.DataStore;
import main.java.com.dataStore.DataStore1;

/**
 * Class implements logic to store cash for gas pump 1
 * This class belongs to strategy pattern
 */

public class StoreCash1 extends StoreCash {
	public StoreCash1(DataStore ds) {
		super(ds);
	}

	// Method to read the temporary cash value from input and store it in cash for gas pump 1
	@Override
	public void storeCash() {
		DataStore1 ds1 = (DataStore1) ds;
		ds1.setCash(ds1.getTemp_c());
		System.out.println("Cash inserted at GP1: $" + ds1.getCash());
	}
}
