import java.util.Scanner;
public class LowerCase {
    static String convertToLower(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));
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
        String userDefinedLower = convertToLower(input);
        String builtInLower = input.toLowerCase();
        boolean isEqual = compareStrings(userDefinedLower, builtInLower);
        System.out.println("\nUser-defined lowercase: " + userDefinedLower);
        System.out.println("Built-in lowercase:    " + builtInLower);
        System.out.println("Are both equal? " + isEqual);

        sc.close();
    }
}