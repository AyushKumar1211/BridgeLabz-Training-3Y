import java.util.Scanner;
public class ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();
        double miles = (km/1.6);
        System.out.println("The total miles is "+miles+" mile for the given "+km+" km");
        sc.close();
    }
}
