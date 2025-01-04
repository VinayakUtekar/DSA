import java.util.ArrayList;
import java.util.Scanner;

public class ClosestQuadriple {
    public static void Quad(int []a, int t){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> s = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                for (int j2 = j+1; j2 < a.length; j2++) {
                    for (int k = j2+1; k < a.length; k++) {
                        int sum = a[i] + a[j] + a[j2] + a[k];
                        ArrayList<Integer> f = new ArrayList<>();
                        f.add(a[i]);
                        f.add(a[j]);
                        f.add(a[j2]);
                        f.add(a[k]);
                        res.add(f);
                        s.add(Math.abs(sum-t));
                    }
                }
            }
        }
        int i=0, min=s.get(i),r=0;
        for (int j : s) {
            if(min>j){
                min = j;
                r=i;
            }
            i++;
        }
        System.err.println(res.get(r));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        Quad(a,t);
        sc.close();
    } 
}