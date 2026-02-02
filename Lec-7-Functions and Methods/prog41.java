// Enter 3 number from the user & make a function to print their average

import java.util.*;

public class prog41 {

    public static int printAverage(int a, int b, int c) {
        int average = (a + b + c) / 3;
        return average;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a : ");
            int a = sc.nextInt();

            System.out.print("Enter b : ");
            int b = sc.nextInt();

            System.out.print("Enter c : ");
            int c = sc.nextInt();

            int d = printAverage(a, b, c);

            System.out.println("Average of the 3 number : " + d);
        }
    }
}
