package main.java.com.state;

import main.java.com.op.OP;
import main.java.com.state.mdaefsm.MDA_EFSM;

/**
 *Class to implement state 3
 *This class belongs to State Pattern
 */

public class S3 extends State {
	public S3(MDA_EFSM mdaEfsm, OP op) {
		super(mdaEfsm,op);
	}

	@Override
	public void selectGas(int g) {
		if (mdaEfsm.currentState == mdaEfsm.stateList[3]) { //change state to 3
			op.setPrice(g);
		}
	}

	@Override
	public void cancel() {
		if (mdaEfsm.currentState == mdaEfsm.stateList[3]) {
			mdaEfsm.currentState = mdaEfsm.stateList[0];//change state to 0
			op.cancelMsg();
		}
	}
	
	@Override
	public void Continue() {
		if (mdaEfsm.currentState == mdaEfsm.stateList[3]) {
			mdaEfsm.currentState = mdaEfsm.stateList[4]; //change state to 4
		}
	}
}
