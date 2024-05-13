package main.java.com.gasPump;

import main.java.com.abstractFactory.AbstractGPFactory;
import main.java.com.dataStore.DataStore;
import main.java.com.dataStore.DataStore1;
import main.java.com.state.mdaefsm.MDA_EFSM;

/**
 * Class to process input for gaspump1
 */
public class GP_1 {

	private MDA_EFSM mdaEfsm;
	private DataStore d;
	AbstractGPFactory af;

	public GP_1(MDA_EFSM mdaEfsm, DataStore d, AbstractGPFactory af) {
		this.mdaEfsm = mdaEfsm;
		this.d = d;
		this.af = af;

	}

	public void Activate(int a) {
		if (a > 0) {
			DataStore1 ds1 = (DataStore1) this.d;
			ds1.setTemp_a(a);
			mdaEfsm.activate();
		} else {
			System.out.println("GP1 failed to activate!");
			System.out.println("Amount is invalid. Price should be greater than 0");
		}
	}

	public void Start() {
		mdaEfsm.start();
	}

	public void PayCash(int c) {
		if (c > 0) {
			DataStore1 ds1 = (DataStore1) this.d;
			ds1.setTemp_c(c);
			mdaEfsm.payType(0);
		} else {

			System.out.println("Amount is invalid. Price should be greater than 0");

		}

	}

	public void PayCredit() {
		mdaEfsm.payType(1);
		System.out.println("Verifying credit card for authentication");
	}

	public void Reject() {
		mdaEfsm.reject();
	}

	public void Approved() {
		DataStore1 ds1 = (DataStore1) this.d;
		ds1.setW(1);
		mdaEfsm.approved();
	}

	public void Cancel() {
		mdaEfsm.cancel();
	}

	public void StartPump() {
		mdaEfsm.Continue();
		mdaEfsm.startPump();	
	}

	public void Pump() {
		DataStore1 ds1 = (DataStore1) this.d;
		if (ds1.getW() == 1) {
			mdaEfsm.pump();
		} else if (ds1.getCash() < (ds1.getPrice() * (ds1.getL() + 1))) {
			mdaEfsm.stopPump();
			mdaEfsm.receipt();

		} else {
			mdaEfsm.pump();
		}
	}

	public void StopPump() {
		mdaEfsm.stopPump();
		mdaEfsm.receipt();
		
	}
}