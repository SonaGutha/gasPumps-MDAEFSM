package main.java.com.state;

import main.java.com.op.OP;
import main.java.com.state.mdaefsm.MDA_EFSM;

/**
 * StatePatten class used by all sub classes to set different states 
 * This class belongs to state pattern
 */

public class State {

	MDA_EFSM mdaEfsm;
	OP op;

	public State(MDA_EFSM mdaEfsm, OP op) {
		this.mdaEfsm = mdaEfsm;
		this.op = op;

	}

	public void activate() {
	}

	public void start() {
	}

	// credit: t=1, cash: t=0
	public void payType(int t) {
	}

	public void reject() {
	}

	public void cancel() {
	}

	public void approved() {
	}

	public void startPump() {
	}

	public void pump() {
	}

	public void stopPump() {
	}

	// Regular: g=1; Diesel: g=2; Premium: g=3
	public void selectGas(int g) {
	}

	public void receipt() {
	}

	public void noReceipt() {
	}

	public void Continue() {
	}

}
