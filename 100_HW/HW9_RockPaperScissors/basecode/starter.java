/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;
import java.util.Random;

public class starter {
    static Random random = new Random();

    public static String getObject() {
        String[] objects = {"rock", "paper", "scissors"};
        return objects[random.nextInt(3)];
    }

    public static int compare2(String player1, String player2) {
        if (player1.equals(player2)) return 0;
        if ((player1.equals("rock") && player2.equals("scissors")) ||
            (player1.equals("paper") && player2.equals("rock")) ||
            (player1.equals("scissors") && player2.equals("paper"))) {
            return 1;
        }
        return 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Would you like to play? (yes/no/done): ");
            String choice = input.nextLine().trim().toLowerCase();

            if (choice.equals("done")) break;

            if (choice.equals("yes")) {
                String player;
                do {
                    System.out.print("Choose rock, paper, or scissors: ");
                    player = input.nextLine().trim().toLowerCase();
                } while (!player.equals("rock") &&
                         !player.equals("paper") &&
                         !player.equals("scissors"));

                String computer = getObject();
                int result = compare2(player, computer);

                System.out.println("Computer chose " + computer);
                if (result == 0) System.out.println("Tie!");
                else if (result == 1) System.out.println("You win!");
                else System.out.println("Computer wins!");
            } else if (choice.equals("no")) {
                int games;
                while (true) {
                    System.out.print("How many games? ");
                    try {
                        games = Integer.parseInt(input.nextLine().trim());
                        if (games > 0) break;
                    } catch (NumberFormatException e) {
                    }
                    System.out.println("Enter a positive integer.");
                }

                int player1Wins = 0;
                int player2Wins = 0;
                int ties = 0;

                for (int i = 0; i < games; i++) {
                    int result = compare2(getObject(), getObject());
                    if (result == 0) ties++;
                    else if (result == 1) player1Wins++;
                    else player2Wins++;
                }

                System.out.println("Player 1 wins: " + player1Wins);
                System.out.println("Player 2 wins: " + player2Wins);
                System.out.println("Ties: " + ties);
            } else {
                System.out.println("Enter yes, no, or done.");
            }
        }

        input.close();
    }
}