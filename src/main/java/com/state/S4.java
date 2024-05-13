package main.java.com.state;

import main.java.com.op.OP;
import main.java.com.state.mdaefsm.MDA_EFSM;

/**
 *Class to implement state 4
 *This class belongs to State Pattern
 */

public class S4 extends State {

	public S4(MDA_EFSM mdaEfsm, OP op) {
		super(mdaEfsm,op);	}

	@Override
	public void startPump() {
		if (mdaEfsm.currentState == mdaEfsm.stateList[4]) {
			mdaEfsm.currentState = mdaEfsm.stateList[5]; //change state to 5
			op.setInitialValues();
		}
	}

}
