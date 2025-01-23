import java.util.*;

public class LongestBalancedSubsequence {

    public static int longestBalancedSubsequence(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = 0; 
        }

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;

                if (s.charAt(i) == '(' && s.charAt(j) == ')') {
                    // If the substring forms a valid pair
                    dp[i][j] = Math.max(dp[i][j], 2 + dp[i + 1][j - 1]); 
                }

                for (int k = i; k < j; k++) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][k] + dp[k + 1][j]);
                }
            }
        }

        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        String s1 = "()())";
        String s2 = "()(((((()";

        System.out.println("Longest Balanced Subsequence for " + s1 + ": " + longestBalancedSubsequence(s1));
        System.out.println("Longest Balanced Subsequence for " + s2 + ": " + longestBalancedSubsequence(s2));
    }
}