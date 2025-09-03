public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String res = "";
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            String odd = isPalindrome(s, i, i);
            String even = isPalindrome(s, i, i + 1);
            if (maxLen < odd.length()) {
                maxLen = odd.length();
                res = odd;
            }
            if (maxLen < even.length()) {
                maxLen = even.length();
                res = even;
            }
        }
        return res;
    }

    public String isPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring obj = new LongestPalindromicSubstring();
        String[] testStrings = {"babad", "cbbd", "a", "ac", "racecar", "abba", "abcd"};

        for (String str : testStrings) {
            System.out.println("String: " + str + " → Longest Palindromic Substring: " + obj.longestPalindrome(str));
        }
    }
}
