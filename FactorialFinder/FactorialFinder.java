import java.util.Scanner;

public class FactorialFinder {
    public static void main (String[] args) {
       // Print out a introduction/ask the user for the number
       System.out.print("Enter a number: ");
       // Initiate a scanner and grab the number from the terminal
       Scanner scanner = new Scanner(System.in);
       int number = scanner.nextInt();
       // Create a for loop to iterate through each multiplication
       int factorial = 1;
       for (int i = 1; i <= number; i++) {
         factorial = factorial * i;
       } 
       // Prints out the factorial
       System.out.println("The factorial of " + number + " is " + factorial);
       // Close Scanner
       scanner.close();
    }
}
