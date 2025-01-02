import java.util.Scanner;

public class SmallSubArray {
    public static void Sum(int []a , int x) {
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            int curr = 0;
            for (int j = i; j < a.length; j++) {
                curr = curr + a[j];
                if(curr > x){
                    res = Math.min(res,j-i+1);
                    break;
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
        int m = sc.nextInt();
        Sum(a,m);
        sc.close();
    }
}
