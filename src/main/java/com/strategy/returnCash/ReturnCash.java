package main.java.com.strategy.returnCash;

import main.java.com.dataStore.DataStore;

/**
 * Abstract class to return cash 
 * This class belongs to strategy pattern
 */

public abstract class ReturnCash {

	DataStore ds;

	public ReturnCash() {
	}

	public ReturnCash(DataStore ds) {
		this.ds = ds;
	}

	public abstract void returnCash();

}
