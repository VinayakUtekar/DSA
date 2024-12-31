import java.util.Scanner;

public class ReorderIndex {
    public static void Order(int [] a1, int[] a2){
        int [] a3 = new int[a1.length];
        for (int index = 0; index < a2.length; index++) {
            int j = a2[index];
            a3[j] = a1[index];
        }
        for (int i : a3) {
            System.out.print( i + " ");
        }
    }
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