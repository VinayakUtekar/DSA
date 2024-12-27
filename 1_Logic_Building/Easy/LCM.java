import java.util.Scanner;

public class LCM {
    public static int GC2(int n, int m){
        if(n==0){
            return m;
        }
        return GC2(m%n, n);
    }
    public static int LC(int n, int m){
        return (n / GC2(n, m)) * m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(LC(n,m));
        sc.close();
    }
}
