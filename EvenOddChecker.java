import java.util.Scanner;

public class EvenOddChecker {
    
    // Method to get integer input from the user
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int number;
        
        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        
        // Validate input to ensure it's an integer
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next(); // Consume the invalid input
        }
        
        // Read the valid integer input
        number = scanner.nextInt();
        
        // Close the scanner after input
        scanner.close();
        
        return number;
    }

    // Method to check if the number is even or odd
    public static String checkEvenOrOdd(int number) {
        // Use the modulo operator to check if the number is divisible by 2
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }

    // Main method to tie everything together
    public static void main(String[] args) {
        // Get the integer input from the user
        int number = getIntegerInput();
        
        // Get the result of whether the number is even or odd
        String result = checkEvenOrOdd(number);
        
        // Display the result message
        System.out.println(result);
    }
}
