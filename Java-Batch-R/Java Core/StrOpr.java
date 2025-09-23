class StrOpr {
    public static void main(String[] args) {
        String a="My name is ";
        String b="Aditya";
        String d= a.concat(b);
        System.out.println("Concatenation : " + d);
        int c = a.length();
        System.out.println("String length : " + c);
        String sub = d.substring(11,17);
        System.out.println("Substring: "+ sub);
    }
}