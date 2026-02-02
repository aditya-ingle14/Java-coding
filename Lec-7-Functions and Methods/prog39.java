// make a function to multiply 2 numbers and return the product 

import java.util.*;

public class prog39 {

    public static int calculateProduct(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of a");
            int a = sc.nextInt();

            System.out.print("Enter the value of b");
            int b = sc.nextInt();

            System.out.print("Product of 2 no : " + calculateProduct(a, b));
        }
    }
}
