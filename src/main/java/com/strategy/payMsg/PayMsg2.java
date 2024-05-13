package main.java.com.strategy.payMsg;

/**
 * Class implements method to display payment for gaspump2
 * This class belongs to strategy pattern
 *
 */
public class PayMsg2 extends PayMsg {
	// Method to display pay message for gas pump 2
	@Override
	public void payMsg() {
		System.out.println("GP2: Please select payment type");
	}

}
