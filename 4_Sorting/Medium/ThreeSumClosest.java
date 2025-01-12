import java.util.ArrayList;
import java.util.Scanner;

public class ThreeSumClosest {
    public static void Three(int [] a, int t){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                for (int j2 = j+1; j2 < a.length; j2++) {
                    int sum = (a[i] + a[j] + a[j2]);
                    ArrayList<Integer> g = new ArrayList<>();
                    g.add(a[i]);
                    g.add(a[j]);
                    g.add(a[j2]);
                    ar.add(Math.abs(sum-t));
                    res.add(g);
                }
            }
        }
        int min = Integer.MAX_VALUE;
        int d = 0;
        for (int i = 0; i < ar.size(); i++) {
            int n = ar.get(i);
            if(n < min){
                min = n;
                d = i;
            }
        }
        System.out.println(res.get(d));
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
