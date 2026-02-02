import java.util.*;

public class prog37 {

    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name : ");
            String name = sc.next();

            printMyName(name); // function ko call kr rhe hai
        }
    }
}
