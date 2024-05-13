package main.java.com.state;

import main.java.com.op.OP;
import main.java.com.state.mdaefsm.MDA_EFSM;

/**
 *Class to implement state 0
 *This class belongs to State Pattern
 */
public class S0 extends State {
	
	public S0(MDA_EFSM mdaEfsm, OP op) {
		super(mdaEfsm,op);
	}

    @Override
	public void start() {
        if (mdaEfsm.currentState== mdaEfsm.stateList[0]) {
        	mdaEfsm.currentState = mdaEfsm.stateList[1]; // changing state to 1
        	op.payMsg();
        }
    }
}