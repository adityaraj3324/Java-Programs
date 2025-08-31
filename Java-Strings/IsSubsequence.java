import java.util.*;

public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
        char[] str = t.toCharArray();
        char[] target = s.toCharArray();
        int i = 0;

        for (int j = 0; j < str.length && i < target.length; j++) {
            if (target[i] == str[j]) {
                i++;
            }
        }
        return i == target.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter subsequence string (s): ");
        String s = sc.nextLine();

        System.out.print("Enter main string (t): ");
        String t = sc.nextLine();

        boolean result = isSubsequence(s, t);
        System.out.println("Is \"" + s + "\" a subsequence of \"" + t + "\"? " + result);

        sc.close();
    }
}
