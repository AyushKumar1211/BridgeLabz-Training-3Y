import java.util.Scanner;

public class nullPointer {
    static void generateException() {
        String text = null;
        System.out.println("Length of text: " + text.length());
    }
    static void handleException() {
        String text = null;
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException! Message: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        System.out.println("Generating Exception: ");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }
        System.out.println("Handling Exception:");
        handleException();
    }
}
