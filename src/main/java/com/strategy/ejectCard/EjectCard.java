package main.java.com.strategy.ejectCard;

/**
 * Abstract Class to implement eject card for gaspump when payment type is
 * credit
 * This class belongs to strategy pattern
 *
 */
public abstract class EjectCard {
	public EjectCard() {
	}

	public abstract void ejectCard();
}
