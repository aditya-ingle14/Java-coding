import java.util.*;   // scanner ko use krne ke likye yeh package use krna padta hai

public class prog6 {
    public static void main(String[] args) {

        // Use try-with-resources to automatically close the Scanner
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Your name is: " + name);
        }
    }
}



//next() se 1 word type hoga aur nextLine() se purin line 