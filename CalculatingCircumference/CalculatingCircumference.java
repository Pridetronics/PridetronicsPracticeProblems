import java.util.Scanner;

class CalculatingCircumference
{
    public static void main(String[] args)
    {
        System.out.println("What is the radius of the circle?");
        
        //create scanner object
        Scanner scanner = new Scanner(System.in);
        
        //store input in a radius variable
        double radius = scanner.nextDouble();
        scanner.close();

        //manipulate radius into circumference
        double pi = Math.PI;
        double circumference = 2*pi*radius;

        //print circumference
        System.out.println(circumference);

    }
}