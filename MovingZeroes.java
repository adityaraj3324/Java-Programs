import java.util.*;
public class MovingZeroes{
   public static int[] movingZeroes(int arr[]){
       int n = arr.length;
       int nonZero=0;
       for(int i=0;i<n;i++){
           if(arr[i]!=0){
               nonZero++;
           }
       }
       int temp[] = new int[nonZero];
       int k=0;
       for(int i=0;i<n;i++){
           if(arr[i]!=0){
               temp[k]=arr[i];
               k++;
           }
       }
       for(int i=0;i<n;i++){
           if(i<k){
               arr[i]=temp[i];
           }
           else{
               arr[i]=0;
           }
       }
       return arr;
   }

    public static  void main(String []args){
        int arr[] = {1,0,2,0,0,3,4,0};
        int[] arr1= movingZeroes(arr);
        for(int i=0;i< arr1.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
