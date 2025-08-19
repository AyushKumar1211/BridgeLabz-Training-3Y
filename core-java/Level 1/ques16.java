import java.util.Scanner;

public class ques16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();
        int max = ((n*(n-1))/2);
        System.out.println("The number of maximum possible Handshakes is "+max);
        sc.close();
    }
}
