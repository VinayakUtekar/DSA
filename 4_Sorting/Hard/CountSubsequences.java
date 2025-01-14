import java.util.Scanner;
public class CountSubsequences {
    public static int countDistinctOccurrences(String txt, String pat) {
        int m = pat.length();
        int n = txt.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int j = 0; j <= n; j++) {
            dp[0][j] = 1;
        }
        for (int i = 1; i <= m; i++) {
            dp[i][0] = 0;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (pat.charAt(i - 1) == txt.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text (txt):");
        String txt = sc.nextLine();
        System.out.println("Enter the pattern (pat):");
        String pat = sc.nextLine();
        int result = countDistinctOccurrences(txt, pat);
        System.out.println("The count of distinct occurrences is: " + result);
        sc.close();
    }
}
