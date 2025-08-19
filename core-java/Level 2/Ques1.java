import java.util.Scanner;
public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        int add = num1+num2;
        int sub = num1-num2;
        int mul = num1*num2;
        int div = num1/num2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+num1+" and "+num2+" is "+add+", "+sub+", "+mul+", and "+div);
        sc.close();
    }
}
