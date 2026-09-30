/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Pick a number between 1 - 1000: ");
		int number = sc.nextInt();
		int random = (int)(Math.random()*1000+1);
		if (number >= random) {
			System.out.println("Your number was bigger than the number. The number was " + random);
		} else {
			System.out.println("Your number was smaller than the number. The number was " + random);
		}
	}
}
