import java.util.Scanner;
class ArraySum1{
    public static void main(String[] args) {
        int count=0,sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array: ");
    int size = sc.nextInt();
     System.out.println("Enter "+size+" elements of the array: ");
     int arr[] = new int[size];
     //Inserting elements in the array
     for(int i=0;i<size;i++){
     arr[i] = sc.nextInt();
     }
      System.out.println("Enter a number to add in the array: ");
      int num = sc.nextInt();
      //converting array values into a single number
      for(int i=0;i<size;i++){
          sum = sum*10 + arr[i];
      }
      // Adding array number with the given number
      sum= sum+num;
      int rem,pal,temp = sum;
      // Finding the new length of the array after the addition as count
      while(sum!=0){
          rem=sum%10;
          sum = sum/10;
          count++;
      }
      int arr1[] = new int[count];
      int j = count-1;
      // Converting the sum into a new array 
       while(temp!=0){
          rem=temp%10;
          temp = temp/10;
          arr1[j]=rem;
          j--;
      }
      for(int val : arr1){
          System.out.print(val+" ");
      }
    }
}