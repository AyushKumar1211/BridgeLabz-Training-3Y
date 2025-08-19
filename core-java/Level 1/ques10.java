import java.util.Scanner;

public class ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height in cm: ");
        int cm = sc.nextInt();
        double inches = (cm/2.54);
        double foot = Math.floor(inches/12);
        double remInches = inches%12;
        System.out.println("Your Height in cm is "+cm+" while in feet is "+foot+" and inches is "+remInches);
        sc.close();
    }
}
