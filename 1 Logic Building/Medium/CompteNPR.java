import java.util.Scanner;

public class CompteNPR {
     public static int Fact(int n){
        int f = 1;
        for (int i = 1; i <=n; i++) {
            f  = f*i;
        }
        return f;
    }
    public static void Compute(int n, int r){
        int n1 = Fact(n);
        int nr = Fact(n-r);
        int ans = n1/nr;
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
