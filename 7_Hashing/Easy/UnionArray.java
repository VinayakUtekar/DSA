
import java.util.HashSet;
import java.util.Scanner;

public class UnionArray {
    public static void Union(int [] a1, int [] a2){
        HashSet<Integer> s = new HashSet<>();
        for(int i : a1) {
            s.add(i);
        }
        for (int i = 0; i < a2.length; i++) {
            if(!s.contains(a2[i])){
                s.add(a2[i]);
            }
        }
        for (int i : s) {
            System.out.println(i);
        }
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
        Union(a,a2);
        sc.close();
    }
}