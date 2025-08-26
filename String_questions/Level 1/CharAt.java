import java.util.Scanner;

public class CharAt{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two Strings: ");
        String s1  = sc.nextLine();
        String s2  = sc.nextLine();
        if(s1.length()!=s2.length()){
            System.out.println("The lengths of both string are not equal.");
        }
        else{
            System.out.println("Comparing by CharAt Method: ");
            int flag=0;
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    flag++;
                    break;
                }
            }
            if(flag>0){
                System.out.println(false);
            }
            else{
                System.out.println(true);
            }
            System.out.println("Comparing by equals() Method: ");
            System.out.println(s1.equals(s2));
        }
        sc.close();
    }
}