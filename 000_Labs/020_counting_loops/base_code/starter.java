/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input username: ");
		String name = sc.nextLine();
		System.out.print("How many times should the username be printed? ");
		int quantity = sc.nextInt();
		sc.nextLine();
		int x = 0;
		while (quantity >= x ) {
			System.out.println(name);
			x = x+1;
		}


		
	}
}
