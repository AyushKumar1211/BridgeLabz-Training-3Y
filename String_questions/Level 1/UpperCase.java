import java.util.Scanner;

public class UpperCase {
    static String convertToUpper(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        String userDefinedUpper = convertToUpper(input);
        String builtInUpper = input.toUpperCase();
        boolean isEqual = compareStrings(userDefinedUpper, builtInUpper);
        System.out.println("\nUser-defined uppercase: " + userDefinedUpper);
        System.out.println("Built-in uppercase:    " + builtInUpper);
        System.out.println("Are both equal? " + isEqual);

        sc.close();
    }
}
