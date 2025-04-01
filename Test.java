class Test{

    public static int countTarget(int arr[],int num,int index,int count){
        if(index==arr.length)
            return -1;
        if(arr[index]==num){
	        count++;
        }
        countTarget(arr,num,++index,count);
       return count;
    }
   public static void main(String[] args) {
        int arr[]={5, 3, 7, 8, 3, 9};
        System.out.print(countTarget(arr,3,0,0));
    }
}
