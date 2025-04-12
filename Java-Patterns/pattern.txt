/*1. even number:

import java.util.*;
class Pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();
        int num;
        for(int i =1;i<=row;i++){
            num=0;
            for(int j=1;j<=col;j++){
                num += 2;
                 System.out.print(num+ " ");
            }
             System.out.print("\n");
        }
    }
}
------------------------------------------------------------------------------------------------------------
2. odd number: 
*/
import java.util.*;
class Pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();
        int num;
        for(int i =1;i<=row;i++){
            num=1;
            for(int j=1;j<=col;j++){
                
                 System.out.print(num+ " ");
                 num += 2;
            }
             System.out.print("\n");
        }
    }
}
/* ------------------------------------------------------------------------------------------------------
3. all odd : 
import java.util.*;
class Pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();
        int num=1;
        for(int i =1;i<=row;i++){
            for(int j=1;j<=col;j++){
                
                 System.out.print(num+ " ");
                 num += 2;
            }
             System.out.print("\n");
        }
    }
}
----------------------------------------------------------------------------------------------------
4. all even :

import java.util.*;
class Pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();
        int num=2;
        for(int i =1;i<=row;i++){
            for(int j=1;j<=col;j++){
                
               System.out.print(num+ " ");
                 num += 2;
            }
             System.out.print("\n");
        }
    }
}
*/