class RevStr{
    public static void main(String[] args) {
        String str = "The name is Bond.";
        char arr[] = str.toCharArray();
        char newArr[] = new char[arr.length];
        for(int i=0;i<str.length();i++){
            newArr[i]=arr[str.length()-1-i];
        }
        str = new String(newArr);
        System.out.println(str);
    }
}