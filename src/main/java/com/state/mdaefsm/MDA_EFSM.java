package main.java.com.state.mdaefsm;

import main.java.com.op.OP;
import main.java.com.state.S0;
import main.java.com.state.S1;
import main.java.com.state.S2;
import main.java.com.state.S3;
import main.java.com.state.S4;
import main.java.com.state.S5;
import main.java.com.state.S6;
import main.java.com.state.Start;
import main.java.com.state.State;

public class MDA_EFSM {

	 public State currentState;
	 public State stateList[];

	public MDA_EFSM(OP op) {
		stateList = new State[8];
		stateList[7] = new Start(this, op);
		stateList[0] = new S0(this,op);
		stateList[1] = new S1(this, op);
		stateList[2] = new S2(this, op);
		stateList[3] = new S3(this, op);
		stateList[4] = new S4(this, op);
		stateList[5] = new S5(this, op);
		stateList[6] = new S6(this, op);
		currentState=stateList[7];

	}

	public void changeState(int i) {
		currentState = stateList[i];
	}

	public void activate() {
		currentState.activate();
	}

	public void start() {
		currentState.start();
	}

	public void payType(int t) { // credit: t=1; cash: t=0
		currentState.payType(t);
	}

	public void reject() {
		currentState.reject();
	}

	public void cancel() {
		currentState.cancel();
	}

	public void approved() {
		currentState.approved();
	}

	public void startPump() {
		currentState.startPump();
	}

	public void pump() {
		currentState.pump();
	}

	public void stopPump() {
		currentState.stopPump();
	}

	public void selectGas(int g) {
		currentState.selectGas(g);
	}

	public void receipt() {
		currentState.receipt();
	}

	public void noReceipt() {
		currentState.noReceipt();
	}
	
	public void Continue() {
		currentState.Continue();
	}

}
