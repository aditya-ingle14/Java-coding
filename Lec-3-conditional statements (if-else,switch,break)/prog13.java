import java.util.*;

public class prog13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter num1: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter num2: ");
            double num2 = sc.nextDouble();

            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            double result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;

                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed");
                    }
                    break;

                default:
                    System.out.println("Invalid operator");
                    break;
            }
        }
    }
}
