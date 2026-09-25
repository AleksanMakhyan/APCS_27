/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first integer value: ");
		int x = sc.nextInt();
		System.out.println("Please enter the first integer value: ");
		int y = sc.nextInt();
		System.out.println("Maximum: " + Math.max(x,y));
		System.out.println("Square Root: " + Math.sqrt(y));
		System.out.println("Power: " + Math.pow(x,y));
	}
}
