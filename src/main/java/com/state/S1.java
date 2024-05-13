package main.java.com.state;

import main.java.com.op.OP;
import main.java.com.state.mdaefsm.MDA_EFSM;

/**
 *Class to implement state 1
 *This class belongs to State Pattern
 */	

public class S1 extends State {
	public S1(MDA_EFSM mdaEfsm, OP op) {
		super(mdaEfsm,op);
	}

	public void payType(int t) {
		if (mdaEfsm.currentState == mdaEfsm.stateList[1]) {
			if (t == 1) {
				mdaEfsm.changeState(2); // changing state to 2
				op.setPayType(1);
			} else if (t == 0) {
				op.storeCash();
				op.setPayType(0);
				mdaEfsm.changeState(3);// changing state to 3
			}
		}
	}
}
