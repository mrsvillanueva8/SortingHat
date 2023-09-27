import java.util.Scanner;

public class SortingHat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Hogwarts! Let the Sorting Hat choose your house.");
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        System.out.println("Answer the following questions with 'yes' or 'no':");

        // Ask user questions to determine house
        System.out.print("Do you value bravery and chivalry? ");
        String answer = scanner.nextLine().toLowerCase();
        if (answer.equals("yes")) {
            System.out.println("\nDear " + userName + ",");
            System.out.println("You belong to Gryffindor!");
        } else {
            System.out.print("Do you value hard work, dedication, and loyalty? ");
            answer = scanner.nextLine().toLowerCase();
            if (answer.equals("yes")) {
                System.out.println("\nDear " + userName + ",");
                System.out.println("You belong to Hufflepuff!");
            } else {
                System.out.print("Do you value intelligence, creativity, and learning? ");
                answer = scanner.nextLine().toLowerCase();
                if (answer.equals("yes")) {
                    System.out.println("\nDear " + userName + ",");
                    System.out.println("You belong to Ravenclaw!");
                } else {
                    System.out.println("\nDear " + userName + ",");
                    System.out.println("You belong to Slytherin!");
                }
            }
        }
    }
}
