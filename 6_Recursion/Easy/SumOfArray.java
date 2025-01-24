import java.util.Scanner;

public class SumOfArray{
    public static int Sum(int [] a, int n){
        if(n == 1){
            return a[n-1];
        }
        else{
            return (Sum(a, n-1) + a[n-1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int su = Sum(a, n);
        System.out.println(su);
        sc.close();
    }
}