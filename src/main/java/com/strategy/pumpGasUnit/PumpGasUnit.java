package main.java.com.strategy.pumpGasUnit;

import main.java.com.dataStore.DataStore;

/**
 * Abstract class for pump gas unit
 * This class belongs to strategy pattern
 *
 */

public abstract class PumpGasUnit {
	DataStore ds;

	public PumpGasUnit(DataStore ds) {
		this.ds = ds;
	}

	public abstract void pumpGasUnit();

}
