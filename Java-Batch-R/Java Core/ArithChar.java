public class ArithChar{
    public static void main(String[] args) {

        char letter = 'A';

        System.out.println("Original char value: " + letter);

        letter++;
        System.out.println("After incrementing: " + letter);

        letter--;
        System.out.println("After decrementing: " + letter);

        letter = (char) (letter + 5);
        System.out.println("After adding 5: " + letter);

        letter = (char) (letter - 3);
        System.out.println("After subtracting 3: " + letter);
    }
}