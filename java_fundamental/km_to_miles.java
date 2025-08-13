import java.util.Scanner;

public class km_to_miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in Kilometers: ");
        int km = sc.nextInt();
        System.out.println(km*0.621371+" miles");
        sc.close();
    }
}
