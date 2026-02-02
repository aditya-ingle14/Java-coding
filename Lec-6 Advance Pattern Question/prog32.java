import java.util.*; // Butterfily Pattern

public class prog32 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = 4;
            // upeer half
            for (int i = 1; i <= n; i++) {
                // 1stpart
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }

                // spaces
                int spaces = 2 * (n - i);
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }

                // 2ndpart
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // lower part
            for (int i = n; i >= 1; i--) {
                // 1stpart
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }

                // spaces
                int spaces = 2 * (n - i);
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }

                // 2ndpart
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
