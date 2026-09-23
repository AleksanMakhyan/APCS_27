/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
	System.out.println("Pick a number between 1 - 1000: ");
	int number = sc.nextInt();
	int random = (int)(Math.random() * 1000 + 1);
	if (random == number) {
		System.out.println("CONGRATS YOU GUESSED THE NUMBER! THE NUMBER WAS " + random);
	}
	if (random != number) {
		System.out.println("Your guess was wrong, the number was: " + random);
	}
	}
}
