import java.util.*;

public class prog11 {
    public static void main(String [] args ){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter button : ");
            int button = sc.nextInt();

            if(button == 1){
                System.out.println("Hello");
            }
            else if(button == 2){
                System.out.println("Namste");
            }
            else if(button == 3){
                System.out.println("Banjour");
            }
            else{
                System.out.println("Invalid");
            }
        }
    }
}
