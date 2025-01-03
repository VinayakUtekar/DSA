import java.util.Scanner;

public class MaxEquilibrium {
    public static void Max(int [] a){
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            int pre = 0;
            for (int j = 0; j < i; j++) {
                pre = pre + a[j];
            }
            int suf = 0;
            for (int j = i+1; j < a.length; j++) {
                suf = suf + a[j];
            }
            if(pre==suf){
                if(res < pre){
                    res = pre;
                }
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Max(a);
        sc.close();
    }
}
