import java.util.HashSet;
import java.util.Scanner;

public class DisjointArray{
    public static void Disjoint(int [] a1, int [] a2){
        HashSet<Integer> hs = new HashSet<>();
        boolean re = true;
        for (int i : a1) {
            hs.add(i);
        }
        for (int i : a2) {
            if(hs.contains(i)){
                re = false;
            }
        }
        if(re){
            System.out.println("Disjoint Arrays");
        }
        else{
            System.out.println("Joint Arrays");
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
        Disjoint(a,a2);
        sc.close();
    }
}