
import java.util.*;
class Collatz{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for the Collatz conjecture: ");
        int n = sc.nextInt();
        System.out.println("Collatz conjecture: ");
        while (n!=1) {
            if(n%2==0){
                n=n/2;
                System.out.println(n);
            }
            else{
                n=(n*3)+1;
                System.out.println(n);
            }
        }
    }
}
