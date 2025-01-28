import java.util.Scanner;

public class NumberRaised{
    public static long Powe(int n, int r){
        long ans = 1;
        long mod = 1000000000 + 7;
        for (int i = 1; i <=r ; i++) {
            ans *= n;
            ans %= mod;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(Powe(n,r));
        sc.close();
    }
}