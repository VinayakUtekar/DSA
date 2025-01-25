import java.util.Scanner;
public class ReverseFibonacci {
   public static void Fibo(int a, int b, int n){
        if(n>0){
            Fibo(b,a+b,n-1);
            System.out.print(a + " ");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fibo(0,1,n);
        sc.close();
    }
}
