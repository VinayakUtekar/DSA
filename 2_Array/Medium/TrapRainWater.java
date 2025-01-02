import java.util.Scanner;

public class TrapRainWater{
    public static void Trap(int []arr){
        int res = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            int left = arr[i];
            for (int j = 0; j < i; j++)
                left = Math.max(left, arr[j]);
            int right = arr[i];
            for (int j = i + 1; j < arr.length; j++)
                right = Math.max(right, arr[j]);
            res += Math.min(left, right) - arr[i];
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        int [] a = new int[nu];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Trap(a);
        sc.close();
    }
}