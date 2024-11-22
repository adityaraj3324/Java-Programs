class RotateArray{
    public static int[] rotateArray(int arr[],int k){
        k %= arr.length;
        
        revArr(arr,0,k-1);
         revArr(arr,k,arr.length-1);
       arr = revArr(arr,0,arr.length-1);
        return arr;
    }
    public static int[] revArr(int arr[],int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7};
        arr = rotateArray(arr,3);
        for(int val: arr){
        System.out.print(val+" ");
        }
    }
}