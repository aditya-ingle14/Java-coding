// write a function that takes in age as input and returns if that person is eligible to vote or not A person is age > 18 is eligible to vote

import java.util.*;

public class prog45 {

    public static String printEligible(int age) {
        if (age >= 18) {
            return "Eligible to vote";
        } else {
            return "Not eligible to vote";
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the age : ");
            int age = sc.nextInt();

            String result = printEligible(age);
            System.out.println(result);
        }
    }
}
