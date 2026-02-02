import java.util.*;

public class prog46 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your age : ");
            int a = sc.nextInt();
            System.out.println(a);
            try (Scanner ab = new Scanner(System.in)) {
                String b;
                System.out.print("Enter your name  : ");
                b = ab.nextLine();
                System.out.println(b);
            }

        }
    }
}
