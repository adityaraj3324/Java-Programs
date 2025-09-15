import java.util.Scanner;
class SumDigits{
    public static void main(String[] args) {
        System.out.println("Enter a number to find sum of its digits: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev,sum=0,temp=n;
        while(n!=0){
            rev = n%10;
            sum = sum + rev;
            n=n/10;
        }

        System.out.println("The sum of digits of the number: "+sum);
    }
}