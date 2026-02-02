
import java.util.*;


public class prog7 {
    public static void main(String [] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a");
            int a = sc.nextInt();
            System.out.println("Enter b :");
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println("Sum : " +" " + sum);
        }
    }
}
