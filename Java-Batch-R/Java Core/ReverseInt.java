
import java.util.Scanner;
class ReverseInt{
    public static void main(String[] args) {
        System.out.println("Enter a number to find reverse of it: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev,sum=0;
        while(n!=0){
            rev = n%10;
            sum = sum*10 + rev;
            n=n/10;
        }
        System.out.println("Reverse number: " +sum);
    }
}