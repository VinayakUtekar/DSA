import java.util.Scanner;

public class ConcatenateStrings {
    public static void Cont(String [] se, int n){
        String ans = "";
        for (int i = 0; i < se.length; i++) {
            ans = ans+se[i];
        }
        System.out.println(ans);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] se = new String[n];
        for (int i = 0; i < se.length; i++) {
            se[i] = sc.next();
        }
        Cont(se,n);
        sc.close();
    }
}
