import java.util.*;

public class prog12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int button = sc.nextInt();

            // Corrected 'Switch' to 'switch' and fixed syntax issues
            switch (button) {
                case 1:
                    System.out.println("Hello");
                    break;
                case 2:
                    System.out.println("Namaste");
                    break;
                case 3:
                    System.out.println("Bonjour");
                    break;
                default:
                    System.out.println("Invalid button");
                    break;
            }
        }
    }
}

