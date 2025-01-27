import java.util.Scanner;

public class PyrmidPrint {
    public static void Prit(int n){
        if(n==0)
            return;
        System.out.println("*");
        Prit(n-1);
    }
    public static void Patt(int n, int i){
        if(n==0)
            return
        Prit(i);
        System.out.println();
        Patt(n-1, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Patt(n,1);
        sc.close();
    }
}
