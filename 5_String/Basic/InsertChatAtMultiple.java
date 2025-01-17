import java.util.Scanner;

public class InsertChatAtMultiple {
    public static void Put(String s, char c, int [] n){
        String ans = "";
        int j=0;
        for (int i = 0; i < s.length(); i++) {
            if(j<n.length && i == n[j]){
                ans = ans + c;
                j++;
            }
            ans = ans + s.charAt(i);
        }
        System.out.println(ans);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        int a = sc.nextInt();
        int [] n = new int[a];
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        System.out.println(s);
        Put(s,c,n);
        sc.close();
    }
}
