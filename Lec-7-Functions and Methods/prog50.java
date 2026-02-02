//write a function that calculates greatest common divisor of 2 number

import java.util.*;

public class prog50 {

    public static int calculateGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b; // remainder
            a = temp;
        }
        return a; // gcd stored in a
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first number:");
            int num1 = sc.nextInt();

            System.out.print("Eneter the second number : ");
            int num2 = sc.nextInt();

            int gcd = calculateGcd(num1, num2);

            System.out.println("The Gcd of" + num1 + "and" + num2 + "is : " + gcd);
        }
    }
}
