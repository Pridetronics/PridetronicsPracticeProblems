import java.util.Scanner;

class SchoolGrading {
    public static void main(String[] args) {
        // Initiates the scanner object
        Scanner scanner = new Scanner(System.in);
        // Ask the user for a number
        System.out.println("Please enter your grade:");
        // Scans the terminal for a number
        int numberGrade = scanner.nextInt();
        // Converts the number grade to a letter grade and prints it
        if (numberGrade > 100) {
            System.out.println("That's Impossible!");
        }
        else if (numberGrade >= 90) {
            System.out.println("You got an A!");
        }
        else if (numberGrade >= 80) {
            System.out.println("You got a B!");
        }
        else if (numberGrade >= 70) {
            System.out.println("You got a C!");
        }
        else if (numberGrade >= 60) {
            System.out.println("You got a D!");
        }
        else if (numberGrade >= 0) {
            System.out.print("You got an F :(");
        }
        else {
            System.out.println("That's Impossible!");
        }   
        // Close the scanner
        scanner.close();
    }
}
