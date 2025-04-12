import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        int count=0,sum1=0,sum2=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array1: ");
    int size1 = sc.nextInt();
     System.out.println("Enter "+size1+" elements of the array1: ");
     int arr1[] = new int[size1];
     //Inserting elements in the array1
     for(int i=0;i<size1;i++){
     arr1[i] = sc.nextInt();
     }
     System.out.println("Enter the size of an array2: ");
    int size2 = sc.nextInt();
     System.out.println("Enter "+size2+" elements of the array2: ");
     int arr2[] = new int[size2];
     //Inserting elements in the array2
     for(int i=0;i<size2;i++){
     arr2[i] = sc.nextInt();
     }
      //converting array values into a single number
      for(int i=0;i<size1;i++){
          sum1 = sum1*10 + arr1[i];
      }
      for(int i=0;i<size2;i++){
          sum2 = sum2*10 + arr2[i];
      }
      // Adding both array numbers 
      sum1= sum1+sum2;
      int rem,pal,temp = sum1;
      // Finding the new length of the array after the addition as count
      while(sum1!=0){
          rem=sum1%10;
          sum1 = sum1/10;
          count++;
      }
      int arr3[] = new int[count];
      int j = count-1;
      // Converting the sum into a new array 
       while(temp!=0){
          rem=temp%10;
          temp = temp/10;
          arr3[j]=rem;
          j--;
      }
      for(int val : arr3){
          System.out.print(val+" ");
      }
    }
}