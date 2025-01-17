import java.util.Scanner;

public class FindCharInString {
    public static void Find(String s, char k){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == k){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        Find(s,c);
        sc.close();
    }
}
