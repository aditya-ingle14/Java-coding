import java.util.*;

public class prog34 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = 5;
            for (int i = 1; i <= n; i++) {
                // spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                // numbers ->
                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " "); // print row no ...row numbers
                }
                System.out.println();
            }
        }
    }
}
