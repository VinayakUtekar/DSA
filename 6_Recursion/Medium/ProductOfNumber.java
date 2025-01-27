import java.util.Scanner;

public class ProductOfNumber {
    public static int Mul(int n, int p){
        if(p==0){
            return 0;
        }
        else if(p==1){
            return n;
        }
        else{
            return n + Mul(n, p-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int res = Mul(n,p);
        System.out.println(res);
        sc.close();
    }
}
