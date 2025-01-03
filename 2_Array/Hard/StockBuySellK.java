import java.util.Scanner;

public class StockBuySellK {
    public static void Stock(int [] a, int k){
        if (k >= a.length / 2) {
            int maxProfit = 0;
            for (int i = 1; i < n; i++) {
                if (a[i] > a[i - 1]) {
                    maxProfit += a[i] - a[i - 1];
                }
            }
            System.out.println(maxProfit);
        }

        int[][] dp = new int[k + 1][a.length];
        
        for (int t = 1; t <= k; t++) {
            int maxDiff = -a[0]; // max(dp[t-1][j] - price[j])
            for (int i = 1; i < a.length; i++) {
                dp[t][i] = Math.max(dp[t][i - 1], a[i] + maxDiff);
                maxDiff = Math.max(maxDiff, dp[t - 1][i] - a[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Stock(a,k);
        sc.close();
    }
}
