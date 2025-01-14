import java.util.ArrayList;
import java.util.Scanner;

public class FourSumClosest {
    public static void Three(int [] a, int t){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> sum = new ArrayList<>();
        for(int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                for (int j2 = j+1; j2 < a.length; j2++) {
                    for(int k = j2+1; k<a.length; k++){
                        ArrayList<Integer> d = new ArrayList<>();
                        d.add(a[i]);
                        d.add(a[j]);
                        d.add(a[j2]);
                        d.add(a[k]);
                        int s = a[i] + a[j] + a[j2] + a[k];
                        res.add(d);
                        sum.add(Math.abs(s-t));
                    }
                }
            }
        }
        int l = 0, min = sum.get(0);
        for (int i = 0; i < a.length; i++) {
            if(min > sum.get(i)){
                min = sum.get(i);
                l = i;
            }
        }
        System.out.println(res.get(l));
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
