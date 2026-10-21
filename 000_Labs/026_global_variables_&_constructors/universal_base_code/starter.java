
import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		BankAccount Charlie = new BankAccount("Charlie", 15000);
		System.out.println(Charlie);
		BankAccount John = new BankAccount();
		System.out.println(John);
		BankAccount Arthur = new BankAccount("Arthur");
		System.out.println(Arthur);
		BankAccount Michael = new BankAccount("Michael", 10000);
		System.out.println(Michael);
	}
}
