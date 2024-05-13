package main.java.com.gasPump;

import main.java.com.abstractFactory.AbstractGPFactory;
import main.java.com.dataStore.DataStore;
import main.java.com.dataStore.DataStore2;
import main.java.com.state.mdaefsm.MDA_EFSM;

/**
 * Class to process input for gaspump2
 */
public class GP_2 {

	private MDA_EFSM mdaEfsm;
	private DataStore d;
	AbstractGPFactory af;

	public GP_2(MDA_EFSM mdaEfsm, DataStore d, AbstractGPFactory af) {
		this.mdaEfsm = mdaEfsm;
		this.d = d;
		this.af = af;
	}

	public void Activate(float a, float b, float c) {
		if (a > 0 && b > 0 && c > 0) {
			DataStore2 ds2 = (DataStore2) this.d;
			ds2.setTemp_a(a);
			ds2.setTemp_b(b);
			ds2.setTemp_c(c);
			mdaEfsm.activate();
		} else {
			System.out.println("GP1 failed to activate!");
			System.out.println("Amount is invalid. Price should be greater than 0");
		}
	}

	public void PayCash(int c) {
		if (c > 0) {
			DataStore2 ds2 = (DataStore2) this.d;
			ds2.setTemp_cash(c);
			mdaEfsm.payType(0);
		} else {

			System.out.println("Amount is invalid. Price should be greater than 0");

		}

	}

	public void Start() {
		mdaEfsm.start();
	}

	public void Diesel() {
		mdaEfsm.selectGas(2);
		mdaEfsm.Continue();
	}

	public void Premium() {
		mdaEfsm.selectGas(3);
		mdaEfsm.Continue();
	}

	public void Regular() {
		mdaEfsm.selectGas(1);
		mdaEfsm.Continue();
	}

	public void StartPump() {
		mdaEfsm.startPump();
		mdaEfsm.Continue();
	}

	public void PumpGallon() {
		DataStore2 ds2 = (DataStore2) this.d;
		if (ds2.getCash() < (ds2.getPrice() * (ds2.getG() + 1))) {
			mdaEfsm.stopPump();
		} else {

			mdaEfsm.pump();
		}
	}

	public void Stop() {
		mdaEfsm.stopPump();
	}

	public void Receipt() {
		mdaEfsm.receipt();
	}

	public void NoReceipt() {
		mdaEfsm.noReceipt();
	}
}