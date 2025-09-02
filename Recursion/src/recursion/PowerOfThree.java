package recursion;
public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n == 1) return true;
        if (n <= 0 || n % 3 != 0) return false;

        return isPowerOfThree(n / 3);
    }

    public static void main(String[] args) {
        PowerOfThree obj = new PowerOfThree();

        int[] testNumbers = {1, 3, 9, 12, 27, 45, 81, 100, 243};

        for (int num : testNumbers) {
            System.out.println(num + " is power of three? " + obj.isPowerOfThree(num));
        }
    }
}
