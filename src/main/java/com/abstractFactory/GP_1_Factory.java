package main.java.com.abstractFactory;

import main.java.com.dataStore.DataStore;
import main.java.com.dataStore.DataStore1;
import main.java.com.strategy.cancelMsg.CancelMsg;
import main.java.com.strategy.cancelMsg.CancelMsg1;
import main.java.com.strategy.displayMenu.DisplayMenu;
import main.java.com.strategy.displayMenu.DisplayMenu1;
import main.java.com.strategy.ejectCard.EjectCard;
import main.java.com.strategy.ejectCard.EjectCard1;
import main.java.com.strategy.gasPumpedMsg.GasPumpedMsg;
import main.java.com.strategy.gasPumpedMsg.GasPumpedMsg1;
import main.java.com.strategy.payMsg.PayMsg;
import main.java.com.strategy.payMsg.PayMsg1;
import main.java.com.strategy.printReceipt.PrintReceipt;
import main.java.com.strategy.printReceipt.PrintReceipt1;
import main.java.com.strategy.pumpGasUnit.PumpGasUnit;
import main.java.com.strategy.pumpGasUnit.PumpGasUnit1;
import main.java.com.strategy.rejectMsg.RejectMsg;
import main.java.com.strategy.rejectMsg.RejectMsg1;
import main.java.com.strategy.returnCash.ReturnCash;
import main.java.com.strategy.returnCash.ReturnCash1;
import main.java.com.strategy.setInitialValues.SetInitialValues;
import main.java.com.strategy.setInitialValues.SetInitialValues1;
import main.java.com.strategy.setPayType.SetPayType;
import main.java.com.strategy.setPayType.SetPayType1;
import main.java.com.strategy.setPrice.SetPrice;
import main.java.com.strategy.setPrice.SetPrice1;
import main.java.com.strategy.storeCash.StoreCash;
import main.java.com.strategy.storeCash.StoreCash1;
import main.java.com.strategy.storePrices.StorePrices;
import main.java.com.strategy.storePrices.StorePrices1;

/**
 * Class to implement the abstract factory methods for the gas pump1
 * This class belongs to Abstract Factory Pattern
 */
public class GP_1_Factory extends AbstractGPFactory {
	private DataStore ds;

	public GP_1_Factory() {
		this.ds = new DataStore1(); // instantiating datastore with datastore1 object which passed across all
									// methods
	}

	// Method to return the constructor instantiated for datastore1
	@Override
	public DataStore getDataStore() {
		return this.ds;
	}

	// Method to return the CancelMsg class that displays cancel message for GP_1
	@Override
	public CancelMsg getCancelMsg() {
		return new CancelMsg1();
	}

	// Method to return the DisplayMenu class that displays list of menu for GP_1
	@Override
	public DisplayMenu getDisplayMenu() {
		return new DisplayMenu1(this.ds);
	}

	// Method to return the EjectCard class that ejects the card if the payment is
	// not approved completed for GP1
	@Override
	public EjectCard getEjectCard() {
		return new EjectCard1();
	}

	// Method to return the GasPumpedMsg class that displays how many units of gas
	// is pumped for for GP_1
	@Override
	public GasPumpedMsg getGasPumpedMsg() {
		return new GasPumpedMsg1(this.ds);
	}

	// Method to return the PayMsg class that displays the payment message for GP1
	@Override
	public PayMsg getPayMsg() {
		return new PayMsg1();
	}

	// Method to return the PrintReceipt class that prints the receipt for GP1
	@Override
	public PrintReceipt getPrintReceipt() {
		return new PrintReceipt1(this.ds);
	}

	// Method to return the PumpGasUnit class that prints counts the number of units
	// pumped and the total price for GP1
	@Override
	public PumpGasUnit getPumpGasUnit() {
		return new PumpGasUnit1(this.ds);
	}

	// Method to return the RejectMsg class that displays the reject message for GP1
	@Override
	public RejectMsg getRejectMsg() {
		return new RejectMsg1();
	}

	// Method to return the ReturnCash class that return the difference cash for the
	// GP1
	@Override
	public ReturnCash getReturnCash() {
		return new ReturnCash1();
	}

	// Method to return SetInitialValues class that initialized gas pump unit before
	// its pumped for gaspump1
	@Override
	public SetInitialValues getSetInitialValues() {
		return new SetInitialValues1(this.ds);
	}

	// Method to return SetPayType class that selects the payment type for gaspump1
	@Override
	public SetPayType getSetPayType() {
		return new SetPayType1(this.ds);
	}

	// Method to return SetPrice which sets the price of the gas based on the gas
	// type selected
	@Override
	public SetPrice getSetPrice() {
		return new SetPrice1();
	}

	// Method to return StoreCash class that stores the temporary input cash value
	// for gaspump1
	@Override
	public StoreCash getStoreCash() {
		return new StoreCash1(this.ds);
	}

	// Method to return StorePrices1 class that stores the temporary gas prices for gaspump1
	@Override
	public StorePrices getStorePrices() {
		return new StorePrices1(this.ds);
	}
}