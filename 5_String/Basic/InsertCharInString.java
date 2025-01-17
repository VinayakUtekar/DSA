import java.util.Scanner;

public class InsertCharInString {
    public static void Put(StringBuilder s, char c, int n){
        s.insert(n, c);
        System.out.println(s);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String g = sc.next();
        StringBuilder s = new StringBuilder(g);
        char c = sc.next().charAt(0);
        int n = sc.nextInt();
        System.out.println(s);
        Put(s,c,n);
        sc.close();
    }
}
