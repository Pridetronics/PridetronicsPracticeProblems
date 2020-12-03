class RepeatBreakRemember {
    public static void main(String[] args) {
        // :)
        // Initialize scanner and grab number from terminal
        Scanner scanner = new Scanner(System.in);
        //Grabs number from terminal
        int count = 0;
        int sum = 0;
        int number = 0;
        int odd = 0;
        int even = 0;
        //While loop to asks for number until user puts in -1
        while (true) {
            System.out.println("Insert an Integer Number:");
            count = scanner.nextInt();
            // -1 Will Break The Loop
            if (count == -1) {
                break;
            }
            // Valid Number
            else if (count != -1) {
                // Will prove true if the number is even
                sum += count;
                number++;
                // Will prove true if the number is even
                if (count % 2 == 0){
                    even++;
                }
                // Will prove true if the number is odd
                else {
                    odd++;
                }
            } 
        }
        // Calculates the average
        int mean = sum/number;
        // Prints out the variables we've created through the while loop
        System.out.println("Sum = " + sum);
        System.out.println("Numbers of Times You Inserted a Number: " + number);
        System.out.println("Mean: " + mean);
        System.out.println("Odd:" + odd);
        System.out.println("Even:" + even);
        //Prints out the words
        System.out.println("Thanks! Bye!");
        //Close Scanner
        scanner.close();
    }
}  
