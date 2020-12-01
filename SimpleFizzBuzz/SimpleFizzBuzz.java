import java.util.Scanner;

class SimpleFizzBuzz {
    public static void main(String[] args) {

        System.out.println("Pick a number between one and one hundred.");

        //creates scanner object
        Scanner scanner = new Scanner(System.in);

        //defines the user input as "number" and defines it as an integer
        int number = scanner.nextInt();

        //prints the users input
        System.out.println(number);

        //first if statement made in order to determine if the number is both divisible by 3 and 5 to print FizzBuzz
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        }

        //then i used an else if statement so that it could be if and ONLY if the number is divisible by 3 to print Fizz
        else if (number % 3 == 0) {
            System.out.println("Fizz");
        }

        //then i used a 2nd else if statement so that it could be if and ONLY if the number is divisible by 5 to print Buzz    
        else if (number % 5 == 0) {
            System.out.println("Buzz");
        }

        //closed the scanner object
        scanner.close();
    }
}