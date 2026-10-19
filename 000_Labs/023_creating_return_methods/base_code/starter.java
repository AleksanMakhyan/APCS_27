/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {

    public static double pow(int a, int b) {
        double result = 1;
        int x = 0;

        while (x < b) {
            result = result * a;
            x++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(pow(10,2));
    }
}