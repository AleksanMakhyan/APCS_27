/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your first name?");
		String firstName = sc.nextLine();
		System.out.println("How old are you?");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Which month were you born?");
		String month = sc.nextLine();
		System.out.println("Which day were you born?");
		int day = sc.nextInt();
		sc.nextLine();
		System.out.println("Which year were you born?");
		int year = sc.nextInt();
		sc.nextLine();
		System.out.println("How much is a buck fifty?");
		double buckfifty = sc.nextDouble();
		sc.nextLine();

		System.out.println("Here is the information we found:");
		System.out.println("First Name: " + firstName);
		System.out.println("Age: " + age);
		System.out.println("Birthday Month: " + month);
		System.out.println("Birthday Day: " + day);
		System.out.println("Birthday Year: " + year);
		System.out.println("Buck Fifty Value: " + buckfifty);
	}
}
