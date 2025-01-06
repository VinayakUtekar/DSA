import java.util.Scanner;

public class CeilingSorted {
    public static void Ceil(int [] a, int x){
        int ceil = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] >= x){
                ceil = a[i];
                break;
            }
        }
        System.out.println(ceil);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        Ceil(a,x);
        sc.close();
    }
}
