package main.java.com.strategy.ejectCard;

/**
 * Class to implement eject card for gaspump 1 when payment type is credit
 * This class belongs to strategy pattern
 *
 */
public class EjectCard1 extends EjectCard{

	@Override
	public void ejectCard() {

		System.out.println("Card is ejected");

	}
}
