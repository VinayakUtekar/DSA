import java.util.Scanner;

public class StockBuySell2{
    public static void Stock(int [] a, int k){
        int n = a.length;
        if (k >= n / 2) {
            int maxProfit = 0;
            for (int i = 1; i < n; i++) {
                if (a[i] > a[i - 1]) {
                    maxProfit += a[i] - a[i - 1];
                }
            }
            System.out.println(maxProfit);
            return;
        }

        int[][] dp = new int[k + 1][a.length];
        
        for (int t = 1; t <= k; t++) {
            int maxDiff = -a[0]; // max(dp[t-1][j] - price[j])
            for (int i = 1; i < a.length; i++) {
                dp[t][i] = Math.max(dp[t][i - 1], a[i] + maxDiff);
                maxDiff = Math.max(maxDiff, dp[t - 1][i] - a[i]);
            }
        }
        System.out.println(dp[k][n-1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int k = 2;
        Stock(a,k);
        sc.close();
    }
}