import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ThreeSumDistinct {
    public static void Three(int [] a, int t){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                for (int j2 = j+i; j2 < a.length; j2++) {
                    if((a[i] + a[j] + a[j2]) == t){
                        ArrayList<Integer> d = new ArrayList<>();
                        d.add(a[i]);
                        d.add(a[j]);
                        d.add(a[j2]);
                        Collections.sort(d);
                        if(!res.contains(d)){
                            res.add(d);
                        }
                    }
                }
            }
        }
        for (ArrayList<Integer> h : res) {
            System.out.print(h + " ");
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
        Three(a,t);
        sc.close();
    }
}
