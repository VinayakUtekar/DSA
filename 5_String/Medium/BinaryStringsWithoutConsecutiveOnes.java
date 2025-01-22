import java.util.Scanner;

public class CountNoOf1 {
    public static int countBinaryStrings(int n) {
        if (n == 1) return 2;
        if (n == 2) return 3;

        int prev2 = 2;
        int prev1 = 3;
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return current;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countBinaryStrings(n));
        sc.close();
    }
}
