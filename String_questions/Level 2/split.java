import java.util.Scanner;
public class split { 
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }
    public static String[] customSplit(String str) {
        int len = getLength(str);
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }
        String[] words = new String[wordCount];
        int start = 0, wordIndex = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                words[wordIndex++] = str.substring(start, i);
                start = i + 1;
            }
        }
        words[wordIndex] = str.substring(start, len);
        return words;
    }
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        String[] builtInResult = input.split(" ");
        String[] customResult = customSplit(input);
        boolean isEqual = compareArrays(builtInResult, customResult);
        System.out.println("\nBuilt-in split() result:");
        for (String word : builtInResult) {
            System.out.println(word);
        }
        System.out.println("\nCustom split result:");
        for (String word : customResult) {
            System.out.println(word);
        }
        System.out.println("Do both results match? " + isEqual);
        sc.close();
    }
}
