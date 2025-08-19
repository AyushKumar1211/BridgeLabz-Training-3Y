import java.util.Scanner;
public class Ques2 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of base in cm: ");
        double baseCM = sc.nextInt();
        System.out.println("Enter the Length of height in cm: ");
        double heightCM = sc.nextInt();
        double baseInches = baseCM/2.54;
        double heightInches = heightCM/2.54;
        double sqCM = (0.5*baseCM*heightCM);
        double sqInches = (0.5*baseInches*heightInches);
        System.out.println("The area of Triangle in Square in is "+sqInches+" and in Square CM is "+sqCM);
        sc.close();
   }
}
