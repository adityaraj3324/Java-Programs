
import java.util.*;
class SqrtApprx{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its square root: ");
        int num = sc.nextInt();

        int g = num / 2;
        int bG;

        while (true) {
            bG = (g + num / g) / 2;

            if (g == bG) {
                break;
            }

            g = bG;
        }

        System.out.println("Approximate square root (ignoring decimal): " + g);
    }
}
