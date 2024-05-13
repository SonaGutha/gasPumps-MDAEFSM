package main.java.com.strategy.printReceipt;

import main.java.com.dataStore.DataStore;
import main.java.com.dataStore.DataStore1;

/**
 * Class implements the logic to print receipt for GP1
 * This class belongs to strategy pattern
 */

public class PrintReceipt1 extends PrintReceipt{

    public PrintReceipt1(DataStore ds) {
        super(ds);
    }

    //Method to print receipt for the gaspump 1
    @Override
    public void printReceipt() {
        System.out.println("Printing receipt for GP-1");
        System.out.println("------------------------------------------------------------------------");
        DataStore1 ds1 = (DataStore1) ds;
        System.out.println(ds1.getL() + " liters of gas @ $" + ds1.getPrice() + "/liter");
        System.out.println("Total Cost: $" + ds1.getTotal());
        System.out.println("------------------------------------------------------------------------");
        System.out.println("GP1 transaction is completed");
    }
}
