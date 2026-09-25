/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first integer: ");
		int x = sc.nextInt();
		System.out.println("Please enter the second integer: ");
		int y = sc.nextInt();
		if (x == y) {
			System.out.println("The variable values are the same!");
		} else {
			System.out.println("The variable values are different!");
		}
	}
}
