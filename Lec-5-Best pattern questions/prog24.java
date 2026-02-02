import java.util.*;

public class prog24 {
    public static void main(String [] args){
        try(Scanner sc = new Scanner(System.in)){
            int n = 4;
            int m = 5;

            //outer loop
            for(int i = 1; i<=n ; i++){ //jana sab position pe hai
                //inner loop
                for(int j = 1; j<=m ;j++){  //jana sab position pr hai
                    //cell -> (i,j)........aab position pe star print krna hai
                    if(i==1 || j==1 ||  i==n || j==m){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");  // bichme space dene ke liye
                    }
                }
                System.out.println();
            }
        }
    }
}