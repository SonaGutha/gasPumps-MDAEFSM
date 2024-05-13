package main.java.com.strategy.setPayType;

import main.java.com.dataStore.DataStore;

/**
 * Class to implement logic to set the payment type for the gas pump 1
 * This class belongs to strategy pattern
 */

public class SetPayType1 extends SetPayType {

	public SetPayType1(DataStore ds) {
		super(ds);

	}

	//Method to set the payment type for the gaspump 1
	@Override
	public void setPayType(int t) {
		if (t == 1) {
			System.out.println("Payment Type Selected: Credit");
		}
		if (t == 0) {
			System.out.println("Payment Type Selected: Cash");
		}

	}

}
