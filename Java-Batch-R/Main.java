import java.util.*;
class Main{
    public static void main(String []args){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1;i<=num;i++){
            for(int j = 1;j<=num;j++){
                if(i==1 || j==1 ||i+j==6){
                    System.out.print(" "+j);
                }
                else
                System.out.print("  ");
            }
            for(int j = num-1;j>0;j--){
                if(i==1 || j==1 ||i+j==6){
                    System.out.print(" "+j);
                }
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
