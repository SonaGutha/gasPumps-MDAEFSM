package main.java.com.strategy.pumpGasUnit;

import main.java.com.dataStore.DataStore;
import main.java.com.dataStore.DataStore2;

/**
 * Class implements the logic to pump gallons of gas for gaspump2
 * This class belongs to strategy pattern
 *
 */

public class PumpGasUnit2 extends PumpGasUnit {

	public PumpGasUnit2(DataStore ds) {
		super(ds);
	}

	@Override
	public void pumpGasUnit() {
		DataStore2 ds2 = (DataStore2) ds;
		ds2.setG(ds2.getG() + 1); // incrementing the amount of gas pumped
		ds2.setTotal(ds2.getPrice() * ds2.getG()); // calculating the price for the amount of gas pumped

	}

}
