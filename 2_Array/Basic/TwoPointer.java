import java.util.Scanner;

public class TwoPointer {
    public static void Two(int [] a, int t){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]+a[j] == t){
                    System.out.println("YES " + a[i]+ " " + a[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        int [] a = new int[nu];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        Two(a,t);
        sc.close();
    }
}
