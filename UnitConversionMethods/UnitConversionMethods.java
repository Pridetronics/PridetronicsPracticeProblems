class UnitConversionMethods {
    public static void main(String[] args) {
        System.out.println(fahrenheitToCelsius(70.2));
    }

    public static double fahrenheitToCelsius(double temperatureInFahrenheit) {
        // A method to convert temperature in fahrenheit to celsius
        double temperatureC = (temperatureInFahrenheit - 32) * (5.0/9.0);
        return temperatureC;
    }
}
