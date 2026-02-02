// print the sum first n natural numbers n = 4
import java.util.*;

public class prog20 {
    public static void main(String [] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            int sum = 0;
            for(int i = 1; i<=n;i++){
                sum = sum + i;
            }
            System.out.print(sum);
        }
    }
}
