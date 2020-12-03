class StarSign {
    public static void main(String[] args) {
        // Write code here to test your methods!
        printStars(5);
    }
    public static void printStars(int number) {
        // Prints the given number of stars and then goes to a new line.
        /*
            Example Code:
            printStars(5);

            Prints:
            ***** 
        */
        for (int i = 0; i < number; i++) {
            System.out.print("*"); 
        }
        System.out.println();
    }
    public static void printSquare(int size) {
        // Prints a square with the help of the printStars method. 
        /* 
            Example Code: 
            printSquare(4);

            Prints:
            ****
            ****
            ****
            ****

            Notes:
            That is a 4x4 square, it just looks uneven because of the space between the lines.
        */

    }
    public static void printRectangle(int width, int height) {
        // Prints the rectangle with the given dimensions by using the printStars method.
        /* 
            Example Code:
            printRectangle(10, 3);

            Prints:
            **********
            **********
            **********
        */

    }
    public static void printTriangle(int size) {
        // Prints a right triangle by using the printStars method.
        /* 
            Example Code:
            printTriangle(4);

            Prints:
            *
            **
            ***
            ****
        */
        
    }
}
