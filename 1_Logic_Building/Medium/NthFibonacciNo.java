import java.util.Scanner;

public class NthFibonacciNo {
    public static void fibonaci(int n){
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int sum=a+b;
            a=b;
            b=sum;
        }
        System.err.println(b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonaci(n);
        sc.close();
    }
}
