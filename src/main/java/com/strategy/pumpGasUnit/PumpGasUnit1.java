package main.java.com.strategy.pumpGasUnit;

import main.java.com.dataStore.DataStore;
import main.java.com.dataStore.DataStore1;

/**
 * Class implements the logic to pump liters of gas for gaspump1
 * This class belongs to strategy pattern
 *
 */

public class PumpGasUnit1 extends PumpGasUnit {

	public PumpGasUnit1(DataStore ds) {
		super(ds);
	}

	@Override
	public void pumpGasUnit() {
		DataStore1 ds1 = (DataStore1) ds;
		ds1.setL(ds1.getL() + 1); // incrementing the amount of gas pumped
		ds1.setTotal(ds1.getPrice() * ds1.getL()); // calculating the price for the amount of gas pumped

	}

}
