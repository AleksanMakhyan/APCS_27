/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int random1 = 0;
		int random2 = 0;
		int random3 = 0;
		int balance = 100;
		System.out.println("Welcoeme to The Slots");
		System.out.println("You currently have " + balance + " to wager");
		int wageramount = 0;
		while (balance > 0 ) {
			System.out.println("Would you like to play? (Yes,yes,Y,y) or (No,no,N,n)");
		    String response = sc.nextLine();
			if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
			System.out.print("Please input the amount of money that you wish to wager: ");
			wageramount = sc.nextInt();
			sc.nextLine();
			while (wageramount > balance) {
				System.out.print("You do not have suffficient balance please try again! ");
				wageramount = sc.nextInt();
			}
			random1 = (int)(Math.random() * 10 + 1);
			random2 = (int)(Math.random() * 10 + 1);
			random3 = (int)(Math.random() * 10 + 1);

			System.out.println("");
			System.out.println(random1);
			System.out.println(random2);
			System.out.println(random3);
			if (random1 == random2 || random1 == random3 || random2 == random3) {
				balance = balance * 2;
				System.out.println("You doubled your money, your new balance is " + balance + "!");
			} else if (random1 == random2 && random2 == random3) {
				balance = balance * 3;
				System.out.println("You tripled your money, your new balance is " + balance + "!");
			} else {
				balance = 0;
				System.out.println("You lost all your money :( , come try again later! ");
			}
			} else if (response.equalsIgnoreCase("no") || response.equalsIgnoreCase("n")) {
				System.out.println("You decided to end the game, here is how much money was left! " + balance);
				break;
			}

			

		}
	}
}
