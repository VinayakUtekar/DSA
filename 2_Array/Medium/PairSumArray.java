import java.util.Scanner;

public class PairSumArray {
    public static void Arr(int [] a, int s){
        int [] ar = new int[s];
        ar[0] = (a[0]+a[1]-a[s-1]) / 2;
        for (int i=1; i<s; i++)
            ar[i] = a[i-1]-ar[0];
        for (int i : ar) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int s = sc.nextInt();
        Arr(a,s);
        sc.close();
    }
}
