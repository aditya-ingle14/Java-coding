// write a function to print the sum of all odd numbers from 1 to n

import java.util.*;

public class prog42 {

    public static int printSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i = i + 2) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Eneter the number : ");
            int n = sc.nextInt();
            printSum(n);

            System.out.print("Sum of odd n no : " + printSum(n));
        }
    }
}
