package main.java.com.strategy.setInitialValues;

import main.java.com.dataStore.DataStore;
import main.java.com.dataStore.DataStore2;

/**
 * This class implements the logic to set the initial values to the gas pump 2
 * This class belongs to strategy pattern
 */

public class SetInitialValues2 extends SetInitialValues {

	public SetInitialValues2(DataStore ds) {
		super(ds);
	}

	//Method to set the initial values gor the amount of gas pumped and the total cost for Gaspump 2
	@Override
	public void setInitialValues() {
		DataStore2 ds2 = (DataStore2) ds;
		ds2.setG(0);
		ds2.setTotal(0);
		System.out.println("Gas Pumped: "+ds2.getG() +"gallons");
		System.out.println("Total Cost: $"+ds2.getTotal() );
		System.out.println("Gas disposal started.");
	}

}
