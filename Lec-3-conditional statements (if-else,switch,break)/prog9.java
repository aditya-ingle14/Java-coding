import java.util.*;

public class prog9 {
    public static void main(String [] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("ENter the number:");
            int x = sc.nextInt();
            if(x%2 == 0){
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }
        }
    }
}
