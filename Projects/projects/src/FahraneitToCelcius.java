import java.util.Scanner;

public class FahraneitToCelcius{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Fahrenheit temperature
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble(); //also can be added normal but i decided to wrappe it

        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Display the result
        System.out.println("Temperature in Celsius: " + celsius);

        scanner.close();
    }
}


/////////////////////////////////////
//This code is written by znl_arad//
///////////////////////////////////