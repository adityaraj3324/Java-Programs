import java.util.*;
class NumberGuess {
    public static void main(String[] args) {
        Random r = new Random();
        int num1 = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a random number between 1 to 100: ");


        int num2 = sc.nextInt();
        System.out.println("Guessed Number: " + num2);

        while (num2 != num1) {
            if (num2 < num1) {
                System.out.println("Your guess is too low. Try again.");
            } else if (num2 > num1) {
                System.out.println("Your guess is too high. Try again.");
            }
            num2 = sc.nextInt();
        }

        System.out.println("Yay! You guessed it right.\nRandom Number: " + num1 + "\nGuessed Number: " + num2);
    }
}