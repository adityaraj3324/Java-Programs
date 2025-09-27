
import java.util.Scanner;
class Pattern1{
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter "+size+" numbers from 0 - 9: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int max =  max(arr);
        for(int i = 0;i<size;i++){
            for(int j=0;j<max;j++){
               if(max - j <= arr[i])
                System.out.print("*");
                else
                 System.out.print(" ");
            }
            System.out.println();
        }
    }
       static int max(int arr[]){
        int max = arr[0];
        for(int i=0;i<arr.length;i++)
        if(max<arr[i])
        max = arr[i];
        return max;
    }
}