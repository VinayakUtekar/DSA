
import java.util.HashSet;
import java.util.Scanner;

public class ArrayIntersection {
    public static void Inter(int [] a1, int [] a2){
        HashSet<Integer> s = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        for(int i : a1) {
            s.add(i);
        }
        for (int i = 0; i < a2.length; i++) {
            if(s.contains(a2[i])){
                res.add(a2[i]);
            }
        }
        for (int i : res) {
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
        int [] a2 = new int[n];
        for(int i=0; i<n2; i++){
            a2[i] = sc.nextInt();
        }
        Inter(a,a2);
        sc.close();
    }
}