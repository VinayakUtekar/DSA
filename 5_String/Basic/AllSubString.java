import java.util.Scanner;

public class AllSubString {
    public static void Subs(String s){
        for (int i = 0; i < s.length(); i++) {
            String se = "" + s.charAt(i);
            System.out.println(se);
            for (int j = i+1; j < s.length(); j++) {
                se = se + s.charAt(j);
                System.out.println(se);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Subs(s);
        sc.close();
    }
}
