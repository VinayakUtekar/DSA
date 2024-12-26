import java.util.Scanner;

public class GCD {
    public static int GC(int n, int m){
        int d = 0;
        for (int i = 1; i < n; i++) {
            if(n%i==0 && m%i==0){
                if(d < i){
                    d = i;
                }
            }
        }
        return d;
    }
    public static int GC2(int n, int m){
        if(n==m){
            return n;
        }
        else if(n>m){
            return GC(n-m, m);
        }
        else{
            return GC(n, m-n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(GC(n,m));
        System.out.println(GC2(n,m));
    }
}
