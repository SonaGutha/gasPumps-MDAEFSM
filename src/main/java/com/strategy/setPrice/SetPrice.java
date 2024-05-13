package main.java.com.strategy.setPrice;

import main.java.com.dataStore.DataStore;

/**
 * Abstract class to set the price of the gas for the gas pumps
 * This class belongs to strategy pattern
 */

public abstract class SetPrice {
	DataStore ds;
	
	public SetPrice() {
		
	}

	public SetPrice(DataStore ds) {
		this.ds = ds;
	}

	public abstract void setPrice(int g);
}
