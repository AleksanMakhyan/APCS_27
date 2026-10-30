/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	Scanner sc = new Scanner(System.in);
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
	public double getBalance() {
		System.out.println("Here is the account balance " + balance);
		return balance;
	}




	public void displayAccountInfo() {
		System.out.println("------------------------------------------");
		System.out.println("The owner is " + owner);
		System.out.println("The account number is " + accountnumber);
		System.out.println("The balance is " + balance);
		System.out.println("Is the account active " + isActive);
		System.out.println("------------------------------------------");
	}

	public String getOwner() {
		System.out.println("The Owner Is: " + owner);
		return owner;
	}

	public String setOwner(String a) {
		owner = a;
		return owner;
	}
	public void closeAccount() {
		isActive = false;
		System.out.println("The account has been closed");
	}

	public void isAccountActive() {
		System.out.println("Is the account active? " + isActive);
	}

	public void deposit(double money) {
		if (isActive = true) {
			balance = balance + money;
		}
	}
	public void withdraw(double money) {
		if (isActive = true) {
			balance = balance - money;
		}
	}

 }