import java.util.Scanner;

public class MeanOfArray {
    public static float Mean(int [] a, int n){
        if(n == 1){
            return (float)a[n-1];
        }
        else{
            return ((float)(Mean(a, n-1)*(n-1) + a[n-1]) / n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int [] n = new int[l];
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        float m = Mean(n, n.length);
        System.out.println(m);
        sc.close();
    }
}
