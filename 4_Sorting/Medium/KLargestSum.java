import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class KLargestSum {
    public static void Larg(int [] a, int k){
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum = sum + a[j];
                res.add(sum);
            }
        } 
        Collections.sort(res,Collections.reverseOrder());
        System.out.println(res.get(k-1));
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
