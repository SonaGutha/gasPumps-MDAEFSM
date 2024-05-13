package main.java.com.gasPump;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import main.java.com.abstractFactory.AbstractGPFactory;
import main.java.com.abstractFactory.GP_1_Factory;
import main.java.com.abstractFactory.GP_2_Factory;
import main.java.com.dataStore.DataStore;
import main.java.com.op.OP;
import main.java.com.state.mdaefsm.MDA_EFSM;

public class GPDriver {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String input = null;

		System.out.println("Select type of GasPump: ");
		System.out.println("1. GasPump1");
		System.out.println("2. GasPump2");
		input = bufferedReader.readLine();

		if (input.equals("1")) {

			AbstractGPFactory af = new GP_1_Factory();
			DataStore d = af.getDataStore();
			OP op = new OP(af);
			MDA_EFSM mdaEfsm = new MDA_EFSM(op);
			GP_1 gp1 = new GP_1(mdaEfsm, d, af);

			System.out.print("                          GasPump-1");
			System.out.print("\n");
			System.out.print("                  MENU of Operations");
			System.out.print("\n");
			System.out.print("          0. Activate(int)");
			System.out.print("\n");
			System.out.print("          1. Start()");
			System.out.print("\n");
			System.out.print("          2. PayCredit");
			System.out.print("\n");
			System.out.print("          3. Reject()");
			System.out.print("\n");
			System.out.print("          4. Cancel()");
			System.out.print("\n");
			System.out.print("          5. Approved()");
			System.out.print("\n");
			System.out.print("          6. PayCash(int)");
			System.out.print("\n");
			System.out.print("          7. StartPump()");
			System.out.print("\n");
			System.out.print("          8. Pump()");
			System.out.print("\n");
			System.out.print("          9. StopPump()");
			System.out.print("\n");
			System.out.print("          q. Quit the program");
			System.out.print("\n");

			System.out.print("  Please make a note of these operations");
			System.out.print("\n");
			System.out.print("           GasPump-1 Execution");
			System.out.print("\n");
			char ch = '1';
			Scanner sc = new Scanner(System.in);
			while (ch != 'q') {
				System.out.print("  Select Operation: ");
				System.out.print("\n");
				System.out.print(
						"0-Activate,1-Start,2-PayCredit,3-Reject, 4-Cancel,5-Approved,6-PayCash,7-StartPump, 8-Pump, 9-StopPump, q-quit");
				System.out.print("\n");
				ch = sc.next().charAt(0);
				switch (ch) {
				case '0': { // Activate()
					System.out.print("  Operation:  Activate(int a)");
					System.out.print("\n");
					System.out.print("  Enter value of the parameter a:");
					System.out.print("\n");
					int a = sc.nextInt();
					gp1.Activate(a);
					break;
				}

				case '1': { // Start
					System.out.print("  Operation:  Start()");
					System.out.print("\n");
					gp1.Start();
					break;
				}

				case '2': { // PayCredit
					System.out.print("  Operation:  PayCredit()");
					System.out.print("\n");
					gp1.PayCredit();
					break;
				}

				case '3': { // Reject
					System.out.print("  Operation:  Reject()");
					System.out.print("\n");
					gp1.Reject();
					break;
				}

				case '4': { // Cancel
					System.out.print("  Operation:  Cancel()");
					System.out.print("\n");
					gp1.Cancel();
					break;
				}

				case '5': { // Approved
					System.out.print("  Operation:  Approved()");
					System.out.print("\n");
					gp1.Approved();
					break;
				}

				case '6': { // PayCash
					System.out.print("  Operation:  PayCash(int c)");
					System.out.print("\n");
					System.out.print("  Enter value of the parameter c:");
					System.out.print("\n");
					int c = sc.nextInt();
					gp1.PayCash(c);
					break;
				}

				case '7': { // StartPump
					System.out.print("  Operation:  StartPump()");
					System.out.print("\n");
					gp1.StartPump();
					break;
				}

				case '8': { // Pump
					System.out.print("  Operation: Pump()");
					System.out.print("\n");
					gp1.Pump();
					break;
				}

				case '9': { // StopPump
					System.out.print("  Operation:  StopPump()");
					System.out.print("\n");
					gp1.StopPump();
					break;
				}
			}
				; // endswitch

			}
			; // endwhile
		} else if (input.equals("2")) {
			AbstractGPFactory af = new GP_2_Factory();
			DataStore d = af.getDataStore();
			OP op = new OP(af);
			MDA_EFSM mdaEfsm = new MDA_EFSM(op);
			GP_2 gp2 = new GP_2(mdaEfsm, d, af);

			System.out.print("                          GasPump-2");
			System.out.print("\n");
			System.out.print("                  MENU of Operations");
			System.out.print("\n");
			System.out.print("          0. Activate(float, float,float)");
			System.out.print("\n");
			System.out.print("          1. Start()");
			System.out.print("\n");
			System.out.print("          2. PayCash");
			System.out.print("\n");
			System.out.print("          3. Diesel()");
			System.out.print("\n");
			System.out.print("          4. Premium()");
			System.out.print("\n");
			System.out.print("          5. Regular()");
			System.out.print("\n");
			System.out.print("          6. StartPump()");
			System.out.print("\n");
			System.out.print("          7. PumpGallon()");
			System.out.print("\n");
			System.out.print("          8. Stop()");
			System.out.print("\n");
			System.out.print("          9. Receipt()");
			System.out.print("\n");
			System.out.print("          10. NoReceipt()");
			System.out.print("\n");
			System.out.print("          q. Quit the program");
			System.out.print("\n");

			System.out.print("  Please make a note of these operations");
			System.out.print("\n");
			System.out.print("           GasPump-2 Execution");
			System.out.print("\n");
			char ch = '1';
			Scanner sc = new Scanner(System.in);
			while (ch != 'q') {
				System.out.print("  Select Operation: ");
				System.out.print("\n");
				System.out.print(
						"0-Activate,1-Start,2-PayCash,3-Diesel, 4-Premium,5-Regular ,6-StartPump, 7-PumpGallon, 8-Stop,9-Receipt, n-NoReceipt, q-quit");
				System.out.print("\n");
				ch = sc.next().charAt(0);
				switch (ch) {
				case '0': { // Activate()
					System.out.print("  Operation:  Activate(float a, float b, float c)");
					System.out.print("\n");
					System.out.print("  Enter value of the parameter a:");
					System.out.print("\n");
					float a = sc.nextFloat();
					System.out.print("  Enter value of the parameter b:");
					System.out.print("\n");
					float b = sc.nextFloat();
					System.out.print("  Enter value of the parameter c:");
					System.out.print("\n");
					float c = sc.nextFloat();
					gp2.Activate(a, b, c);
					break;
				}

				case '1': { // Start
					System.out.print("  Operation:  Start()");
					System.out.print("\n");
					gp2.Start();
					break;
				}

				case '2': { // PayCash
					System.out.print("  Operation:  PayCash(int c)");
					System.out.print("\n");
					System.out.print("  Enter value of the parameter c:");
					System.out.print("\n");
					int c = sc.nextInt();
					gp2.PayCash(c);
					break;
				}

				case '3': { // Diesel
					System.out.print("  Operation:  Diesel()");
					System.out.print("\n");
					gp2.Diesel();
					break;
				}

				case '4': { // Premium
					System.out.print("  Operation:  Premium()");
					System.out.print("\n");
					gp2.Premium();
					;
					break;
				}

				case '5': { // Regular
					System.out.print("  Operation:  Regular()");
					System.out.print("\n");
					gp2.Regular();
					break;
				}

				case '6': { // StartPump
					System.out.print("  Operation:  StartPump()");
					System.out.print("\n");
					gp2.StartPump();
					break;
				}

				case '7': { // PumpGallon
					System.out.print("  Operation:  PumpGallon()");
					System.out.print("\n");
					gp2.PumpGallon();
					break;
				}

				case '8': { // Pump
					System.out.print("  Operation: Stop()");
					System.out.print("\n");
					gp2.Stop();
					break;
				}

				case '9': { // Receipt
					System.out.print("  Operation:  Receipt()");
					System.out.print("\n");
					gp2.Receipt();
					break;
				}

				case 'n': { // NoReceipt
					System.out.print("  Operation:  NoReceipt()");
					System.out.print("\n");
					gp2.NoReceipt();
					break;
				}
				}
				; // endswitch

			}
			;

		}
	}
}
