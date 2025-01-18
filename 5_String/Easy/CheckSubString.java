import java.util.Scanner;

public class CheckSubString {
    public static void Sub(String s ,String su){
        int n = s.length();
        int m = su.length();
        for (int i = 0; i <= n-m; i++) {
            int j2;
            for (j2 = 0; j2 < m; j2++) {
                if(s.charAt(i+j2)!=su.charAt(j2)){
                    break;
                }
            }
            if(j2 == m){
                System.out.println(i);
            }
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String su = sc.next();
        Sub(s, su);
        sc.close();
    }
}
