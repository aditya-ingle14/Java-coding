// 2 numbers are enetered by the user ,x and n.write a function to find the value of one
//numbere raised by to the poweer of another i.e. x^n

import java.util.*;

public class prog49 {

    public static double power(double x, int n) {
        return Math.pow(x, n);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the base number (x) : ");
            double x = sc.nextDouble();

            System.out.print("Eneter the exponent (n) : ");
            int n = sc.nextInt();

            double result = power(x, n);

            System.out.print(x + " Raised to the power " + n + "is : " + result);
        }
    }
}
