package main.java.com.strategy.storeCash;

import main.java.com.dataStore.DataStore;

/**
 * Abstract class to store the cash for the gaspumps
 * This class belongs to strategy pattern
 */

public abstract class StoreCash {
	DataStore ds;

	public StoreCash(DataStore ds) {
		this.ds = ds;
	}
	
	public abstract void storeCash();
}
