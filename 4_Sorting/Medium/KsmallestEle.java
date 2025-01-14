import java.util.Scanner;

public class KsmallestEle {
    public static void Larg(int [] a, int k){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        System.out.println(a[k]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        int [] a = new int[nu];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Larg(a,k);
        sc.close();
    }
}
