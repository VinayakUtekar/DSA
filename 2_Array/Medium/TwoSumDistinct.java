import java.util.ArrayList;
import java.util.Scanner;

public class TwoSumDistinct {
    public static void Two(int [] a, int t){
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if((a[i] + a[j]) == t){
                    if(a[i] < a[j]){
                        ArrayList<Integer> cur = new ArrayList<>();
                        cur.add(a[i]);
                        cur.add(a[j]);
                        if(!arr.contains(cur)){
                            arr.add(cur);
                        }
                    }
                    else{
                        ArrayList<Integer> cur = new ArrayList<>();
                        cur.add(a[j]);
                        cur.add(a[i]);
                        if(!arr.contains(cur)){
                            arr.add(cur);
                        }
                    }
                }
            }
        }
        for (ArrayList<Integer> av : arr) {
            System.out.print(av + " ");
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
        Two(a,t);
        sc.close();
    }
}
