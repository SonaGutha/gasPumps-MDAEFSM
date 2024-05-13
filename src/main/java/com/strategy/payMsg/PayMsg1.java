package main.java.com.strategy.payMsg;

/**
 * Class implements method to display payment for gaspump1
 * This class belongs to strategy pattern
 *
 */
public class PayMsg1 extends PayMsg {
	
	public PayMsg1() {
		super();
	}
	// Method to display pay message for gas pump 1
	@Override
	public void payMsg() {
		System.out.println("GP1: Please select payment type 1.credit or 0. cash");
	}

}
