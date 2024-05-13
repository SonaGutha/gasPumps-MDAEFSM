package main.java.com.strategy.setPrice;

import main.java.com.dataStore.DataStore;
import main.java.com.dataStore.DataStore2;

/**
 * Class to implement the logic to set price based on the type of gas for the
 * gas pump 2
 * This class belongs to strategy pattern
 */

public class SetPrice2 extends SetPrice {
	public SetPrice2(DataStore ds) {
		super(ds);
	}

	//Method to set price of the gas based in the type selected for the gaspump2
	@Override
	public void setPrice(int g) {
		DataStore2 ds2 = (DataStore2) ds;
		if (g == 1) { // Regular is selected
			System.out.println("GasType : Regular");
			ds2.setPrice(ds2.getRprice());
		} else if (g == 2) { // Diesel is selected
			System.out.println("GasType : Diesel");
			ds2.setPrice(ds2.getDprice());
		} else if (g == 3) { // Premium is selected
			System.out.println("GasType : Premium");
			ds2.setPrice(ds2.getPprice());
		}
		System.out.println(" Price for the selected gas is $" + ds2.getPprice() + "/gallon");
	}
}
