// write a program to enter the numbers till the user wants and at the end it 
//should display the count of positive ,negative and zeros entered

import java.util.*;

public class prog48 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int positiveCount = 0, negativeCount = 0, zeroCount = 0;
            char choice;

            do {
                System.out.print("Enter a number : ");
                int num = sc.nextInt();

                if (num > 0) {
                    positiveCount++;
                } else if (num < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }
                System.out.print("Do you want to another number ? (y/n):");
                choice = sc.next().toLowerCase().charAt(0);
            } while (choice == 'y');
            System.out.println("\nSummary:");
            System.out.println("Positive numbers: " + positiveCount);
            System.out.println("Negative numbers: " + negativeCount);
            System.out.println("Zeros: " + zeroCount);
        }
    }
}
