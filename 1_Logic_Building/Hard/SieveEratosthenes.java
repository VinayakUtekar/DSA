import java.util.Scanner;

public class SieveEratosthenes{
    public static void Sieve(int n){
        for (int i = 0; i <=n; i++) {
            int count = 2;
            for (int j = 2; j <= i/2 ; j++) {
                if(i%j==0){
                    count++;
                }
            }
            if(count==2 && i!=0 && i!=1){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Sieve(n);
        sc.close();
    }
}