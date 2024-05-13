package main.java.com.strategy.rejectMsg;

/**
 * Class to implement reject message for gaspump 1 when payment type is credit
 * This class belongs to strategy pattern
 *
 */
public class RejectMsg1 extends RejectMsg {

	public RejectMsg1() {
	}

	// Method to display reject message for the gas pump 1
	@Override
	public void rejectMsg() {
		System.out.println("Credit card is not approved");

	}
}
