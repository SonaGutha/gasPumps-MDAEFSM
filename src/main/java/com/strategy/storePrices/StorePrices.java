package main.java.com.strategy.storePrices;

import main.java.com.dataStore.DataStore;

/**
 * Abstract class to store the prices of the gas for the gas pumps
 * This class belongs to strategy pattern
 */
public abstract class StorePrices {
	DataStore ds;

	public StorePrices(DataStore ds) {
		this.ds = ds;
	}

	public abstract void storePrices();
}
