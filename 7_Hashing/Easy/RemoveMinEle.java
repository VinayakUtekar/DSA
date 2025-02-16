
import java.util.HashMap;
import java.util.Scanner;

public class RemoveMinEle {
    public static void Min(int [] a, int [] a2){
        int res = 0;
        HashMap<Integer, Integer> mp1 = new HashMap<>();
        HashMap<Integer, Integer> mp2 = new HashMap<>();
        for (int i : a) {
            mp1.put(i, mp1.getOrDefault(i, 0)+1);
        }
        for (int i : a2) {
            mp2.put(i, mp2.getOrDefault(i, 0)+1);
        }
        for(int i : mp1.keySet()){
            if(mp2.containsKey(i)){
                res = res + Math.min(mp1.get(i),mp2.get(i));
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int [] a2 = new int[n2];
        for(int i=0; i<n2; i++){
            a2[i] = sc.nextInt();
        }
        Min(a,a2);
        sc.close();
    }
}