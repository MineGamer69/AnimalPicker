import java.util.Scanner;

public class animalpicker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animalChoice;
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
        } else if (animalChoice.equalsIgnoreCase("fish")) {
            System.out.println("     ><> ");
            System.out.println("  ,-'`~`'-.");
            System.out.println(" (_, o o ,_)");
            System.out.println("    /    \\");
            System.out.println("  `--|__|--'");
        }
    }
}

