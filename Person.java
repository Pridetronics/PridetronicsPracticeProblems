public class Person {
    //instance variables
    private String name;
    private int age;
    private double weight;
    private double height;

    //main method
    public static void main(String[] args)
    {
        Person mitch = new Person("Mitch", 17, 130.0, 60.0);

        System.out.println(mitch.maximumHeartRate());
    }
    
    //constructor
    public Person(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    //class methods
    public double bodyMassIndex() {
        return this.weight / (this.height * this.height);
    }

    public double maximumHeartRate() {
        return 206.3 - (0.711 * this.age);
    }

    public String toString() {
        return this.name + ", BMI: " + this.bodyMassIndex()
            + ", maximum heart rate: " + this.maximumHeartRate();
    }
}
