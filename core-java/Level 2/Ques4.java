import java.util.*;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Distance in feets: ");
        double foot = sc.nextInt();
        double yards = foot/3;
        double miles = yards/1760;
        System.out.println("The distance "+foot+" feet is "+yards+" yards or "+miles+" miles");
        sc.close();
    }   
}
