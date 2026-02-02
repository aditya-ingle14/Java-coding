// make a function to add 2 numbers and return the sum

import java.util.*;

public class prog38 {
    // Function to calculate the sum of two numbers
    public static int CalculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int c = CalculateSum(a, b);
            System.out.println("Sum: " + c);
        }
    }
}
