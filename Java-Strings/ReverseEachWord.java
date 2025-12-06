public class ReverseEachWord {

        public static void main(String[] args) {
            String str = "java code";
            String arr[] = str.split(" ");

            int length = arr.length;
            StringBuilder a[] = new StringBuilder[length];


            for(int i=0;i<length;i++){
                a[i] = new StringBuilder(arr[i]);
                a[i].reverse();
            }
            for(StringBuilder val : a)
                System.out.println(val);
        }
    }

