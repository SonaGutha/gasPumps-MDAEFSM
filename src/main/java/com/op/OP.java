package main.java.com.op;

import main.java.com.abstractFactory.AbstractGPFactory;
import main.java.com.strategy.cancelMsg.CancelMsg;
import main.java.com.strategy.displayMenu.DisplayMenu;
import main.java.com.strategy.ejectCard.EjectCard;
import main.java.com.strategy.gasPumpedMsg.GasPumpedMsg;
import main.java.com.strategy.payMsg.PayMsg;
import main.java.com.strategy.printReceipt.PrintReceipt;
import main.java.com.strategy.pumpGasUnit.PumpGasUnit;
import main.java.com.strategy.rejectMsg.RejectMsg;
import main.java.com.strategy.returnCash.ReturnCash;
import main.java.com.strategy.setInitialValues.SetInitialValues;
import main.java.com.strategy.setPayType.SetPayType;
import main.java.com.strategy.setPrice.SetPrice;
import main.java.com.strategy.storeCash.StoreCash;
import main.java.com.strategy.storePrices.StorePrices;


/**
 * This class is the output processor for the gas pump system which contains the
 * meta actions that performs specific meta action
 */
public class OP {
	private CancelMsg cancelMsg;
	private DisplayMenu displayMenu;
	private EjectCard ejectCard;
	private GasPumpedMsg gasPumpedMsg;
	private PayMsg payMsg;
	private PrintReceipt printReceipt;
	private PumpGasUnit pumpGasUnit;
	private RejectMsg rejectMsg;
	private ReturnCash returnCash;
	private SetInitialValues setInitialValues;
	private SetPayType setPayType;
	private SetPrice setPrice;
	private StoreCash storeCash;
	private StorePrices storePrices;

	public OP(AbstractGPFactory af) {
        this.cancelMsg = af.getCancelMsg();
        this.displayMenu = af.getDisplayMenu();
        this.ejectCard=af.getEjectCard();
        this.gasPumpedMsg = af.getGasPumpedMsg();
        this.payMsg = af.getPayMsg();
        this.printReceipt = af.getPrintReceipt();
        this.pumpGasUnit = af.getPumpGasUnit();
        this.rejectMsg = af.getRejectMsg();
        this.returnCash = af.getReturnCash();
        this.setInitialValues = af.getSetInitialValues();
        this.setPayType=af.getSetPayType();
        this.setPrice = af.getSetPrice();
        this.storeCash = af.getStoreCash();
        this.storePrices= af.getStorePrices();
    }

	public void cancelMsg() {
		this.cancelMsg.cancelMsg();
	}

	public void displayMenu() {
		this.displayMenu.displayMenu();
	}
	
	public void ejectCard() {
		this.ejectCard.ejectCard();
	}

	public void gasPumpedMsg() {
		this.gasPumpedMsg.gasPumpedMsg();
	}

	public void payMsg() {
		this.payMsg.payMsg();
	}

	public void printReceipt() {
		this.printReceipt.printReceipt();
	}

	public void pumpGasUnit() {
		this.pumpGasUnit.pumpGasUnit();
	}

	public void rejectMsg() {
		this.rejectMsg.rejectMsg();
	}

	public void returnCash() {
		this.returnCash.returnCash();
	}

	public void setInitialValues() {
		this.setInitialValues.setInitialValues();
	}
	
	public void setPayType(int t) {
		this.setPayType.setPayType(t);
	}

	public void setPrice(int g) {
		this.setPrice.setPrice(g);
	}

	public void storeCash() {
		this.storeCash.storeCash();
	}

	public void storePrices() {
		this.storePrices.storePrices();
	}

}