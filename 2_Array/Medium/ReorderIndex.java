import java.util.Scanner;

public class ReorderIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        int [] a = new int[nu];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int [] a2 = new int[nu];
        for (int i = 0; i < a.length; i++) {
            a2[i] = sc.nextInt();
        }
        
        Order(a, a2);
        sc.close();
    }
}