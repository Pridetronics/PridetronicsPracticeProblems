import java.util.Scanner;

public class PositiveNumberAverage {
    public static void main(String[] args) {
        // make average variable and counter
        double average = 0;
        double counter = 0;

        // make a scanner object
        Scanner scanner = new Scanner(System.in);
        // while loop
        while (true) {
            System.out.println("Give me a number");
            int number = scanner.nextInt();

            // test whether input is 0
            if (number == 0) {
                break;
            }

            // test whether input is positive and then add it to variable
            if (number > 0) {
                // average = average + number;
                average += number;
                counter++;
            }
        }

        // take the variable and divide it by the number of times it ran and print it
        if (average == 0 || counter == 0) {
            System.out.println("Cannot calculate the average.");
        } else {
            // average = average/counter
            average /= counter;
            System.out.println("The average is " + average);
        }

    }
}