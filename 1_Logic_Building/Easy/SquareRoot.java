import java.util.Scanner;

public class SquareRoot {
    public static int Root(int n){
        int res = 1;
        while(res * res <= n){
            res++;
        }

        return res-1;
    }
    public static int Root2(int n){
        int res = (int)Math.sqrt(n);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Root(n));
        System.out.println(Root2(n));
        sc.close();
    }   
}
