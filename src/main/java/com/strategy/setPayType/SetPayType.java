package main.java.com.strategy.setPayType;

import main.java.com.dataStore.DataStore;

/**
 * Abstract class to set the type of payment for the gas pump
 * This class belongs to strategy pattern
 */
public abstract class SetPayType {

	DataStore ds;

	public SetPayType() {

	}

	public SetPayType(DataStore ds) {
		this.ds = ds;
	}

	public abstract void setPayType(int t); 
}
