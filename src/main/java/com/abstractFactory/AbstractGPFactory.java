package main.java.com.abstractFactory;

import main.java.com.dataStore.DataStore;
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
 * Abstract class that contains all the methods that perform a specific action
 * on a gas pump which are implemented by concrete factories
 * This class belongs to Abstract Factory Pattern
 */
public abstract class AbstractGPFactory {

	public abstract DataStore getDataStore();

	public abstract CancelMsg getCancelMsg();

	public abstract DisplayMenu getDisplayMenu();

	public abstract EjectCard getEjectCard();

	public abstract GasPumpedMsg getGasPumpedMsg();

	public abstract PayMsg getPayMsg();

	public abstract PrintReceipt getPrintReceipt();

	public abstract PumpGasUnit getPumpGasUnit();

	public abstract RejectMsg getRejectMsg();

	public abstract ReturnCash getReturnCash();

	public abstract SetInitialValues getSetInitialValues();

	public abstract SetPayType getSetPayType();

	public abstract SetPrice getSetPrice();

	public abstract StoreCash getStoreCash();

	public abstract StorePrices getStorePrices();

}