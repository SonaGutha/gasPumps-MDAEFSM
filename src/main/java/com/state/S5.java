package main.java.com.state;

import main.java.com.op.OP;
import main.java.com.state.mdaefsm.MDA_EFSM;

/**
 *Class to implement state 5
 *This class belongs to State Pattern
 */

public class S5 extends State {
	public S5(MDA_EFSM mdaEfsm, OP op) {
		super(mdaEfsm,op);
	}

	@Override
	public void pump() {
		if (mdaEfsm.currentState == mdaEfsm.stateList[5]) {
			op.pumpGasUnit();
			op.gasPumpedMsg();
		}
	}

	@Override
	public void stopPump() {
		if (mdaEfsm.currentState == mdaEfsm.stateList[5]) {
			mdaEfsm.currentState = mdaEfsm.stateList[6]; //change state to 6
		}
	}
}
