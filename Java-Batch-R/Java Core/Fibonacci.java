import java.util.Scanner;
class Fibonacci{
    public static void main(String[] args) {
        System.out.println("Enter a number to find its fibonacci sequence: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Fibonacci sequence: ");
        int f=0,s=1,t,i=1;
        while(i<=n){
            System.out.print(f+" ");
            t=f+s;
            f=s;
            s=t;
            i++;
        }
    }
}
