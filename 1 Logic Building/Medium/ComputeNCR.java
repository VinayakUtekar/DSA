import java.util.Scanner;

public class ComputeNCR {
    public static int Fact(int n){
        int f = 1;
        for (int i = 1; i <=n; i++) {
            f  = f*i;
        }
        return f;
    }
    public static void Compute(int n, int r){
        int n1 = Fact(n);
        int r1 = Fact(r);
        int nr = Fact(n-r);
        int div = r1*nr;
        int ans = n1/div;
        System.out.println("Compute : " + ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        Compute(n,r);
        sc.close();
    }
}
