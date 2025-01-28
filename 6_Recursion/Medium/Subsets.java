import java.util.ArrayList;
import java.util.Scanner;

public class Subsets {
    public static void Pri(int [] a){
        int r [] = new int[a.length-1];
        System.out.println(a[0]);
        ArrayList<Integer> af = new ArrayList<>();
        af.add(a[0]);
        for (int i = 1; i < a.length; i++) {
            af.add(a[i]);
            System.out.println(af.toString());
        }
        for (int i = 0; i < r.length; i++) {
            r[i] = a[i+1];
        }
        if(a.length !=1){
            Pri(r);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Pri(a);
        sc.close();
    }
}
