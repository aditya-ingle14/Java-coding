// write a function which takes in 2 numbers and return the greater of those 2

import java.util.*;

public class prog43 {

    public static int printGreater(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Eneter a : ");
            int a = sc.nextInt();

            System.out.print("Enter b : ");
            int b = sc.nextInt();

            printGreater(a, b);

        }
    }
}
