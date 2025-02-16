import java.util.HashMap;
import java.util.Scanner;

public class CoutTwoSum {
    public static void Two(int [] a, int k){
        HashMap<Integer,Integer> h = new HashMap<>();
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(h.containsKey(a[i] - k)){
                count = count + h.get(a[i] - k);
            }
            h.put(a[i], h.getOrDefault(a[i], 0)+1);
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Two(a, k);
        sc.close();
    }
}