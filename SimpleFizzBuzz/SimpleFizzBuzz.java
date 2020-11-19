import java.util.Scanner;
class SimpleFizzBuzz {
    public static void main(String[] args) {
        //Initiates scanner object
        Scanner scanner = new Scanner(System.in);
        //Ask the user for the number
        System.out.println("Enter a number between 1-100");
        double number = scanner.nextDouble();
        System.out.println(number);
        
        if (number % 3 == 0) {
            System.out.println("Fizz");
        }
        if (number % 5 == 0) {
            System.out.println("Buzz");
        }
        if (number % 5 == 0 && number % 3 == 0){
            System.out.println("FizzBuzz");
        }
    }  
} 