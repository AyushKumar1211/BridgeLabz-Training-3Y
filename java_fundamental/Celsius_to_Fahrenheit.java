import java.util.Scanner;
public class Celsius_to_Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in celcius: ");
        int n = sc.nextInt();
        System.out.println("Temperature in fahrenheit: "+ ((n * 9/5) + 32));
        sc.close();
    }
}
