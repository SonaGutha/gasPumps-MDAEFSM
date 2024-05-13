package main.java.com.strategy.cancelMsg;

/**
 * Class to display cancellation message for Gaspump 2
 * This class belongs to strategy pattern
 */

public class CancelMsg2 extends CancelMsg{
	/**
	 * Prints cancellation message for the Gaspump 2
	 */
	public void cancelMsg() {
        System.out.println("Gas pump 2 transaction is cancelled");
    }
}
