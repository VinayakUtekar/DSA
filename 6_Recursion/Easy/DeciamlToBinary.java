import java.util.Scanner;

public class DeciamlToBinary {
    public static int Decimal(int n){
        if(n == 0){
            return 0;
        }
        else{
            return (n%2+10*Decimal(n/2)); 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Decimal(n));
        sc.close();
    }
}
