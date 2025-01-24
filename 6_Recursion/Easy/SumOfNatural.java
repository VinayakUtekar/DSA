import java.util.Scanner;

public class SumOfNatural {
    public static int Sum(int n){
        if(n > 0){
            return n + Sum (n-1);
        }
        else{
            return n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int su = Sum(n);
        System.out.println(su);
        sc.close();
    }
}
