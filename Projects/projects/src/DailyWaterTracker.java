import java.util.Scanner;

public class DailyWaterTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalWaterConsumed = 0;

        System.out.println("Welcome to the Daily Water Tracker!");

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Log water consumption");
            System.out.println("2. View total water consumed");
            System.out.println("3. Exit");

            System.out.print("Enter your choice (1/2/3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount of water consumed (in milliliters): ");
                    int waterConsumed = scanner.nextInt();
                    totalWaterConsumed += waterConsumed;
                    System.out.println("Logged " + waterConsumed + " ml of water.");
                    break;
                case 2:
                    System.out.println("Total water consumed today: " + totalWaterConsumed + " ml");
                    break;
                case 3:
                    System.out.println("Exiting the Daily Water Tracker. Have a great day!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
}
/////////////////////////////////////
//This code is written by znl_arad//
///////////////////////////////////