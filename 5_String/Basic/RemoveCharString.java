import java.util.Scanner;

public class RemoveCharString {
    public static void Put(StringBuilder s, int n){
        s.deleteCharAt(n);
        System.out.println(s);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String g = sc.next();
        StringBuilder s = new StringBuilder(g);
        int n = sc.nextInt();
        System.out.println(s);
        Put(s,n);
        sc.close();
    }
}
