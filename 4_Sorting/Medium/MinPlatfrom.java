import java.util.Scanner;

public class MinPlatfrom{
    public static void Plat(int [] a, int [] a2, int n){
        int pla = 1, res = 1;
        for (int i = 0; i < a2.length; i++) {
            pla = 1;
            for (int j = 0; j < a2.length; j++) {
                if(i!=j){
                    if(a[i] >= a[j] && a2[j] >= a[i]){
                        pla++;
                    }
                }
            }
            res = Math.max(pla, res);
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int [] a2 = new int[n];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }
        Plat(a, a2, n);
        sc.close();
    }
}