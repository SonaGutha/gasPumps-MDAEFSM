package main.java.com.state;

import main.java.com.op.OP;
import main.java.com.state.mdaefsm.MDA_EFSM;

/**
 *Class to implement state 2
 *This class belongs to State Pattern
 */

public class S2 extends State {
	public S2(MDA_EFSM mdaEfsm, OP op) {
		super(mdaEfsm,op);
	}

	@Override
	public void approved() {
		if (mdaEfsm.currentState == mdaEfsm.stateList[2]) {
			mdaEfsm.currentState = mdaEfsm.stateList[3]; // transitioning from state 2 to state 3
			op.setPayType(1);
			op.displayMenu();
			op.ejectCard();

		}
	}
	
	@Override
	public void reject() {
		if (mdaEfsm.currentState == mdaEfsm.stateList[2]) {
			mdaEfsm.currentState = mdaEfsm.stateList[0];// transitioning from state 2 to state 0
			op.rejectMsg();
			op.ejectCard();
		}
	}
}
