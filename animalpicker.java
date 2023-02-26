import java.util.Scanner;

public class animalpicker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animalChoice;
        boolean validInput = false;
        do{
            System.out.print("Which animal would you like to see: dog, cat, or fish? ");
            animalChoice = scanner.nextLine();
            if (animalChoice.equalsIgnoreCase("dog")) {
                System.out.println("    / \\");
                System.out.println("   ( o )( o )");
                System.out.println("  (  =  =  )");
                System.out.println("   (   _   )");
                System.out.println("    (____)");
            } else if (animalChoice.equalsIgnoreCase("cat")) {
                System.out.println(" /\\_/\\");
                System.out.println("( o.o )");
                System.out.println(" > ^ <");
            }
            //added placeholders for ascii
            else{
                System.out.println("Invalid choice. Please try again!");
            }
        } while(!validInput);
    }
}

