/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int number = (int)(Math.random() * 1000 + 1);
		Scanner sc = new Scanner(System.in);
		int guess = 0;
		System.out.print("Guess the number between 1 - 1000: ");
		guess = sc.nextInt();
		while (number != guess) {
			if (guess >= number) {
				System.out.print("Too high try lower! ");
				guess = sc.nextInt();
			}
			if (guess <= number) {
				System.out.print("Too low try higher! ");
				guess = sc.nextInt();				
			}

		}
		System.out.println("YOU GOT IT THE NUMBER WAS: " + number);


		
	}
}
