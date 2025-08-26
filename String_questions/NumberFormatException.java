import java.util.Scanner;

public class NumberFormatException {
    static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }
    static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        }
        catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException! Message: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Caught NumberFormatException! Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (or invalid text to cause exception): ");
        String input = sc.nextLine();
        System.out.println("Generating Exception: ");
        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }
        System.out.println("Handling Exception: ");
        handleException(input);
        sc.close();
    }
}