/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	String owner;
	int accountnumber;
	double balance;
	boolean isActive;
	static int nextAccountNumber = (int)(Math.random() * 950 + 50);
	// -------CONSTRUCTORS-------
	public BankAccount() {
		owner = "unknown";
		accountnumber = nextAccountNumber;
		balance = 0;
		isActive = true;
		nextAccountNumber += 1;
	}

	public BankAccount(String name) {
		owner = name;
		accountnumber = nextAccountNumber;
		balance = 0;
		isActive = true;
		nextAccountNumber += 1;
	}

	public BankAccount(String name , double deposit) {
		owner = name;
		balance = deposit;
		accountnumber = nextAccountNumber;isActive = true;
		nextAccountNumber += 1;

	}
	@Override
	public String toString() {
    	return "Owner: " + owner
        	+ "\nAccount number: " + accountnumber
        	+ "\nBalance: $" + balance
        	+ "\nActive: " + isActive;
	}
}