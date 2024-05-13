package main.java.com.strategy.gasPumpedMsg;

import main.java.com.dataStore.DataStore;
import main.java.com.dataStore.DataStore1;

/**
 * Class to implement the message to display the amount of gas pumped for GP1
 * This class belongs to strategy pattern
 *
 */
public class GasPumpedMsg1 extends GasPumpedMsg {
	public GasPumpedMsg1(DataStore ds) {
		super(ds);
	}

	//Method to display the amount of gas pumped for GP1
	@Override
	public void gasPumpedMsg() {
		DataStore1 ds1=(DataStore1) ds;
		System.out.println(ds1.getL()+" Liters of gas is pumped ");
	}

}
