import java.util.Scanner;

public class PrimeNumer {
    public static void Prime(int n){
        int c = 2;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                c++;
            }
        }
        if(n==1){
            System.err.println("Neither Prime Nor Constant");
        }
        else if(n==2){
            System.err.println("Prime");
        }
        else if(c==2){
            System.err.println("Prime");
        }
        else{
            System.out.println("Constant");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Prime(n);
        sc.close(); 
    }
}
