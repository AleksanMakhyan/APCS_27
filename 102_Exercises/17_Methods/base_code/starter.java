/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {
	public static boolean isLeapYear(int year) {
		return (year % 4 == 0);
	}
	public static int getDigitSum(int number) {
		int sum = 0;
		if (number >= 100000) {
			System.out.println("Please select a 5 digit number! ");
		} else {
		sum = 0;
        while (number > 0) {
            sum += number % 10; 
            number = number / 10; 
        }

		}
		return sum;
	}
	public static void printIfConsecutive(int num1, int num2, int num3) {
		if (num1 + 1 == num2 || num2 + 1 == num3) {
			System.out.println("The numbers are consecutive!");
		} else {
			System.out.println("The numbers are not consecutive!");
		}
	}
	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year))
			System.out.println(year + " is a leap year!");
		else
			System.out.println(year + " is not a leap year!");

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		printIfConsecutive(num1, num2, num3);
		System.out.println();
		System.out.println("----------------------------------------");
	}
}
