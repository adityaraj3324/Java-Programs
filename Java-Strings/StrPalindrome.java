class StrPalindrome{
    public static void main(String[] args) {
        System.out.println("String comparison:");
        String str = "a";
        boolean isPalindrome = true;
        for(int i=0;i<str.length()/2;i++){
                if(str.charAt(i)!=str.charAt(str.length() - 1 -i)){
                    isPalindrome=false;
                    System.out.println("Not palindrome");
                    break;
                }
        }
        if(isPalindrome){
                System.out.println("Palindrome");
        }
    }
}