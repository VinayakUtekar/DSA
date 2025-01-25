import java.util.Scanner;

public class SumOfDigits {
    public static int Sum(int n){
        if(n==0){
            return 0;
        }
        else{
            return n%10 + Sum(n/10);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int su = Sum(n);
        System.out.println(su);
        sc.close();
    }
}
