package recursion;

public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if (n == 1) return true;
        if (n <= 0 || n % 4 != 0) return false;
        return isPowerOfFour(n / 4);
    }

    public static void main(String[] args) {
        PowerOfFour obj = new PowerOfFour();
        int[] testNumbers = {1, 2, 4, 8, 16, 32, 64, 100, 256};

        for (int num : testNumbers) {
            System.out.println(num + " is power of four? " + obj.isPowerOfFour(num));
        }
    }
}

