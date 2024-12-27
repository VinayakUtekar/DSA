import java.util.Scanner;

public class PerfectNumber {
    public static void Perfect(int n){
        int sum = 1;
        for(int i=2; i<=n/2; i++){
            if(n%i == 0){
                sum  = sum + i;
            }
        }
        if(sum == n){
            System.out.println("Pefect");
        }
        else{
            System.out.println("Not Perfect");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Perfect(n);
        sc.close();
    }
}
