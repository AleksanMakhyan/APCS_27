/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please select the first integer: ");
		int num1 = sc.nextInt();
		System.out.print("Please select the second integer: ");
		int num2 = sc.nextInt();
		System.out.print("Please select the third integer: ");
		int num3 = sc.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("The biggest number is: " + num1);
		}
		if (num2 > num1 && num2 > num3) {
			System.out.println("The biggest number is: " + num2);
		}
		if (num3 > num2 && num3 > num1) {
			System.out.println("The biggest number is: " + num3);
		}
		if (num1 < num2 && num1 < num3) {
			System.out.println("The smallest number is: " + num1);
		}
		if (num2 < num1 && num2 < num3) {
			System.out.println("The smallest number is: " + num2);
		}
		if (num3 < num2 && num3 < num1) {
			System.out.println("The smallest number is: " + num3);
		}
	}
}
