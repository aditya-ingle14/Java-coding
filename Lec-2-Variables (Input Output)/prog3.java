public class prog3 {
    public static void main(String[] args) {

        // Variable declarations
        String name = "Aditya Ingle";
        int age = 48;
        int b = 15;
        int a = 10;
        double price = 25.25;

        // Updating variables
        b = 20;
        name = "Rohit";

        // Using the variables to avoid warnings
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Values of a and b: " + a + ", " + b);
    }
}



// In Java, to combine a string literal ("name:") with a variable value (name),
// you need to use the + operator