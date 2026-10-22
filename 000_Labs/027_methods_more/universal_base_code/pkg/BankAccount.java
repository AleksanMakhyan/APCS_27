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
	public void getBalance() {
		System.out.println("Here is the account balance " + balance);
	}

	public void displayAccountInfo() {
		System.out.println("------------------------------------------");
		System.out.println("The owner is " + owner);
		System.out.println("The account number is " + accountnumber);
		System.out.println("The balance is " + balance);
		System.out.println("Is the account active " + isActive);
		System.out.println("------------------------------------------");
	}
}