//write a function that takes in the radius as input and returns the circumference of a circle

import java.util.*;

public class prog44 {

    public static double printCircumference(double r) {
        double circumference = 2 * 3.14 * r;
        return circumference;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the radius  : ");

            double r = sc.nextDouble();

            printCircumference(r);

            System.out.print("Circumference of the circle : " + printCircumference(r));
        }
    }
}
