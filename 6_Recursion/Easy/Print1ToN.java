import java.util.Scanner;

public class Print1ToN{
    public static void Printl(int n){
        if(n > 0){
            Printl(n-1);
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Printl(n);
        sc.close();
    }
}