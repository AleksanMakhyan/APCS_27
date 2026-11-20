import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tell me something that annoys you: ");
        String complaint = input.nextLine();

        System.out.println("\nYou said:\n\t\"" + complaint + "\"");
        System.out.println("\nOh, really? I\'ll alert the news.");
        System.out.println("\tBreaking news: someone is annoyed!");
        System.out.println("\nYour complaint has been saved to:");
        System.out.println("\tC:\\Complaints\\NobodyAsked.txt");
        System.out.println("\n\"Thank you\" for sharing your drama.");

        input.close();
    }
}