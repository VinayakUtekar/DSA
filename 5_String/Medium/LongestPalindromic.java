public public class LongestPalindromic {
    public static String longestPalindrome(String str) {
        if (str == null || str.length() < 1) {
            return "";
        }

        int start = 0, end = 0;

        for (int i = 0; i < str.length(); i++) {
            int len1 = expandAroundCenter(str, i, i);       // Odd-length palindrome
            int len2 = expandAroundCenter(str, i, i + 1);   // Even-length palindrome
            int maxLength = Math.max(len1, len2);

            if (maxLength > (end - start)) {
                start = i - (maxLength - 1) / 2;
                end = i + maxLength / 2;
            }
        }

        return str.substring(start, end + 1);
    }

    private static int expandAroundCenter(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        String str1 = "forgeeksskeegfor";
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(str1));

        String str2 = "Geeks";
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(str2));
    }
}
 {
    
}
