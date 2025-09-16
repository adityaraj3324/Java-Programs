
import java.util.Scanner;
class GCD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % temp;
            num1 = temp;
        }

        System.out.println("The GCD is: " + num1);
    }
}