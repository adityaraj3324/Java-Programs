class TypeConversion {
    public static void main(String[] args) {

        int v1 = 11;
        double v2 = v1;
        System.out.println("Int to Double:");
        System.out.println("Original int value: " + v1);
        System.out.println("Converted to double: " + v2);


        double v3 = 11.99;
        int v4 = (int) v3;
        System.out.println("\nDouble to Int:");
        System.out.println("Original double value: " + v3);
        System.out.println("Converted to int: " + v4);
    }
}
