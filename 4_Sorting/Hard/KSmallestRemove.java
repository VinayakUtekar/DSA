import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KSmallestRemove {
    public static void Min(int [] a, int k){
        ArrayList<Integer> re = new ArrayList<>();
        for (int i = k; i < a.length; i++) {
            re.add(a[i]);
        }
        Collections.sort(re);
        System.out.println(re.get(0));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        Min(a,t);
        sc.close();
    }   
}