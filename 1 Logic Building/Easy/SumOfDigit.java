package 1 Logic Building.Easy;
import java.util.Scanner;

public class SumOfDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Suma(n);
        sc.close();
    }

    public static void Suma(int n){
        int sum = 0;
        while(n!=0){
            int d = n % 10;
            sum = sum + d;
            n = n / 10;
        }
        System.out.println(sum);
    }
    
}