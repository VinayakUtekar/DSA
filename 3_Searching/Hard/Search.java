import java.util.Scanner;

public class Search {
    public static void Find(int [] a, int t){
        for (int i = 0; i < a.length; i++) {
            if(a[i]==t){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        Find(a,t);
        sc.close();
    }
}
