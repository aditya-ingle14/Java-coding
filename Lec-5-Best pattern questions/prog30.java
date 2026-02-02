import java.util.*;

public class prog30 {
    public static void main(String [] main){
        try(Scanner sc = new Scanner(System.in)){
            int n = 5;
            int number = 1;

            // outer loop;
            for(int i = 1;i<=n;i++){
                for(int j = 1 ;j<=i ; j++){
                    System.out.print(number + " ");
                    number++;
                }
                System.out.println();
            }
        }
    }
}
