import java.util.Scanner;

public class FactorialCalculator {

    // Recursive method 
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check if the input is non-negative
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            // Calculate and display the factorial
            long factorial = calculateFactorial(number);
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}

/////////////////////////////////////
//This code is written by znl_arad//
///////////////////////////////////