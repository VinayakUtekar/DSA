import java.util.Scanner;

public class MinMaxArray {
    public static int Mini(int [] a, int n){
        if(n==1){
            return a[0];
        }
        return Math.min(a[n-1], Mini(a, n-1));
    }
    public static int Maxi(int [] a, int n){
        if(n==1){
            return a[0];
        }
        return Math.max(a[n-1], Maxi(a, n-1));
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i <n; i++) {
            a[i] = sc.nextInt();
        }
        int mi = Mini(a,n);
        int ma = Maxi(a,n);
        System.out.println(mi + " " + ma);
        sc.close();
    }
}
