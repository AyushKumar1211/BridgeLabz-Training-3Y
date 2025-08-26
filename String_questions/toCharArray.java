import java.util.Arrays;
import java.util.Scanner;

public class toCharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        char[] user_defined = userMethod(str);
        char[] built_in = BuiltInMethod(str);
        System.out.println(java.util.Arrays.toString(user_defined));
        System.out.println(java.util.Arrays.toString(built_in));
        System.out.println(compare(user_defined,built_in));
        sc.close();
    }   
    static char[] userMethod(String str){
        char[] ans = new char[str.length()];
        for(int i=0;i<str.length();i++){
            ans[i] = str.charAt(i);
        }
        return ans;
    }
    static char[] BuiltInMethod(String str){
        char[] ans = str.toCharArray();
        return ans;
    }
    static boolean compare(char[] user_defined, char[] built_in){
        return Arrays.equals(user_defined, built_in);
    }
}
