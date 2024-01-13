import java.util.Scanner;

public class CombinationCalculator {

    // Recursive method
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    
    public static long calculateCombination(int n, int r) {
        if (n < r) {
            return 0; 
        }

        // C(n, r) = n! / (r! * (n - r)!)
        long numerator = calculateFactorial(n);
        long denominator = calculateFactorial(r) * calculateFactorial(n - r);

        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a non-negative integer n: ");
        int n = scanner.nextInt();

        System.out.print("Enter a non-negative integer r: ");
        int r = scanner.nextInt();

        
        if (n < 0 || r < 0) {
            System.out.println("Please enter non-negative integers for n and r.");
        } else {
            // Calculate and display the combination
            long combination = calculateCombination(n, r);
            System.out.println("Combination C(" + n + ", " + r + ") is: " + combination);
        }

        scanner.close();
    }
}

/////////////////////////////////////
//This code is written by znl_arad//
///////////////////////////////////