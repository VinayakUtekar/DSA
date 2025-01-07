import java.util.Scanner;

public class LargestSumPair {
    public static void Sum(int [] a){
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                int sum = a[i] + a[j];
                if(sum > max){
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        int [] a = new int[nu];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Sum(a);
        sc.close();
    }
}
