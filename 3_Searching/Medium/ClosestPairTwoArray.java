import java.util.ArrayList;
import java.util.Scanner;

public class ClosestPairTwoArray {
    public static void Find(int [] a, int [] a2, int t){
        ArrayList<Integer> s = new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                int sum = a[i] + a2[j];
                ArrayList<Integer> se = new ArrayList<>();
                s.add(Math.abs(sum-t));
                se.add(a[i]);
                se.add(a[j]);
                res.add(se);
            }
        }
        for (int i = 0; i < s.size(); i++) {
            for (int j = i+1; j < s.size(); j++) {
                if(s.get(i)>=s.get(j)){
                    int temp = s.get(i);
                    s.set(i, s.get(j));
                    s.set(j, temp);

                    ArrayList<Integer> temp2 = res.get(i);
                    res.set(i, res.get(j));
                    res.set(j, temp2);
                }
            }
        }
        System.out.println(res.get(0));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int [] arr2 = new int [n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        Find(arr, arr2, t);
        sc.close();
    }
}
