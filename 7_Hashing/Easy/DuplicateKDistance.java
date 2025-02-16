import java.util.HashSet;
import java.util.Scanner;

public class DuplicateKDistance {
    public static void Distance(int [] a, int k){
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if(s.contains(a[i])){
                System.out.println("true");
            }
            s.add(a[i]);
            if(i >= k){
                s.remove(a[i-k]);
            }
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
        Distance(a,k);
        sc.close();
    }
}
