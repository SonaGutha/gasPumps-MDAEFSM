package main.java.com.strategy.setPrice;

/**
 * Class to implement the logic to set price, this is not applicable to gas
 * pump1 as there is only 1 type of gas
 * This class belongs to strategy pattern
 */

public class SetPrice1 extends SetPrice {

	// There is no flow to set price based on gas type for the gas pump1. Even if it
	// is invoked it does nothing
	@Override
	public void setPrice(int g) {

	}
}
