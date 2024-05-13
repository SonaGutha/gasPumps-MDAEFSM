package main.java.com.strategy.setInitialValues;

import main.java.com.dataStore.DataStore;

/**
 * Abstract class to set the initial values of the gas pumped for gas pumps
 * This class belongs to strategy pattern
 */

public abstract class SetInitialValues {

	DataStore ds;

	public SetInitialValues(DataStore ds) {
		this.ds = ds;
	}

	public abstract void setInitialValues();

}
