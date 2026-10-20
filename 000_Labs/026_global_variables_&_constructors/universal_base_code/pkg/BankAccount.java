/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	String name;
	double balance;
	// -------CONSTRUCTORS-------
	public BankAccount(String a, double b) {
		name = a;
		balance = b;
	}
	public void updateBalance(double newbal) {
		balance = newbal;
	}
	public double getBalance() {
		return balance;
	}

}