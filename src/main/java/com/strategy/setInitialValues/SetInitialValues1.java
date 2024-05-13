package main.java.com.strategy.setInitialValues;

import main.java.com.dataStore.DataStore;
import main.java.com.dataStore.DataStore1;

/**
 * This class implements the logic to set the initial values to the gas pump 1
 * This class belongs to strategy pattern
 */

public class SetInitialValues1 extends SetInitialValues {

	public SetInitialValues1(DataStore ds) {
		super(ds);
	}

	//Method to set the initial values gor the amount of gas pumped and the total cost for Gaspump 1
	@Override
	public void setInitialValues() {
		DataStore1 ds1 = (DataStore1) ds;
		ds1.setL(0);
		ds1.setTotal(0);
		System.out.println("Gas Pumped: "+ds1.getL() +"liters");
		System.out.println("Total Cost: $"+ds1.getTotal() );
		System.out.println("Gas disposal started.");
	}

}
