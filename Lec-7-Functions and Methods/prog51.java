//write a program to print fibonacci series of n terms where n is input by user

import java.util.*;

public class prog51 {

    public static void printFibonacciSeries(int n) {
        int first = 0, second = 1;
        for (int i = 1; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of terms(n): ");
            int n = sc.nextInt();

            if (n < 0) {
                System.out.println("Please eneter a positive integer : ");
            } else {
                printFibonacciSeries(n);
            }
        }
    }
}
