package main.java.com.strategy.cancelMsg;

/**
 * Class to display cancellation message for Gaspump 1
 * This class belongs to strategy pattern
 */

public class CancelMsg1 extends CancelMsg{
	/**
	 * Prints cancellation message for the Gaspump 1
	 */
	public void cancelMsg() {
        System.out.println("Gas pump 1 transaction is cancelled");
    }
}
