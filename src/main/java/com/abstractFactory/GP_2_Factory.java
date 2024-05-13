package main.java.com.abstractFactory;

import main.java.com.dataStore.DataStore;
import main.java.com.dataStore.DataStore2;
import main.java.com.strategy.cancelMsg.CancelMsg;
import main.java.com.strategy.cancelMsg.CancelMsg2;
import main.java.com.strategy.displayMenu.DisplayMenu;
import main.java.com.strategy.displayMenu.DisplayMenu2;
import main.java.com.strategy.ejectCard.EjectCard;
import main.java.com.strategy.ejectCard.EjectCard2;
import main.java.com.strategy.gasPumpedMsg.GasPumpedMsg;
import main.java.com.strategy.gasPumpedMsg.GasPumpedMsg2;
import main.java.com.strategy.payMsg.PayMsg;
import main.java.com.strategy.payMsg.PayMsg2;
import main.java.com.strategy.printReceipt.PrintReceipt;
import main.java.com.strategy.printReceipt.PrintReceipt2;
import main.java.com.strategy.pumpGasUnit.PumpGasUnit;
import main.java.com.strategy.pumpGasUnit.PumpGasUnit2;
import main.java.com.strategy.rejectMsg.RejectMsg;
import main.java.com.strategy.rejectMsg.RejectMsg2;
import main.java.com.strategy.returnCash.ReturnCash;
import main.java.com.strategy.returnCash.ReturnCash2;
import main.java.com.strategy.setInitialValues.SetInitialValues;
import main.java.com.strategy.setInitialValues.SetInitialValues2;
import main.java.com.strategy.setPayType.SetPayType;
import main.java.com.strategy.setPayType.SetPayType2;
import main.java.com.strategy.setPrice.SetPrice;
import main.java.com.strategy.setPrice.SetPrice2;
import main.java.com.strategy.storeCash.StoreCash;
import main.java.com.strategy.storeCash.StoreCash2;
import main.java.com.strategy.storePrices.StorePrices;
import main.java.com.strategy.storePrices.StorePrices2;

/**
 * Class to implement the abstract factory methods for the gas pump2
 * This class belongs to Abstract Factory Pattern
 */
public class GP_2_Factory extends AbstractGPFactory {
	private DataStore ds;

	public GP_2_Factory() {
		this.ds = new DataStore2(); // instantiating data store with datastore1 object which passed across all
									// methods
	}

	// Method to return the constructor instantiated for datastore2
	@Override
	public DataStore getDataStore() {
		return this.ds;
	}

	// Method to return the CancelMsg class that displays cancel message for GP_2
	@Override
	public CancelMsg getCancelMsg() {
		return new CancelMsg2();
	}

	// Method to return the DisplayMenu class that displays list of menu for GP_2
	@Override
	public DisplayMenu getDisplayMenu() {
		return new DisplayMenu2(this.ds);
	}

	// Method to return the EjectCard class that ejects the card if the payment is
	// not approved completed for GP_2
	@Override
	public EjectCard getEjectCard() {
		return new EjectCard2();
	}

	// Method to return the GasPumpedMsg class that displays how many units of gas
	// is pumped for for GP_2
	@Override
	public GasPumpedMsg getGasPumpedMsg() {
		return new GasPumpedMsg2(this.ds);
	}

	// Method to return the PayMsg class that displays the payment message for GP2
	@Override
	public PayMsg getPayMsg() {
		return new PayMsg2();
	}

	// Method to return the PrintReceipt class that prints the receipt for GP2
	@Override
	public PrintReceipt getPrintReceipt() {
		return new PrintReceipt2(this.ds);
	}

	// Method to return the PumpGasUnit class that prints counts the number of units
	// pumped and the total price for GP2
	@Override
	public PumpGasUnit getPumpGasUnit() {
		return new PumpGasUnit2(this.ds);
	}

	// Method to return the RejectMsg class that displays the reject message for GP2
	@Override
	public RejectMsg getRejectMsg() {
		return new RejectMsg2();
	}

	// Method to return the ReturnCash class that return the difference cash for the
	// GP2
	@Override
	public ReturnCash getReturnCash() {
		return new ReturnCash2(this.ds);
	}

	// Method to return SetInitialValues class that initialized gas pump unit before
	// its pumped for gaspump2
	@Override
	public SetInitialValues getSetInitialValues() {
		return new SetInitialValues2(this.ds);
	}

	// Method to return SetPayType class that selects the payment type for gaspump2
	@Override
	public SetPayType getSetPayType() {
		return new SetPayType2(this.ds);
	}

	// Method to return SetPrice which sets the price of the gas based on the gas
	// type selected
	@Override
	public SetPrice getSetPrice() {
		return new SetPrice2(this.ds);
	}

	// Method to return StoreCash class that stores the temporary input cash value
	// for gaspump2
	@Override
	public StoreCash getStoreCash() {
		return new StoreCash2(this.ds);
	}

	// Method to return StorePrices1 class that stores the temporary gas prices for gaspump2
	@Override
	public StorePrices getStorePrices() {
		return new StorePrices2(this.ds);
	}
}