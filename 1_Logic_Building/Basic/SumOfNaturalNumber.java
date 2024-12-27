import java.util.Scanner;

public class SumOfNaturalNumber {
    //Method 1
    public static int Sum(int n){
        int sum = 0;
        for(int i=0; i<=n;i++){
            sum = sum + i;
        }
        return sum;
    }
    //Method 2
    public static int Sum2(int n){
        int sum = n * (n+1) / 2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Sum(n));
        System.out.println(Sum2(n));
        sc.close();
    }
}
