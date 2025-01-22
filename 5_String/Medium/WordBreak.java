import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordBreak {
    public static boolean canSegment(String s, Set<String> dictionary) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && dictionary.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Set<String> dictionary = new HashSet<>();
        dictionary.add("i");
        dictionary.add("like");
        dictionary.add("sam");
        dictionary.add("sung");
        dictionary.add("samsung");
        dictionary.add("mobile");
        dictionary.add("ice");
        dictionary.add("cream");
        dictionary.add("icecream");
        dictionary.add("man");
        dictionary.add("go");
        dictionary.add("mango");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(canSegment(input, dictionary) ? "Yes" : "No");
        sc.close();
    }
}
