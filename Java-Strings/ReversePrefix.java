import java.util.*;

public class ReversePrefix {
    public String reversePrefix(String word, char ch) {
        char arr[] = word.toCharArray();
        int index = word.indexOf(ch);
        if (index == -1) return word;
        for (int k = 0, j = index; k < j; k++, j--) {
            char temp = arr[k];
            arr[k] = arr[j];
            arr[j] = temp;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        ReversePrefix obj = new ReversePrefix();
        String result = obj.reversePrefix(word, ch);
        System.out.println("Result after reversing prefix: " + result);

        sc.close();
    }
}
