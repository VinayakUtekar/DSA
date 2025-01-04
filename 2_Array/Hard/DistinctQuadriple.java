import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DistinctQuadriple {
    public static void Quad(int []a, int t){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
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
                        Collections.sort(f);
                        if(sum==t && !res.contains(f)){
                            res.add(f);
                        }
                    }
                }
            }
        }
        for (ArrayList<Integer> i : res) {
            System.out.println(i + " ");
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
        Quad(a,t);
        sc.close();
    } 
}
