import java.util.Scanner;

public class PrintNTo1{
    public static void Printl(int n){
        if(n > 0){
            System.out.print(n+" ");
            Printl(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Printl(n);
        sc.close();
    }
}