class SubStrPalindrome{
    public static boolean palindromeCheck(String str){
        boolean isPalindrome = true;
        for(int i=0;i<str.length()/2;i++){
                if(str.charAt(i)!=str.charAt(str.length() - 1 -i)){
                    isPalindrome=false;
                    break;
                }
        }
        return isPalindrome;
    }
    public static void main(String[] args) {
        System.out.println("String comparison:");
        String str = "nitin";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String str1 = str.substring(i,j);
                boolean isPalindrome = palindromeCheck(str1);
                if(isPalindrome){
                    System.out.print(str1+" ");
                }
            }
        System.out.println();
    }
}
}