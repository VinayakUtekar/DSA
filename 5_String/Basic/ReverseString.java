import java.util.Scanner;

public class ReverseString {
    public static void Rev(String s){
        String ans = "";
        for (int i = s.length()-1; i >=0; i--) {
            ans = ans + s.charAt(i);
        }
        System.out.println(ans);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s);
        Rev(s);
        sc.close();
    }
}
