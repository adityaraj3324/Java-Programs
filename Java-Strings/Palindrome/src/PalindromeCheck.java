import java.util.*;
public class PalindromeCheck {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char[] arr = A.toCharArray();
        int index= A.length();
        char[] arr1 = new char[index] ;
        for(int i=0;i<index;i++){
            arr1[i] = arr[index-i-1];
        }
        String B = new String(arr1);
        System.out.print(B);
        if(B.equals(A)){
            System.out.print("\nYes");
        }
        else{
            System.out.print("\nNo");

        }
    }
}



