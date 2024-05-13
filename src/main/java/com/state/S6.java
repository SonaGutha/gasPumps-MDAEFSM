package main.java.com.state;

import main.java.com.op.OP;
import main.java.com.state.mdaefsm.MDA_EFSM;

/**
 *Class to implement state 6
 *This class belongs to State Pattern
 */
public class S6 extends State {
	public S6(MDA_EFSM mdaEfsm, OP op) {
		super(mdaEfsm,op);
	}

	@Override
	public void receipt() {
		if (mdaEfsm.currentState == mdaEfsm.stateList[6]) {
			mdaEfsm.currentState = mdaEfsm.stateList[0]; //change state to 0
			op.printReceipt();
			op.returnCash();
		}
	}

	@Override
	public void noReceipt() {
		if (mdaEfsm.currentState == mdaEfsm.stateList[6]) {
			mdaEfsm.currentState = mdaEfsm.stateList[0];
			op.returnCash();
		}
	}
}
