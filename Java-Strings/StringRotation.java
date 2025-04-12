class StringRotation{
    public static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String concatenated = str1 + str1;

        return concatenated.contains(str2);
    }

    public static void main(String[] args) {
        String str1 = "aditya";
        String str2 = "aditay";

        if (isRotation(str1, str2)) {
            System.out.println("Yes, it is a rotation.");
        } else {
            System.out.println("No, it is not a rotation.");
        }
    }
}
