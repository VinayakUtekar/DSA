
import java.util.HashSet;
import java.util.Scanner;

public class TwoSum {
    public static void Two(int [] a, int k){
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            int c = a[i] - k;
            if(h.contains(c)){
                System.out.println(true);
            }
            h.add(a[i]);
        }
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