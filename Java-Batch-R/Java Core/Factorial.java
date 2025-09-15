import java.util.Scanner;
class Factorial{
    public static void main(String[] args) {
        System.out.println("Enter a number to find factorial: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact=1,i=1;
        while(i<=n){
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial " +fact);
    }
}