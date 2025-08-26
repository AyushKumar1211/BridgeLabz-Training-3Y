import java.lang.reflect.Method;
import java.util.Scanner;

public class StringIndexOutBound {
    static void generateException(String str) {
        System.out.println("Character at index " + str.length() + ": " + str.charAt(str.length()));
    }
    static void handleException(String str) {
        try {
            System.out.println("Character at index " + str.length() + ": " + str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException! Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Generating Exception: ");
        try {
            generateException(input);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }
        System.out.println("Handling Exception: ");
        handleException(input);
        sc.close();
    }
}
