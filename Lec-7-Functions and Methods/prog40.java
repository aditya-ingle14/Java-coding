// calculate the factorial

import java.util.*;

public class prog40 {

    public static void printFactorial(int n) {

        if (n < 0) {
            System.out.println("Invalid Numbers");
        }

        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Eneter the number: ");
            int n = sc.nextInt();

            printFactorial(n);
        }
    }
}
