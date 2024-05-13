package main.java.com.state;

import main.java.com.op.OP;
import main.java.com.state.mdaefsm.MDA_EFSM;

/**
 * Class to set the initial state for the gas pumps
 * This class belongs to State Pattern
 */
 

public class Start extends State {

	public Start(MDA_EFSM mdaEfsm, OP op) {
		super(mdaEfsm,op);
	}

	//setting the prices of the gas and initial state to 0
	@Override
	public void activate() {
		op.storePrices();
		mdaEfsm.changeState(0);
	}

}
