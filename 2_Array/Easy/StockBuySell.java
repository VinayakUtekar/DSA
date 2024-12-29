import java.util.Scanner;

public class StockBuySell {
    public static void Buy(int [] a){
        int res = 0;
        for (int i = 1; i < a.length; i++) {
            if(a[i] > a[i-1]){
                res = res + a[i]-a[i-1];
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Buy(arr);
        sc.close();
    }
}
