package main.java.com.strategy.returnCash;

/**
 * Class for gaspump1, does nothing as return cash is not in gaspump1
 * This class belongs to strategy pattern
 */
public class ReturnCash1 extends ReturnCash {

	/**
	 * Gaspump1 does not have option to return cash. If in case it gets invoked it
	 * does nothing
	 */
	@Override
	public void returnCash() {

	}
}
