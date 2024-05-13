package main.java.com.strategy.printReceipt;

import main.java.com.dataStore.DataStore;
import main.java.com.dataStore.DataStore2;

/**
 * Class implements the logic to print receipt for GP2
 * This class belongs to strategy pattern
 */

public class PrintReceipt2 extends PrintReceipt{

    public PrintReceipt2(DataStore ds) {
        super(ds);
    }

    //Method to print receipt for the gas pump 2
    @Override
    public void printReceipt() {
        System.out.println("Printing receipt for GP-2");
        System.out.println("------------------------------------------------------------------------");
        DataStore2 ds2 = (DataStore2) ds;
        System.out.println(ds2.getG() + " gallons of gas @ $" + ds2.getPrice() + "/gallon");
        System.out.println("Total Cost: $" + ds2.getTotal());
        System.out.println("------------------------------------------------------------------------");
        System.out.println("GP2 transaction is completed");
    }
}
