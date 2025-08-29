import java.util.*;

public class LenOfLastWord {
    public static int lengthOfLastWord(String s) {
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == ' ') {
                if (res > 0) 
                    return res; 
                else 
                    continue;  
            } else {
                res++;
            }
        }
        return res; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int len = lengthOfLastWord(input);
        System.out.println("Length of last word: " + len);

        sc.close();
    }
}
