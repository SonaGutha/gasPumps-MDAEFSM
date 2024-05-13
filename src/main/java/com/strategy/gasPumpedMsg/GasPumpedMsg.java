package main.java.com.strategy.gasPumpedMsg;

import main.java.com.dataStore.DataStore;

/**
 * Abstract class to display gas pumped message
 * This class belongs to strategy pattern
 *
 */

public abstract class GasPumpedMsg {

	DataStore ds;

	public GasPumpedMsg(DataStore ds) {
		this.ds = ds;
	}

	public abstract void gasPumpedMsg();
}
