package recursion;
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {

    	if (n == 1) return true;
        if (n <= 0 || n % 2 != 0) return false;

        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {
        PowerOfTwo obj = new PowerOfTwo();

        int[] testNumbers = {1, 2, 3, 4, 8, 16, 18, 32, 64, 100};

        for (int num : testNumbers) {
            System.out.println(num + " is power of two? " + obj.isPowerOfTwo(num));
        }
    }
}
