package main.java.com.strategy.storeCash;

import main.java.com.dataStore.DataStore;
import main.java.com.dataStore.DataStore2;

/**
 * Class implements logic to store cash for gas pump 2
 * This class belongs to strategy pattern
 */
public class StoreCash2 extends StoreCash {
	public StoreCash2(DataStore ds) {
		super(ds);
	}

	// Method to read the temporary cash value from input and store it in cash for gas pump 2
	@Override
	public void storeCash() {
		DataStore2 ds2 = (DataStore2) ds;
		ds2.setCash(ds2.getTemp_cash());
		System.out.println("Cash inserted at GP2: $" + ds2.getCash());
	}
}
