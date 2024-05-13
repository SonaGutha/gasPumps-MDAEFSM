package main.java.com.strategy.returnCash;

import main.java.com.dataStore.DataStore;
import main.java.com.dataStore.DataStore2;

/**
 * Class for gaspump2 to implement return cash logic
 * This class belongs to strategy pattern
 */

public class ReturnCash2 extends ReturnCash {
	public ReturnCash2(DataStore ds) {
		super(ds);
	}

	/**
	 * Method to calculate the amount of cash that needs to be returned for GP2
	 */
	@Override
	public void returnCash() {
		DataStore2 ds2 = (DataStore2) ds;
		float returnAmt = ds2.getCash() - ds2.getTotal();
		if (returnAmt > 0) {
			System.out.println("Amount to return: $" + returnAmt);
			System.out.println("Returning Cash $" + returnAmt);
		} else {
			System.out.println("No amount to return");
		}
		ds2.setCash(0); // reset the cash to 0 after amount is returned
		System.out.println("GP2 transaction is completed");
	}

}
