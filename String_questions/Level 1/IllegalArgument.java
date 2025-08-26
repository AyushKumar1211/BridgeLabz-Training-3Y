import java.util.Scanner;
public class IllegalArgument {
    static void generateException(String str) {
        System.out.println("Substring: " + str.substring(5, 2));
    }
    static void handleException(String str) {
        try {
            System.out.println("Substring: " + str.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException! Message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException! Message: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Generating Exception: ");
        try {
            generateException(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }
        System.out.println("Handling Exception: ");
        handleException(input);
        sc.close();
    }
}
