
import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		BankAccount Charlie = new BankAccount("Charlie", 15000);
		BankAccount John = new BankAccount();
		BankAccount Arthur = new BankAccount("Arthur");
		Charlie.getBalance();
		John.getBalance();
		Arthur.getBalance();
		Charlie.displayAccountInfo();
		John.displayAccountInfo();
		Arthur.displayAccountInfo();
	
	}
}
