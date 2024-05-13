package main.java.com.strategy.setPayType;

import main.java.com.dataStore.DataStore;

/**
 * Class to implement logic to set the payment type, not applicable for the gas
 * pump 2
 * This class belongs to strategy pattern
 */

public class SetPayType2 extends SetPayType {

	public SetPayType2(DataStore ds) {
		super(ds);

	}

	// Method to set the payment type, not applicable for gas pump 2. If it is invoked, does nothing 
	@Override
	public void setPayType(int t) {
		
		// do nothing

	}

}
