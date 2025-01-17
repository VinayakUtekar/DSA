import java.util.Scanner;

public class RemoveAllChar {
    public static void Dlt(String s, char c){
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char g = s.charAt(i);
            if(g!= c){
                ans = ans + s.charAt(i);
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(s);
        Dlt(s,c);
        sc.close();
    }
}
