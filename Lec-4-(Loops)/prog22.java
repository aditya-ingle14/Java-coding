import java.util.*;

public class prog22 {
    public static void main(String [] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Eneter a number: ");
            int number = sc.nextInt();

            boolean isPrime = true;

            if (number <= 1){
                isPrime = false;
            }
            else{
                for(int i = 2 ; i<=number/2;i++){
                    if(number % i == 0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime){
                System.out.print(number + " " + "is a prime number");
            }
            else{
                System.out.println(number + " " + "is not a prime number");
            }
        }
    }
}
