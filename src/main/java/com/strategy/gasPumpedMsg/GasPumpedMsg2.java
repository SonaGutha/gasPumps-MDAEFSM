package main.java.com.strategy.gasPumpedMsg;

import main.java.com.dataStore.DataStore;
import main.java.com.dataStore.DataStore2;

/**
 * Class to implement the message to display the amount of gas pumped for GP2
 * This class belongs to strategy pattern
 *
 */
public class GasPumpedMsg2 extends GasPumpedMsg {
	public GasPumpedMsg2(DataStore ds) {
		super(ds);
	}

	//Method to display the amount of gas pumped for GP1
	@Override
	public void gasPumpedMsg() {
		DataStore2 ds2=(DataStore2) ds;
		System.out.println(ds2.getG()+" Gallons of gas is pumped ");
	}

}
