import java.util.Scanner;

class UnitConversionMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter temp: ");
        double tempF = scanner.nextDouble();
        double tempC = fahrenheitToCelsius(tempF);
        System.out.println(tempC);
    }

    public static double fahrenheitToCelsius(double temperatureInFahrenheit) {
        // A method to convert temperature in fahrenheit to celsius
        double temperatureC = (temperatureInFahrenheit - 32) * (5.0/9.0);
        return temperatureC;
    }
}
