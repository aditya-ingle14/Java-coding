// print the table of a number input by the user 

import java.util.*;

public class prog21 {
    public static void main(String [] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the num which u want to print the table : ");
            int num = sc.nextInt();
            for(int i = 1 ;i<=10;i++){
                System.out.println(num + "*" + i + " = " + i*num);
            }
        }
    }
}
