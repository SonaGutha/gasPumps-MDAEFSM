package main.java.com.strategy.printReceipt;

import main.java.com.dataStore.DataStore;

/**
 * Abstract class to print receipt for the gas pumps 
 * This class belongs to strategy pattern
 */

public abstract class PrintReceipt {

	DataStore ds;

	public PrintReceipt(DataStore ds) {
		this.ds = ds;
	}

	public abstract void printReceipt();
}
