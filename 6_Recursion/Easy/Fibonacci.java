import java.util.Scanner;

public class Fibonacci {
    public static void Fibo(int a, int b, int n){
        int c = a+b;
        System.out.print(c + " ");
        if(n!=1){
            Fibo(b,c,n-1);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b =1;
        System.out.print(a + " " + b + " ");
        Fibo(a,b,n-2);
        sc.close();
    }
}
