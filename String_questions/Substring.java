import java.util.Scanner;
public class Substring{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the String: ");
      String str = sc.nextLine();
      System.out.println("Enter the Starting and Ending Index of substring: ");
      int start = sc.nextInt();
      int end = sc.nextInt();
      String char_At  = "";
      for(int i = start;i<end;i++){
        char_At=char_At+str.charAt(i);
      }
      String built_in = str.substring(start,end);
      if(char_At.equals(built_in)){
        System.out.println(true);
      }
      sc.close();  
    }
}