package main.java.com.strategy.rejectMsg;

/**
 * Class to implement reject message, for gaspump 2 it is not applicable
 * This class belongs to strategy pattern
 *
 */
public class RejectMsg2 extends RejectMsg {

	public RejectMsg2() {
	}

	// Method to display reject message, it is not applicable for gas pump 2.If it
	// is invoked it does nothing
	@Override
	public void rejectMsg() {
		// do nothing

	}
}
