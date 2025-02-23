import java.util.Scanner;

public class TwoSumClosest {
    public static void Find(int [] a){
        int res = a[0] + a[1];
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                int sum = a[i] + a[j];
                if(Math.abs(sum) < Math.abs(res)){
                    res = sum;
                }
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
        Find(arr);
        sc.close();
    }
}
