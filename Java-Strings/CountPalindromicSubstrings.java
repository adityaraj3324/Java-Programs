public class CountPalindromicSubstrings {
    public int countSubstrings(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += countPal(s, i, i);
            res += countPal(s, i, i + 1);
        }
        return res;
    }

    public int countPal(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountPalindromicSubstrings obj = new CountPalindromicSubstrings();
        String[] testStrings = {"abc", "aaa", "racecar", "abba", "abcd"};

        for (String str : testStrings) {
            System.out.println("String: " + str + " → Palindromic substrings count: " + obj.countSubstrings(str));
        }
    }
}
