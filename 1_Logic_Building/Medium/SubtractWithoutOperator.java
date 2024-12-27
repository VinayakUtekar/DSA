import java.util.Scanner;

public class SubtractWithoutOperator {
    public static void Sub(int n){
        int m = 1;
        while (!((n & m) > 0)) 
        {
            n = n ^ m;
            m <<= 1;
        }
        n = n ^ m;
        System.out.println(n);
    }
    public static void Sub1(int n){
        System.out.println((n << 1) + (~n));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Sub(n);
        Sub1(n);
        sc.close();
    }
}
